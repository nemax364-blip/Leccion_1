package edu.example.ejercicio_complementario_L1

fun main() {
    val nombre = "Diego Aguilar"
    var edad = 30
    val email: String? = "nemax364@gmail.com"
    val estadoSuscripcion = true

    if (esMayorDeEdad(edad)) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }

    println("Email: ${email ?: "Email no registrado"}")

    val usuarios = mutableListOf("Ana", "Pedro", "Luis")
    for (usuario in usuarios) {
        println("- $usuario")
    }

    edad = (1..80).random()

    val clasificacion = when {
        edad < 13 -> "Niño"
        edad in 13..17 -> "Adolescente"
        edad in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }
    println("Edad generada: $edad. Clasificación: $clasificacion")

    println("Nombre: $nombre, Suscrito: $estadoSuscripcion")
}

fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}