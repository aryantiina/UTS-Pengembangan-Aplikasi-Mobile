package com.example.brunee

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val rgMakanan = findViewById<RadioGroup>(R.id.rgMakanan)
        val rbCombro = findViewById<RadioButton>(R.id.rbCombro)
        val rbBatagor = findViewById<RadioButton>(R.id.rbBatagor)

        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val btnProfile = findViewById<Button>(R.id.btnProfile)

        val namaUser = intent.getStringExtra("namaLengkap")
        tvWelcome.text = "Halo ${namaUser ?: "Nazwa"},"

        // Saat user memilih salah satu makanan
        rgMakanan.setOnCheckedChangeListener { _, checkedId ->
            val pesanan = when (checkedId) {
                R.id.rbCombro -> "Combro Bandung"
                R.id.rbBatagor -> "Batagor Bandung"
                else -> ""
            }

            // Kirim data ke OrderActivity (Screen 6)
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("namaLengkap", namaUser)
            intent.putExtra("pesanan", pesanan)
            startActivity(intent)
        }

        // Navigasi bawah
        btnHome.setOnClickListener {
            Toast.makeText(this, "Kamu sudah di halaman Home", Toast.LENGTH_SHORT).show()
        }

        btnOrder.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("namaLengkap", namaUser)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            Toast.makeText(this, "Halaman Profile belum dibuat", Toast.LENGTH_SHORT).show()
        }
    }
}
