package com.example.testkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a:Int = 0;
    var b:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener(View.OnClickListener {
            a = edtNumber1.text.toString().toInt();
            b = edtNumber2.text.toString().toInt();
            var sum:Int = a+b;
            tvResult.text = sum.toString();
        })
        btnMul.setOnClickListener(View.OnClickListener {
            a = edtNumber1.text.toString().toInt();
            b = edtNumber2.text.toString().toInt();
            var sum:Int = a*b;
            tvResult.text = sum.toString();
        })
        btnSub.setOnClickListener(View.OnClickListener {
            a = edtNumber1.text.toString().toInt();
            b = edtNumber2.text.toString().toInt();
            var sum:Int = a-b;
            tvResult.text = sum.toString();
        })
        btnDiv.setOnClickListener(View.OnClickListener {
            a = edtNumber1.text.toString().toInt();
            b = edtNumber2.text.toString().toInt();
            var sum:Double = a*0.1/b;
            var format:String = String.format("%.2f",sum);
            tvResult.text = format
        })

        btnListView.setOnClickListener(View.OnClickListener {
            var intent:Intent = Intent(applicationContext,DemoListView::class.java)//this@MainActivity
            startActivity(intent)
            finish()
        })
    }
}

