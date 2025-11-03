package com.example.brunee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        //val btnToRegister = findViewById<Button>(R.id.btnToRegister)

        // Tombol Login
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Isi semua field terlebih dahulu", Toast.LENGTH_SHORT).show()
            }
        }

        }
    }

