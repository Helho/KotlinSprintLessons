package lesson_5

fun main() {

    val winningNumbers = List(3) { (0..42).random() }.sorted()

    println("Добро пожаловать в лотерею! Угадайте 3 числа от 0 до 42")
    val userNumbers = mutableListOf<Int>()

    repeat(3) { i ->
        print("Введите ${i + 1} число: ")
        val number = readln().toIntOrNull() ?: -1
        userNumbers.add(number)
    }

    val matchedNumbers = winningNumbers.intersect(userNumbers).toList().sorted()
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!")
        2 -> println("Отличный результат! Вы угадали 2 числа и получаете крупный приз!")
        1 -> println("Вы угадали 1 число и получаете утешительный приз")
        else -> println("К сожалению, вы не угадали ни одного числа")
    }

    println("Выигрышные числа: ${winningNumbers.joinToString()}")
    if (matchCount > 0) {
        println("Вы угадали: ${matchedNumbers.joinToString()}")
    }

}