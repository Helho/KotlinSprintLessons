package org.example.app.lesson_2

fun main() {

    val crystalWithoutBuff: Int = 7
    val ironWithoutBuff: Int = 11
    val buffPercent: Int = 20

    val crystalBonus: Int = (crystalWithoutBuff * buffPercent) / 100
    val ironBonus: Int = (ironWithoutBuff * buffPercent) / 100

    println("Бонусные кристаллы: $crystalBonus")
    println("Бонусное железо: $ironBonus")

}