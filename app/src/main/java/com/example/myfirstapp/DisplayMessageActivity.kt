package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.R.layout.activity_display_message
import android.view.ViewGroup
import android.widget.TextView
import android.content.Intent
import android.view.View

//import kotlinx.android.synthetic.main.activity_main.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.textSize = 40f
        textView.text = message

        val layout = findViewById<View>(R.id.activity_display_message) as ViewGroup
        layout.addView(textView)

    }
}
