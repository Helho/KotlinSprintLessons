package org.example.app
fun main() {

    var numberOfOrders: Int = 42
    val welcomeMessage: String = "Столько у тебя смешнявок:"

    // ptintln(numberOfOrders)
    println(welcomeMessage)

    numberOfOrders = 52
    println(numberOfOrders)

    // const val - константа

    // целочисленные
    val intNum1: Int = 1234567890 // 32 bit
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 1234567890u // 32 bit

    // вещественнные
    val doubleNum: Double = 123.45 // 64 bit
    val floatNum: Float = 123.4f // 32 bit

    // строковые
    val stringValue: String = "haha hehe hihi"
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}
