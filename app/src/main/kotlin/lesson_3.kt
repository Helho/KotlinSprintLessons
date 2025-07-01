package org.example.app

fun main() {

    val greeting = "Привет"
    val space = ' '
    val userName = "Helho"

    // конкатенация строк
//    println(greeting + ", " + userName + "!" + space + "Вопросы?))")

    // интерполяция строк
//    println("$greeting, $userName! Вопросы?))")
//    println("У тебя ${40 + 5} смешнявок")

    val  multiString = """
                 |хихихи
                          |хахаха
          |хохохо
    """.trimMargin()
//    println(multiString)

    val phrase = "Он сказал - \"это прекрасно!\""
    println(phrase)


}