package com.example.buttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn3.setOnClickListener(this)

        btn1.setOnClickListener {

            Toast.makeText(this,"button 1 has been clicked using setOnClicklineer",Toast.LENGTH_LONG).show()

        }

    }

    fun secondButton(view: View) {

        Toast.makeText(this,"button 2 has been clicked using onClick function",Toast.LENGTH_LONG).show()

    }

    override fun onClick(v: View?) {

        Toast.makeText(this,"button 3 has been clicked",Toast.LENGTH_LONG).show()

    }
}