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
            crewCount in MIN_CREW..MAX_CREW &&
            foodSupply > MIN_FOOD_NO_DAMAGE) ||
            (isDamaged &&
                    crewCount == REQUIRED_CREW_WITH_DAMAGE &&
                    isWeatherFavorable &&
                    foodSupply >= MIN_FOOD_WITH_DAMAGE)
            println("Корабль может отправиться в плавание: $canSail")

}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_NO_DAMAGE = 50
const val MIN_FOOD_WITH_DAMAGE = 50
const val REQUIRED_CREW_WITH_DAMAGE = 70