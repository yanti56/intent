package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_intent2.*

class intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getIntExtra("nilai", 0)

        val ket : String
        if (nilai >=80) {
            ket = "A"
        } else if (nilai >=60) {
            ket = "B"
        }else if (nilai >=40){
            ket ="C"

       }else if (nilai >=20){
            ket ="D"
        }else if (nilai >=0){
            ket = "E"
        }
        else if(nilai >=100){
            ket = "Anda salah menginputkan nilai"
        } else{
            ket = "Anda salah menginputkan nilai"
        }
        val jumlah = findViewById<TextView>(R.id.jumlah)
        jumlah.text = "nim: "+nim+"\nnama : "+nama+"\nnilai : "+nilai+"\nKeterangan : "+ket
    }
}
