package org.example.lesson_1_DZ

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60

fun main() {

    val seconds = 6480

    val minutes = seconds / SECONDS_IN_MINUTE
    //  println(minutes)

    val remainderSeconds = seconds % SECONDS_IN_MINUTE
    //  println(remainderSeconds)

    val hours = minutes / MINUTES_IN_HOUR
    // println(hours)

    val remainderMinutes = minutes - (hours * MINUTES_IN_HOUR)
    //  println(remainderMinutes)


    println(String.format("%02d:%02d:%02d", hours, remainderMinutes, remainderSeconds))


}
