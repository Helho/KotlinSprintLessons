package lesson_5

fun main() {

    println("Калькулятор стоимости топлива для поездки")
    print("Введите расстояние поездки (км): ")
    val distance = readln().toDouble()
    print("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readln().toDouble()
    print("Введите цену за литр топлива: ")
    val pricePerLiter = readln().toDouble()

    val fuelRequired = (distance * fuelConsumption) / CONSUMPTION_BASE_DISTANCE

    val totalCost = fuelRequired * pricePerLiter

    println("\nРезультаты расчета:")
    println("Необходимое количество топлива: ${"%.2f".format(fuelRequired)} л")
    println("Общая стоимость поездки: ${"%.2f".format(totalCost)} руб.")

}

const val CONSUMPTION_BASE_DISTANCE = 100