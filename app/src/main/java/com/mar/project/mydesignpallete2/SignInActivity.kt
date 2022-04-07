package com.mar.project.mydesignpallete2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnBack: ImageButton = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}