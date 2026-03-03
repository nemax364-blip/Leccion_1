package edu.example.nullability

fun main() {
    var marbles: Int? = null
    println(marbles)

    var fishFoodTreats: Int? = 6

    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println(fishFoodTreats)

    fishFoodTreats = fishFoodTreats?.dec()
    println(fishFoodTreats)

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

    val s: String? = "Kotlin"
    val len = s!!.length
    println(len)
}