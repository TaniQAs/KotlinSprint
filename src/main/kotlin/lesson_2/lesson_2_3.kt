package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    // Инициализация переменных
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // Подсчет общего времени в пути
    val totalDepartureMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    // println(totalDepartureMinutes)

    val arrivalMinutes = totalDepartureMinutes + travelTimeMinutes
    // println(arrivalMinutes)

    // Вычисление времени прибытия
    val arrivalHour = (arrivalMinutes / MINUTES_IN_HOUR)
    // println(arrivalHour)

    val arrivalMinute = arrivalMinutes % MINUTES_IN_HOUR
    // println(arrivalMinute)


    // Вывод результата в консоль
    println("$arrivalHour:${String.format("%02d", arrivalMinute)}")

}