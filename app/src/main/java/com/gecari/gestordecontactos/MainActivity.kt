package com.gecari.gestordecontactos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val resultado = GestorContactos.buscarPorNombre("Sandra")
        resultado?.let {
            println("Encontrado: ${it.nombre}, ${it.telefono}, ${it.email ?: "sin email"}")
        } ?: println("Contacto no encontrado")

        val emails = GestorContactos.listarConEmail()
        println(emails)

        println(GestorContactos.mostrarContactos())




    }
    }