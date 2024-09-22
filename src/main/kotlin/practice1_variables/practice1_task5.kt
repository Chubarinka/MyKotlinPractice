package org.example.practice1_variables

fun main() {
    val totalSecond=5409

    val hours = totalSecond/3600
    val minutes = totalSecond%3600/60
    val seconds = totalSecond%60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}