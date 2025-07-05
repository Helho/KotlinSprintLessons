package org.example.app.lesson_1

fun main() {

    val totalSeconds: Short = 6480
    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR
    val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE
    val formattedTime = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println("Time in space: $formattedTime")

}

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60