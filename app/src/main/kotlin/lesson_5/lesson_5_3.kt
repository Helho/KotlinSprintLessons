package lesson_5

import kotlin.random.Random

fun main() {

    val secretNumber1 = Random.nextInt(0, 43)
    val secretNumber2 = Random.nextInt(0, 43)

    println("Угадайте два числа от 0 до 42 и выиграйте приз!")
    print("Введите первое число: ")
    val userNumber1 = readln().toIntOrNull() ?: -1
    print("Введите второе число: ")
    val userNumber2 = readln().toIntOrNull() ?: -1

    val guessedBoth = (userNumber1 == secretNumber1 && userNumber2 == secretNumber2) ||
            (userNumber1 == secretNumber2 && userNumber2 == secretNumber1)

    val guessedOne = (userNumber1 == secretNumber1 || userNumber1 == secretNumber2) ||
            (userNumber2 == secretNumber1 || userNumber2 == secretNumber2)

    when {
        guessedBoth -> println("Поздравляем! Вы выиграли главный приз!")
        guessedOne -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Для победы нужно было угадать: $secretNumber1 и $secretNumber2")

}