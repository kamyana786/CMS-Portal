package com.faa.cmsportalcui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AssignWorkerActivity : AppCompatActivity() {
    private lateinit var assignBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assign_worker)
        assignBtn = findViewById(R.id.assign_button)

        assignBtn.setOnClickListener {
            startActivity(Intent(this@AssignWorkerActivity, UnassignedActivity::class.java))
        }

    }
}