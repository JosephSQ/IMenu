package com.example.bitebyte


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegistrarPedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_pedido)

        val etNombre = findViewById<EditText>(R.id.etNombreCliente)
        val spinner = findViewById<Spinner>(R.id.spinnerPlatos)
        val etCantidad = findViewById<EditText>(R.id.etCantidad)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvConfirmacion = findViewById<TextView>(R.id.tvConfirmacion)

        // Lista de platos (puedes expandirla)
        val platos = arrayOf("Lasaña", "Pizza", "Ensalada", "Hamburguesa", "Sopa del día")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, platos)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val plato = spinner.selectedItem.toString()
            val cantidad = etCantidad.text.toString().trim()

            if (nombre.isEmpty() || cantidad.isEmpty()) {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            tvConfirmacion.text = "Pedido registrado:\n$nombre pidió $cantidad x $plato"
        }
    }
}
