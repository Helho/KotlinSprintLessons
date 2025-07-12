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
        bmi < UNDERWEIGHT_THRESHOLD -> "Недостаточная масса тела"
        bmi < NORMAL_WEIGHT_THRESHOLD -> "Нормальная масса тела"
        bmi < OVERWEIGHT_THRESHOLD -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("\nРезультаты:")
    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")

}

const val UNDERWEIGHT_THRESHOLD = 18.5
const val NORMAL_WEIGHT_THRESHOLD = 25.0
const val OVERWEIGHT_THRESHOLD = 30.0
const val CENTIMETERS_IN_METERS = 100