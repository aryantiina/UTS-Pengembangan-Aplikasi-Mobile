package com.example.brunee

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvHaloOrder = findViewById<TextView>(R.id.tvHaloOrder)
        val tvPesanan = findViewById<TextView>(R.id.tvPesanan)
        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val btnProfile = findViewById<Button>(R.id.btnProfile)

        // Ambil data dari HomeActivity
        val namaUser = intent.getStringExtra("namaLengkap")
        val pesanan = intent.getStringExtra("pesanan")

        tvHaloOrder.text = "Halo ${namaUser ?: "Nazwa"},"
        tvPesanan.text = "Pesanan saya: ${pesanan ?: "-"}"

        // Navigasi bawah
        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("namaLengkap", namaUser)
            startActivity(intent)
        }

        btnOrder.setOnClickListener {
            Toast.makeText(this, "Kamu sedang di halaman Order", Toast.LENGTH_SHORT).show()
        }

        btnProfile.setOnClickListener {
            Toast.makeText(this, "Halaman Profile belum dibuat", Toast.LENGTH_SHORT).show()
        }
    }
}
