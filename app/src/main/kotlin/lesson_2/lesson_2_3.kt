package org.example.app.lesson_2

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTimeMinutes: Int = 457

    val totalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelTimeMinutes
    val arrivalHour = (totalMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = totalMinutes % MINUTES_IN_HOUR

    println("Поезд прибывает в $arrivalHour:${"%02d".format(arrivalMinute)}")

}

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24