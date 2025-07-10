package lesson_4

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < TOTAL_TABLES
    val availableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня: $availableToday,\nДоступность столиков на завтра: $availableTomorrow")

}

const val TOTAL_TABLES = 13