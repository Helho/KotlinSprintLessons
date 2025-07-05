package org.example.app.lesson_1

fun main() {

    val totalSeconds: Short = 6480
    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Time in space: $formattedTime")

}