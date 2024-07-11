package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnAdd :Button
    lateinit var btnSub :Button
    lateinit var btnMul :Button
    lateinit var btnDiv :Button
    lateinit var edtA :EditText
    lateinit var edtB :EditText
    lateinit var textResult :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtA = findViewById(R.id.edit_text_a)
        edtB = findViewById(R.id.edit_text_b)
        textResult = findViewById(R.id.textResult)
        btnAdd = findViewById(R.id.button_add)
        btnSub = findViewById(R.id.button_substract)
        btnMul = findViewById(R.id.button_multi)
        btnDiv = findViewById(R.id.button_divide)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnMul.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        var number_a = edtA.text.toString().toDouble()
        var number_b = edtB.text.toString().toDouble()
        var result = 0.0
        when (v?.id){
            R.id.button_add->{
                result = number_a + number_b
            }
            R.id.button_substract->{
                result = number_a - number_b
            }
            R.id.button_multi->{
                result = number_a * number_b
            }
            R.id.button_divide->{
                result = number_a / number_b
            }
        }
        textResult.text = "Result is  $result"

    }
}