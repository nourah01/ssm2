package com.nourah0105gmail.ssm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//for button guest to move to another actvity
        guest_button.setOnClickListener {
            val i = Intent(this@MainActivity, login::class.java)
            startActivity(i)
            finish()
        }

    }
}
