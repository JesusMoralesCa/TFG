package com.example.tfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val useremail = LoginActivity.usermail
        Toast.makeText(this, "Bienvenido $useremail", Toast.LENGTH_SHORT).show()
    supportFragmentManager.commit {

        }



    }


    /////CERRAR SESION/////
    fun callSingOut(view: View){
        singOff()
    }
    private fun singOff(){

        FirebaseAuth.getInstance().signOut()
        startActivity(Intent(this, LoginActivity::class.java))
    }



}