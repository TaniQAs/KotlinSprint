package org.example.lesson_1_DZ

fun main() {

   val seconds = 6480

    val minutes = seconds / 60
  //  println(minutes)

    val remainderSeconds = seconds % 60
  //  println(remainderSeconds)

    val hours = minutes / 60
   // println(hours)

    val remainderMinutes = minutes - (hours * 60)
  //  println(remainderMinutes)

    println("0" + hours + ":" + remainderMinutes + ":00")


}
