package org.example.app.lesson_1

fun main() {

    val numberOfOrders: Int = 75
    var numberOfWorkers: Int = 2000
    val greetingMessage: String = "Thanks for your purchase!"

    //println("Number of workers: $numberOfWorkers")

    numberOfWorkers = 1999
    println("Number of workers: $numberOfWorkers")

    println("Number of orders: $numberOfOrders")
    println(greetingMessage)
}