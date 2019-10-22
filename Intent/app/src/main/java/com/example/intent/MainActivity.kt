package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import.androidx.app.AppCompatActivity
import.android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity() {

    val id:Int = 10
    val language:String="kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //Button untuk mengirimkan data ke Activitykedua.kt
        btn_klik.setOnClickListener()
        intent = Intent(this, ActivityKedua::class.java)
        intent.putExtra("id_value",id)
        intent.putExtra("language_value",language)
        startActivity(intent)
    }
}
