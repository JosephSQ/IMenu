package com.example.bitebyte

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class EntregaPlatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrega_plato)

        val tvEstado = findViewById<TextView>(R.id.tvEstado)
        val btnEntregar = findViewById<Button>(R.id.btnEntregar)

        btnEntregar.setOnClickListener {
            tvEstado.text = "Estado: Entregado"
            tvEstado.setTextColor(getColor(R.color.001f))
            Toast.makeText(this, "¡Plato entregado!", Toast.LENGTH_SHORT).show()
            btnEntregar.isEnabled = false
        }
    }
}