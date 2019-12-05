package com.example.kotlinproject.intent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.kotlinproject.MainActivity
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn2.setOnClickListener(View.OnClickListener {
            gotoMain()
        })
    }

    fun gotoMain() {
        val gotoFirst = Intent(this@FirstActivity, MainActivity::class.java)
        startActivity(gotoFirst)
    }
}
