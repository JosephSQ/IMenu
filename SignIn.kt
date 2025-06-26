package com.example.bitebyte


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.R


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val signIn = findViewById<Button>(R.id.btnSignIn)

        signIn.setOnClickListener {
            val userEmail = email.text.toString()
            val userPass = password.text.toString()

            if (userEmail.isEmpty() || userPass.isEmpty()) {
                Toast.makeText(this, "Completa los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        findViewById<ImageView>(R.id.btnFacebook).setOnClickListener {
            openUrl("https://www.facebook.com/")
        }

        findViewById<ImageView>(R.id.btnInstagram).setOnClickListener {
            openUrl("https://www.instagram.com/")
        }

        findViewById<ImageView>(R.id.btnTwitter).setOnClickListener {
            openUrl("https://www.twitter.com/")
        }

        findViewById<ImageView>(R.id.btnGoogle).setOnClickListener {
            openUrl("https://www.google.com/")
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
