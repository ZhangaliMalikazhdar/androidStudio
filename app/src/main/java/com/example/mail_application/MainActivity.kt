package com.example.mail_application

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val userJson = sharedPreferences.getString("user","")
        if(userJson!!.isNotEmpty()){
            val user = Gson().fromJson(userJson,User::class.java)
            Log.d("MainActivity",user.email)
        }
        val user = intent.getParcelableExtra<User>("user")
        if(user!=null){
            Log.d("Username",user.email)
        }//END LOGIN!!!

        val users = ArrayList<User>()
        for (i in 1..100){
            users.add(User("Name"+i,"password"))
        }
        val mailListFragment = MailListFragment(users,this)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = mailListFragment
    }
}