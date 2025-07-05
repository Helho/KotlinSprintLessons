package org.example.app.lesson_2

fun main() {

    val a = 5
    val b = 7
    val sum = a + b
    val c1 = 888
    val c2: Int

    // println(sum)
    // println(10 / 3)

    val intNum1: Int = 10
    val intNum2: Int = 3
    // println(intNum1 / intNum2)

    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3f
    // println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    // println(doubleNum1 / doubleNum2)

    // инкремент, декремент
    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

    println(counter)

    counter -= 1
    counter--

    // операторы сравнения
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

}