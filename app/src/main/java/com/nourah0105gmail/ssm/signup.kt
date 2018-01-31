package com.nourah0105gmail.ssm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //for button Date Of Birth to move to another actvity
        dob_button.setOnClickListener {
            val i = Intent(this@signup, DOB::class.java)
            startActivity(i)
            finish()
        }
        //for button submit to move to another actvity
        submit_button.setOnClickListener {
            val i = Intent(this@signup, profile::class.java)
            startActivity(i)
            finish()
        }
    }
}
