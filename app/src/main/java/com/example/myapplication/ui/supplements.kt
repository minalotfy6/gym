package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.User
import com.example.myapplication.ui.adapter.customRecycle
import kotlinx.android.synthetic.main.activity_supplements.*

class supplements : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplements)
        var userlist  = ArrayList <User>()
        //var userRecyclerView :UserRecyclerView by lazy { UserRecyclerView(userList) }
        //showData.adapter = userRecyclerView
        var userList :ArrayList<User> = ArrayList()
        userlist.add(User("Amino","price : 500$$" ,R.drawable.amino))
        userlist.add(User("Bcaa","price : 1500$$" ,R.drawable.bcaa))
        userlist.add(User("Pak","price : 590$$" ,R.drawable.pak))
        userlist.add(User("Amino","price : 150$$" ,R.drawable.amino))
        recycler_show.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val customRecycle = customRecycle(userList)
        recycler_show.adapter = customRecycle





    }
}
