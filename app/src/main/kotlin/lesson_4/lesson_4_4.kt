package lesson_4

fun main() {

    val trainingDay = 5
    val isArmsAbsDay = trainingDay % 2 == 1 // проверка нечетности

    println("""
        Упражнения для рук:    $isArmsAbsDay
        Упражнения для ног:    ${!isArmsAbsDay}
        Упражнения для спины:  ${!isArmsAbsDay}
        Упражнения для пресса: $isArmsAbsDay
    """.trimIndent())

}