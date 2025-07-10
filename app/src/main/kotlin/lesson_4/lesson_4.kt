package org.example.app.lesson_4

fun main() {

    // логические операторы
    // сравнительные операторы

    val a = 1 + 1
    val b = (1 == 1)

    // <,>,>=, <=, ==, !=, ===. !==
    // true, false
    // &&, ||, !

    val userAge = 42
    val comparisonResult: Boolean = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
    println("Result is: $comparisonResult")
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65
