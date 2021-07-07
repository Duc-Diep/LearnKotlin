package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_demo_list_view.*
import java.util.ArrayList

class DemoListView : AppCompatActivity() {
    private lateinit var arrayStudent: ArrayList<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_list_view)
//        var nameArray : ArrayList<String> = ArrayList()
//        nameArray.add("IOS")
//        nameArray.add("Android")
//        nameArray.add("Java")
//        nameArray.add("C#")
//
//        lvName.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nameArray)
        arrayStudent = arrayListOf()
        arrayStudent.add(Student(R.drawable.ic_launcher_background, "Điệp"))
        arrayStudent.add(Student(R.drawable.ic_launcher_background, "Điệp1"))
        arrayStudent.add(Student(R.drawable.ic_launcher_background, "Điệp2"))
        arrayStudent.add(Student(R.drawable.ic_launcher_background, "Điệp3"))
        arrayStudent.add(Student(R.drawable.ic_launcher_background, "Điệp4"))
        lvName.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lvName.setHasFixedSize(true)
        var adapterStudent = StudentAdapter(this, arrayStudent)

        adapterStudent.setOnItemClickListener(object : StudentAdapter.onItemClickListener {
            override fun onItemAvatarClick(student: Student) {
                Toast.makeText(this@DemoListView, "${student.avatar}", Toast.LENGTH_SHORT)
                Log.d("TAG", "onItemNameClick: ${student.avatar}")
            }

            override fun onItemNameClick(student: Student) {
                Toast.makeText(this@DemoListView, "${student.name}", Toast.LENGTH_SHORT)
                Log.d("TAG", "onItemNameClick: ${student.name}")
            }

        })
        lvName.adapter = adapterStudent

    }
}