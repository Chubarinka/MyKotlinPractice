package org.example.practice1_variables

fun main() {

    var ordersCount: Int = 75
    val thankMessage: String = "Спасибо, что выбираете нас!"

    println("Интернет-магазин:")
    println("Колличество заказов: $ordersCount")
    println("Текст с благодарностью за покупку: " + thankMessage)

    var employeeCount: Int = 2000

    //println("колличество работников: "+employeeCount)

    employeeCount = employeeCount - 1

    println("колличество работников: " + employeeCount)
}
