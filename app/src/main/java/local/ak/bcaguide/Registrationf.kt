package local.ak.bcaguide

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import soup.neumorphism.NeumorphButton


class Registrationf : AppCompatActivity() {
    var firebaseAuth : FirebaseAuth?=null
    var progressbar : ProgressDialog?=null

  lateinit var uname: String
  lateinit var  uemail: String
  lateinit var  uphone : String


  var newuser : EditText?=null
  var newpass : EditText?=null
  var newphone : EditText?=null


    private  var firebaseStorage : FirebaseStorage?=null
    private var storageReference : StorageReference?=null

    lateinit var databaseReference: DatabaseReference

    var register : NeumorphButton?=null
    var reset : NeumorphButton?=null

    var name : EditText?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrationf)

        progressbar = ProgressDialog(this)


        newpass = findViewById(R.id.newpass)
        name = findViewById(R.id.name)
        newphone = findViewById(R.id.newphone)
        newuser = findViewById(R.id.newuser)

        firebaseAuth = FirebaseAuth.getInstance()
        firebaseStorage = FirebaseStorage.getInstance()
        storageReference = FirebaseStorage.getInstance().reference

        register = findViewById(R.id.register)

        reset = findViewById(R.id.resetfield)





        register?.setOnClickListener{
            registernow()

        }
        reset?.setOnClickListener {
            reset()
        }





    }

    override fun onBackPressed() {
        startActivity(Intent(this, Loginf::class.java))
        super.onBackPressed()
    }

    fun registernow(){
        progressbar?.setMessage("Please Wait")
        progressbar?.show()
        val e = newuser?.text.toString()
        val p = newpass?.text.toString()


        uname = name?.text.toString()
        uemail = newuser?.text.toString()
        uphone = newphone?.text.toString()

        if(e.isEmpty()|| p.isEmpty() || uname.isEmpty() || uemail.isEmpty()|| uphone.isEmpty()){
            progressbar?.dismiss()
            Toast.makeText(this,"Please fill Fields",Toast.LENGTH_SHORT).show()

        }
        else{
            progressbar?.dismiss()
            firebaseAuth!!.createUserWithEmailAndPassword(e,p).addOnCompleteListener{
               if(it.isSuccessful){
                   mailAuthentication()
                    sendData()


               }
                else{
                   Toast.makeText(this,"Try Again!",Toast.LENGTH_SHORT).show()

               }
            }

        }
    }

 fun reset()
 {
     name?.text = null
     newuser?.text = null
     newpass?.text = null
     newphone?.text= null

 }

    fun mailAuthentication(){

        val auth = firebaseAuth?.currentUser
        auth?.sendEmailVerification()?.addOnCompleteListener{ task ->
            if(task.isSuccessful){
                Toast.makeText(this,"Verification Mail sent. Please verify",Toast.LENGTH_SHORT).show()
                firebaseAuth?.signOut()
                Toast.makeText(this,"Account created Successfully",Toast.LENGTH_SHORT).show()
                    reset()



            }
            else{
                Toast.makeText(this,"Something wrong",Toast.LENGTH_SHORT).show()

            }
            startActivity(Intent(this, Loginf::class.java))
            this.finish()

        }

    }



    private fun sendData(){



        name = findViewById(R.id.name)
        newphone = findViewById(R.id.newphone)
        newuser = findViewById(R.id.newuser)



        uname = name!!.text.toString()
        uemail = newuser!!.text.toString()
        uphone = newphone!!.text.toString()


        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        val userProfile = User(uname,uemail,uphone)
        val userid = FirebaseAuth.getInstance().currentUser?.uid
        databaseReference.child(userid!!).setValue(userProfile)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d("Firebase", "User data saved successfully")
                } else {
                    Log.e("Firebase", "Error saving user data", task.exception)
                }
            }

        Log.d("UserData", "Name: $uname, Email: $uemail, Phone: $uphone")

    }




}