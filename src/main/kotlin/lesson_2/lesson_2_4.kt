package org.example.lesson_2

fun main() {

   // Инициализация переменных
   val crystalOreWithoutBuff = 7 // количество кристаллической руды
   val ironOreWithoutBuff = 11 // количество железной руды
   val buffPercentage = 0.20 // 20% баффа

   // Вычисление бонусных материалов с учетом баффа
   val bonusCrystalOre = (crystalOreWithoutBuff * buffPercentage).toInt() // отбрасываем дробную часть
   val bonusIronOre = (ironOreWithoutBuff * buffPercentage).toInt() // отбрасываем дробную часть


   println(bonusCrystalOre)
   println(bonusIronOre)

}