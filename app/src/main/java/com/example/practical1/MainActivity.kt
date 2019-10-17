package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    // onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)

        //TODO : Continue here
        //Java int x ; vs Kotlin var x : Int
        //val = value and var = variable
        //findViewById
        val buttonDunClickMe : Button = findViewById(R.id.buttonDunClickMe)
        buttonDunClickMe.setOnClickListener{ showMessage() }
    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_msg))
    }
}
