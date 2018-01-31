package com.nourah0105gmail.ssm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dob.*
import kotlinx.android.synthetic.main.activity_signup.*

class DOB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dob)

        //for button Date Of Birth to move to another actvity
done_button.setOnClickListener {
            val i = Intent(this@DOB, signup::class.java)
            startActivity(i)
            finish()
        }
    }
}
