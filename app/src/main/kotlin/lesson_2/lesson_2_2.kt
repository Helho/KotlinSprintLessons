package org.example.app.lesson_2

fun main() {
    
    val permanentEmployees = 50
    val salaryOfPermanent = 30000
    val trainees = 30
    val salaryOfTrainees = 20000
    val fixedCosts: Int = permanentEmployees * salaryOfPermanent
    val generalExpenses: Int = fixedCosts + (trainees * salaryOfTrainees)
    val averageSalary: Int = generalExpenses / (permanentEmployees + trainees)
    
    println("Расходы на постоянных сотрудников: $fixedCosts руб.")
    println("Общие расходы по ЗП: $generalExpenses руб.")
    println("Средняя ЗП одного сотрудника: $averageSalary руб.")
}


