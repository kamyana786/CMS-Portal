package com.faa.cmsportalcui.Admin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.faa.cmsportalcui.R

class UnassignedActivity : AppCompatActivity() {
    private lateinit var textBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unassigned)
        textBtn = findViewById(R.id.textView2)

        textBtn.setOnClickListener {
            startActivity(Intent(this@UnassignedActivity, StaffActivity::class.java))
        }
    }
}