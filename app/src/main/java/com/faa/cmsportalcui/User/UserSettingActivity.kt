package com.faa.cmsportalcui.User

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.faa.cmsportalcui.R

class UserSettingActivity : AppCompatActivity() {
    private lateinit var logoutBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_setting)
        logoutBtn = findViewById(R.id.button_logout)

        logoutBtn.setOnClickListener {
            startActivity(Intent(this@UserSettingActivity, UserFeedbackActivity::class.java))
        }

    }
}