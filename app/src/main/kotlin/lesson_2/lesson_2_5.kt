package org.example.app.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70_000.0
    val annualRate = 16.7 / 100
    val years = 20

    val finalAmount = initialAmount * (1 + annualRate).pow(years.toDouble())

    println("Сумма вклада через $years лет: %.3f".format(finalAmount))

}