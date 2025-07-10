package lesson_5

fun main() {

    val number1 = (1..10).random()
    val number2 = (1..10).random()
    val correctAnswer = number1 + number2

    println("Докажите, что вы не бот. Решите пример: $number1 + $number2 = ?")
    print("Введите ответ: ")

    val userAnswer = readln().toIntOrNull() ?: 0

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}