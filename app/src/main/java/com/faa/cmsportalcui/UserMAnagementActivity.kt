package com.faa.cmsportalcui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserMAnagementActivity : AppCompatActivity() {
    private lateinit var addUserBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_management)
        addUserBtn = findViewById(R.id.btnAddUser)

        addUserBtn.setOnClickListener {
            startActivity(Intent(this@UserMAnagementActivity, MaintananceActivity::class.java))
        }

    }
}