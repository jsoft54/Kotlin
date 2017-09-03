package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    companion object {
    const val EXTRA_MESSAGE: String = "2"
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user clicks the Send button  */
    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<View>(R.id.edit_message) as EditText
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

}
