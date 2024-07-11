package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var btnAdd :Button
    private  lateinit var btnSub :Button
    private  lateinit var btnMul :Button
    private  lateinit var btnDiv :Button
    private  lateinit var edtA :EditText
    private  lateinit var edtB :EditText
    private  lateinit var textResult :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtA.findViewById<View>(R.id.edit_text_a)
        edtB.findViewById<View>(R.id.edit_text_b)
        textResult.findViewById<View>(R.id.textResult)
        btnAdd.findViewById<View>(R.id.button_add).setOnClickListener(this)
        btnSub.findViewById<View>(R.id.button_substract).setOnClickListener(this)
        btnMul.findViewById<View>(R.id.button_multi).setOnClickListener(this)
        btnDiv.findViewById<View>(R.id.button_divide).setOnClickListener(this)


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
        textResult.setText("Result is  $result")

    }
}