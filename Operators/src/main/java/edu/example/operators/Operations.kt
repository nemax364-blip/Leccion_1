package edu.example.operators

fun main() {

    println(" Matemáticas" )
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1 / 2)
    println(1.0 / 2.0)
    println(6 * 50)


    println(" Métodos")
    val numero = 2
    println(numero.times(3))


    println("Conversiones")
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val oneMillion = 1_000_000
    println(oneMillion)


    var fish = 1
    fish = 2
    println("Peces: $fish")

    val aquarium = 1

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}