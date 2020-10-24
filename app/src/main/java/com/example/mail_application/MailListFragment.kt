package com.example.mail_application

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.LayoutInflaterFactory
import androidx.recyclerview.widget.RecyclerView

class MailListFragment(val users:ArrayList<User>,val context: Context)
    :RecyclerView.Adapter<MailListFragment.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent,false)
        Log.e("MailListFragment","onCreateViewHolder")
        return MyViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = users.get(position)
        holder.nameText.text = user.email
        //holder.descriptionText.text = user.email
        Log.e("MailListFragment","onBindViewHolder")
    }

    override fun getItemCount(): Int {
        return users.size
    }
    class MyViewHolder(view: View,context: Context):RecyclerView.ViewHolder(view) {
        var nameText: TextView = view.findViewById(R.id.nameMail)
        var descriptionText: TextView = view.findViewById(R.id.descriptionMail)
 //       val mailDetailFragment = MailDetailFragment()
        init {
            view.setOnClickListener {
                descriptionText.text = "There is description of "+nameText.text.toString()
            }
        }
    }
}