package com.example.touradvisor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            val intent = Intent(this@MainActivity, WelcomeScreenActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)

    }
}