package com.example.poetryactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

private lateinit var random_textview: TextView
lateinit var myObserver: MyObserver
private lateinit var editorText:EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myObserver = MyObserver()
        lifecycle.addObserver(myObserver)

        random_textview = findViewById(R.id.random1)
        editorText = findViewById(R.id.editor)
    }

    fun randomMe(view: View) {
        try {
            // Create an Intent to start the second activity
            val randomIntent = Intent(this, MainActivity2::class.java)

            var count = Integer.parseInt(random_textview.text.toString())
            randomIntent.putExtra("total_count", count)

            // Start the new activity.
            startActivity(randomIntent)
        } catch (e: Throwable) {
            val myToast = Toast.makeText(this, e.localizedMessage, Toast.LENGTH_LONG)
            myToast.show()
            random_textview.text = "0"
        }

    }

    fun countMe_ButtonClick(view: android.view.View) {
        try {
            var counter: Int = Integer.parseInt(random_textview.text.toString())

            counter++

            random_textview.text = counter.toString()
        } catch (e: Throwable) {
            val myToast = Toast.makeText(this, e.localizedMessage, Toast.LENGTH_LONG)
            myToast.show()
            random_textview.text = "0"
        }
    }

    fun changeText_ButtonClick(view: android.view.View) {
        random_textview.text = editorText.text
    }

}

class MyObserver : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun myFun(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("TAG", event.toString())
    }
}