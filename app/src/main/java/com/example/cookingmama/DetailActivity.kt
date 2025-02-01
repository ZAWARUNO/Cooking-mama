package com.example.cookingmama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnBack: ImageView = findViewById(R.id.btnBack)

        val gambarResep: ImageView = findViewById(R.id.gambarResep)
        val namaResep: TextView = findViewById(R.id.namaResep)
        val deskripsiResep: TextView = findViewById(R.id.deskripsiResep)

        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val idGambar = intent.getIntExtra("idGambar", 0)

        btnBack.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
        gambarResep.setImageResource(idGambar)
        namaResep.text = nama
        deskripsiResep.text = deskripsi
    }
}