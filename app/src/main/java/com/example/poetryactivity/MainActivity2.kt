package com.example.poetryactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

private lateinit var textViewHeader:TextView
private lateinit var textViewRandom:TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textViewHeader = findViewById(R.id.textview_header)
        textViewRandom = findViewById(R.id.textview_random)

        showRandom()
    }

    fun showRandom(){
        var count = intent.getIntExtra("total_count",0)

        val random = Random()
        var randomInt = 0

        if(count > 0)
            randomInt = random.nextInt(count)

        textViewRandom.text = randomInt.toString()

        textViewHeader.text = "Ща буит рандом!"
    }
}