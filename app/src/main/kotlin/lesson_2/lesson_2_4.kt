package org.example.app.lesson_2

fun main() {

    val crystalWithoutBuff: Int = 7
    val ironWithoutBuff: Int = 11
    val buffPercent: Int = 20

    val crystalBonus: Int = (crystalWithoutBuff * buffPercent) / PERCENT_FACTOR
    val ironBonus: Int = (ironWithoutBuff * buffPercent) / PERCENT_FACTOR

    println("Бонусные кристаллы: $crystalBonus")
    println("Бонусное железо: $ironBonus")

}

const val PERCENT_FACTOR: Int = 100