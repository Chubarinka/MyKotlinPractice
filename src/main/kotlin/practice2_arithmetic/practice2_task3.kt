package org.example.practice2_arithmetic

const val MINUTES_IN_HOUR = 60
fun main() {

    //Время отправления поезда
    val hoursDeparture: Int = 9
    val minutesDeparture: Int = 39

    val minutesOfTravel: Int = 457

    // Подсчет времени прибытия поезда
    var hoursArrival = hoursDeparture + minutesOfTravel / MINUTES_IN_HOUR
    var minutesArrival:Int =0

    if ((minutesOfTravel % MINUTES_IN_HOUR + minutesDeparture) > 59) {
        hoursArrival += 1
        minutesArrival = (minutesDeparture + minutesOfTravel % MINUTES_IN_HOUR) - MINUTES_IN_HOUR
    } else {
        minutesArrival += minutesDeparture + minutesOfTravel % MINUTES_IN_HOUR
    }

    // Вывод в консоль
    println(String.format(" Поезд прибудет  в %02d:%02d", hoursArrival, minutesArrival))

}