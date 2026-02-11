package edu.example.operators

fun main() {
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1.0 / 2.0)
    println(6 * 50)
    println(2.times(3))

    val i = 6
    println(i.toByte())

    val oneMillion = 1_000_000
    println(oneMillion)

    var fish = 1
    fish = 2
    println(fish)

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}