package lesson_5

fun main() {

    val currentYear = java.time.LocalDate.now().year

    print("Введите ваш год рождения: ")
    val birthYear = readln().toIntOrNull()

    if (birthYear != null) {

        val age = currentYear - birthYear

        if (age >= ADULT_AGE) {
            println("Показать экран со скрытым контентом")
        } else {
            println("Вам ещё нет 18 лет")
        }
    } else {
        println("Некорректный ввод года рождения")
    }
}

const val ADULT_AGE = 18