package com.example.brunee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val namaUser = intent.getStringExtra("namaLengkap")
        tvNama.text = "Halo ${namaUser ?: "Nazwa"},"

        btnKirim.setOnClickListener {
            // Setelah klik, kembali ke halaman utama (HomeActivity)
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("namaLengkap", namaUser)
            startActivity(intent)
            finish()
        }
    }
}
