package com.example.testkotlin

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class StudentAdapter(var context: Context,var arrayStudent:ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.StudentHolder>() {

    private lateinit var mListener: onItemClickListener

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener=listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_student,parent,false)
        return StudentHolder(itemView)
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        val currentItem = arrayStudent[position]
        holder.avatar.setImageResource(currentItem.avatar)
        holder.name.text = currentItem.name
        holder.avatar.setOnClickListener(View.OnClickListener {
            mListener.onItemAvatarClick(currentItem)
        })
        holder.name.setOnClickListener{
            mListener.onItemNameClick(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return arrayStudent.size
    }


    class StudentHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val avatar:ImageView = itemView.findViewById(R.id.imgAvatar)
        val name:TextView = itemView.findViewById(R.id.tvName)
    }

    interface onItemClickListener{
        fun onItemAvatarClick(student: Student)
        fun onItemNameClick(student: Student)
    }
}