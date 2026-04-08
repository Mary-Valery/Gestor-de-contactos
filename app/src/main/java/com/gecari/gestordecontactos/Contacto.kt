package com.gecari.gestordecontactos

import androidx.compose.remote.creation.first
import kotlin.collections.sorted

data class Contacto(val nombre: String, val telefono: String, val email: String?)

object GestorContactos {
    private val contactos = mutableListOf(
        Contacto("Laura",  "5555555", "laura@gmail.com"),
        Contacto("Sandra", "444444",  null),
        Contacto("Raul",   "222222",  "raul@gmail.com"),
        Contacto("Renata", "6687664", "renata@gmail.com")
    )

    fun buscarPorNombre(nombre: String): Contacto? =
        contactos.firstOrNull { it.nombre == nombre }

    fun listarConEmail(): List<Contacto> =
        contactos.filter { it.email != null }

    fun mostrarContactos(): List<Contacto> =
        contactos.sortedBy { it.nombre }

    fun agregar(contacto: Contacto) =
        contactos.add(contacto)
}












