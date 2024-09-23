package org.example.practice1_variables

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = 3600
fun main() {

    val totalSecondGagarinInSpace = 6480

    val hours = totalSecondGagarinInSpace / SECONDS_IN_HOUR
    val minutes = totalSecondGagarinInSpace % SECONDS_IN_HOUR / MINUTES_IN_HOUR
    val seconds = totalSecondGagarinInSpace % MINUTES_IN_HOUR


    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}