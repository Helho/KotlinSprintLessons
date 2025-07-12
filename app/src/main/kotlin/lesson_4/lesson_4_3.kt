package lesson_4

fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val favorableConditions = isSunny &&
            isTentOpen &&
            humidity == REQUIRED_HUMIDITY &&
            currentSeason != UNFAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}

const val REQUIRED_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"