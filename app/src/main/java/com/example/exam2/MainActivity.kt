package com.example.exam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add = findViewById<Button>(R.id.add)
        add.setOnClickListener { addInList() }

    }

    fun addInList(){
        class User(firstName:String, lastName:String, age:String, email:String){
        }
        val firstName = findViewById<EditText>(R.id.firstname).text
        val lastName = findViewById<EditText>(R.id.lastname).text
        val age = findViewById<EditText>(R.id.age).text
        val email = findViewById<EditText>(R.id.emailname).text

        val user1 = User(firstName,lastName, age, email )
        val userList:MutableList<Any> = mutableListOf()
        if(userList.contains(user1)){
            Toast.makeText(this, "user already exists", Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(this, "added successfully", Toast.LENGTH_SHORT).show()
            userList +=user1

        }


    }


}