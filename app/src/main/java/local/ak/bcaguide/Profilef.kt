package local.ak.bcaguide

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import local.ak.bcaguide.main.Home
import local.ak.bcaguide.utils.NetworkUtils
import soup.neumorphism.NeumorphButton







class Profilef : AppCompatActivity(){

    lateinit var pname:TextView
   lateinit var pemail:TextView
    lateinit var pphone:TextView

    var back : NeumorphButton?=null
    var firebaseAuth : FirebaseAuth?= null
    var firebaseStorage : FirebaseStorage?=null
    var progressbar : ProgressDialog?=null




    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilef)




        pname = findViewById(R.id.pname)
        pemail = findViewById(R.id.pemail)
        pphone = findViewById(R.id.pphone)
        back = findViewById(R.id.back)

        back?.setOnClickListener {

            startActivity(Intent(this, Home::class.java))
            this.finish()
        }

        firebaseAuth = FirebaseAuth.getInstance()
        firebaseStorage = FirebaseStorage.getInstance()


        val isOnine = NetworkUtils.isConnectedToInternet(this)
        if(!isOnine){
            Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show()
        }

        progressbar = ProgressDialog(this)
        progressbar?.setMessage("Please wait...")
        progressbar?.setCancelable(false)
        progressbar?.show()

        val databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        val userid = FirebaseAuth.getInstance().currentUser?.uid


        if (userid == null) {
            progressbar?.dismiss()
            Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show()
            return
        }

        databaseReference.child(userid!!).get().addOnSuccessListener {

            if (it.exists()) {
                progressbar?.dismiss()

                // Try to get data from the "name", "email", "phone" fields
                var name = it.child("name").value
                var email = it.child("email").value
                var phone = it.child("phone").value

                // If data does not exist in "name", "email", "phone", check "a", "b", "c" fields
                if (name == null || email == null || phone == null) {

                    name = it.child("a").value
                    email = it.child("b").value
                    phone = it.child("c").value


                }
                pname.text = "Name: $name"
                pemail.text = "Email: $email"
                pphone.text = "Phone: $phone"


            } else {
                Toast.makeText(this, "User doesn't exists", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            progressbar?.dismiss()
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()

        }



    }

}




