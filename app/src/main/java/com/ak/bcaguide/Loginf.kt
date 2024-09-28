package com.ak.bcaguide

import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth
import soup.neumorphism.NeumorphButton


class Loginf : AppCompatActivity() {

    var email: EditText? = null
    var pass : EditText? = null
    lateinit var btn : Button
    var firebaseAuth : FirebaseAuth?=null
    var progressbar : ProgressDialog?=null
    var forget : NeumorphButton?=null


    internal lateinit var singinbtn: SignInButton
    private var RC_SIGN_IN =1
    private var googleApiClient : GoogleApiClient?=null

    var createuser : NeumorphButton?=null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainf)



        email = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        btn= findViewById(R.id.signin)

        firebaseAuth = FirebaseAuth.getInstance()
        progressbar = ProgressDialog(this)
        forget  = findViewById(R.id.forget)
        createuser = findViewById(R.id.createuser)


        email?.setOnClickListener {
            email?.setHintTextColor(Color.BLACK)
            pass?.setHintTextColor(Color.BLACK)
        }

        btn.setOnClickListener {
            if(validate()){
                startActivity(Intent(this,Home::class.java))
                Animatoo.animateShrink(this)
                this.finish()
            }else{
            val user = FirebaseAuth.getInstance().currentUser
            user?.sendEmailVerification()?.addOnCompleteListener { task->
                if(task.isSuccessful) {
                    Toast.makeText(
                        this,
                        "Verification Mail sent. Please verify",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else{

                    Toast.makeText(this,"Something went wrong!",Toast.LENGTH_SHORT).show()

                }
                }
            }


        }

        forget?.setOnClickListener{
            startActivity(Intent(this, ForgetPasswordf::class.java))
            Animatoo.animateShrink(this)
            this.finish()
        }

        // This will save your user id so that u don't login you ID
        val user = firebaseAuth?.currentUser
        if(user!=null){
            startActivity(Intent(this, Home::class.java))
            Animatoo.animateShrink(this)
            this.finish()
        }



        // Create User
        createuser?.setOnClickListener {
            startActivity(Intent(this, Registrationf::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }






    }





    fun validate() : Boolean {
        val E = email?.text.toString()
        val P = pass?.text.toString()

        var Found : Boolean = false

        progressbar?.setMessage("Please Wait")
        progressbar?.show()


        if(E.isEmpty() || P.isEmpty()){
            progressbar?.dismiss()
            email?.setHintTextColor(Color.RED)
            pass?.setHintTextColor(Color.RED)
            Toast.makeText(this,"Fill the Necessary Detail",Toast.LENGTH_SHORT).show()

            Found = false

        }
        else{
            firebaseAuth!!.signInWithEmailAndPassword(E,P).addOnCompleteListener{task ->
                progressbar?.dismiss()
                if(task.isSuccessful){
                    verifyemail()
                }
                else{
                        Found = false
                    Toast.makeText(this,"User not found",Toast.LENGTH_SHORT).show()

                }
            }

        }

        return Found
    }

    fun verifyemail(){
        val user = FirebaseAuth.getInstance().currentUser
        val vmail = user?.isEmailVerified


        if(vmail == true ){
            Toast.makeText(this,"Successfully Logged In",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Home::class.java))
            Animatoo.animateShrink(this)

        }
        else
        {
            Toast.makeText(this, "Please verify email", Toast.LENGTH_SHORT).show()
            sendverificationmail()
            firebaseAuth?.signOut()




        }

    }

    fun sendverificationmail(){

        val user = FirebaseAuth.getInstance().currentUser
        user?.sendEmailVerification()?.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Toast.makeText(
                    this,
                    "Verification Mail sent. Please verify",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

    }


}