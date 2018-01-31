package com.nourah0105gmail.ssm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //for button sign up to move to another actvity
        signup_button.setOnClickListener {
            val i = Intent(this@login, signup::class.java)
            startActivity(i)
            finish()
        }
    }

}
