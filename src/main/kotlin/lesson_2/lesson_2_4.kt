package org.example.lesson_2

fun main() {

   val crystalOreWithoutBuff = 7
   val ironOreWithoutBuff = 11
   val buffPercentage = 0.20

   val bonusCrystalOre = (crystalOreWithoutBuff * buffPercentage).toInt()
   val bonusIronOre = (ironOreWithoutBuff * buffPercentage).toInt()

   println("BonusCrystalOre: $bonusCrystalOre")
   println("BonusIronOre: $bonusIronOre")

}