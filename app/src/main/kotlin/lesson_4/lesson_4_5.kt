package lesson_4

fun main() {

    print("Есть ли повреждения корпуса (true/false): ")
    val isDamaged = readln().toBoolean()
    print("Численность экипажа: ")
    val crewCount = readln().toInt()
    print("Количество ящиков провизии: ")
    val foodSupply = readln().toInt()
    print("Погода благоприятна (true/false): ")
    val isWeatherFavorable = readln().toBoolean()

    val canSail = (!isDamaged &&
            crewCount in 55..70 &&
            foodSupply > 50 &&
            true) ||
            (isDamaged &&
                    crewCount == 70 &&
                    isWeatherFavorable &&
                    foodSupply >= 50)

    println("Корабль может отправиться в плавание: $canSail")

}