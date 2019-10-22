package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Nim = findViewById<EditText>(R.id.nim)
        val Nama = findViewById<EditText> (R.id.nama)
        val Nilai  = findViewById<EditText> (R.id.nilai)


        button.setOnClickListener(){
            val nim = Nim.text.toString()
            val nama = Nama.text.toString()
            val nilai : Int = Integer.parseInt(Nilai.text.toString())
            val intent = Intent (this@MainActivity,intent2::class.java)
            intent.putExtra("nim",nim)
            intent.putExtra("nama",nama)
            intent.putExtra("nilai",nilai)

            startActivity(intent)

        }
    }
}
