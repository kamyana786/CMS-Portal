package com.faa.cmsportalcui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var googleBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        googleBtn = findViewById(R.id.btn_google)
        googleBtn.setOnClickListener {
            startActivity(Intent(this@LoginActivity, AdminDashboardActivity::class.java))
        }

    }
}