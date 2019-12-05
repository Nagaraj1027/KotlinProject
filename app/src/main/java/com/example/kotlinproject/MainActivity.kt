package com.example.kotlinproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinproject.intent.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val name: String = "Hyderabad"
    var name2: String = "Hyderabad"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener(View.OnClickListener {
            gotoFirst()
        })
    }

    fun gotoFirst() {

       // name = "Chennai"  //Val cannot re_assigned
        name2 = "Chennai"  //Var can be re_assigned

        val gotoFirst = Intent(this@MainActivity, FirstActivity::class.java)
        startActivity(gotoFirst)
    }
}
