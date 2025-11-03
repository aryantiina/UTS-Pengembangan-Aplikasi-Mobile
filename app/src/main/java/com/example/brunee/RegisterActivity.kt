package com.example.brunee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Isi semua field", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
