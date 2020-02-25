package com.sheba.simplerecyclerviewwithkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sheba.simplerecyclerviewwithkotlin.adapter.SimpleCustomAdapter
import com.sheba.simplerecyclerviewwithkotlin.model.User

class MainActivity : AppCompatActivity() {

    val users = ArrayList<User>()
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adddata()
        val rvMain = findViewById<RecyclerView>(R.id.rvMain)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val adapter = SimpleCustomAdapter(users)
        rvMain.adapter = adapter
    }

    private fun adddata() {

        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("Shahadat","Dhaka"))
        users.add(User("শাহাদাত হুসাইন","ঢাকা"))
    }


}
