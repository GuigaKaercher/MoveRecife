package com.example.moverecife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

    private lateinit var startButton: Button
    private lateinit var logoutButton: Button
    private lateinit var welcomeMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val username = intent.getStringExtra("USERNAME")


        startButton = findViewById(R.id.start_button)
        logoutButton = findViewById(R.id.logout_button)
        welcomeMessage = findViewById(R.id.welcome_message)


        welcomeMessage.text = "Bem-vindo, $username!"


        startButton.setOnClickListener {
            Toast.makeText(this, "Iniciando atividade física...", Toast.LENGTH_SHORT).show()
        }


        logoutButton.setOnClickListener {
            finish()
        }
    }
}
