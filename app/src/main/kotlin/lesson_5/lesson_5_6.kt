package lesson_5

fun main() {

    println("Калькулятор индекса массы тела (ИМТ)")
    print("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()
    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CENTIMETERS_IN_METERS

    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("\nРезультаты:")
    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")

}

const val CENTIMETERS_IN_METERS = 100