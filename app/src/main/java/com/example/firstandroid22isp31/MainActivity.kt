package com.example.firstandroid22isp31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var firstNumber:EditText
    private lateinit var secondNumber:EditText
    private lateinit var buttonOK:Button
    private lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNumber=findViewById(R.id.first)
        secondNumber=findViewById(R.id.second)
        buttonOK=findViewById(R.id.buttonOk)
        result=findViewById(R.id.result)
        buttonOK.setOnClickListener {
            var first:Double=firstNumber.text.toString().toDouble()
            var second:Double=secondNumber.text.toString().toDouble()
            result.setText("$first+$second=${first+second}")
        }
    }
}