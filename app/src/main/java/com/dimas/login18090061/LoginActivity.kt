package com.dimas.login18090061

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() , View.OnClickListener {
    private  lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnIntent = findViewById(R.id.backlogin)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.backlogin -> run {
                val intenBiasa = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intenBiasa)
            }
        }
    }
}