package org.example.practice1_variables

fun main() {

    val year = 1961
    var hour = 9
    var minute = 7

    println("Год полета:")
    println(year)
    println("Взлет:")

    println("Час:")
    println(String.format("%02d", hour))
    println("Минута:")
    println(String.format("%02d", minute))

    hour = 10
    minute = 55
    println("Посадка:")
    println("$hour:$minute")

}