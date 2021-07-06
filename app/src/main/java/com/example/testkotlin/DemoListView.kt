package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_demo_list_view.*
import java.util.ArrayList

class DemoListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_list_view)
        var nameArray : ArrayList<String> = ArrayList()
        nameArray.add("IOS")
        nameArray.add("Android")
        nameArray.add("Java")
        nameArray.add("C#")

        lvName.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameArray)
    }
}