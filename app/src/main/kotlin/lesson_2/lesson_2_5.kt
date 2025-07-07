package org.example.app.lesson_2

import java.util.Locale
import kotlin.math.pow

fun main() {

    val initialAmount = 70_000.0
    val annualRate = 16.7
    val percentageBase = annualRate / PERCENT_FACTOR
    val years = 20

    val finalAmount = initialAmount * (1 + percentageBase).pow(years.toDouble())

    println("Сумма вклада через $years лет: %.3f".format(Locale.US, finalAmount))

}
