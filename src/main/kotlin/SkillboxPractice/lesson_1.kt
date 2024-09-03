package org.example.SkillboxPractice

fun main() {

    var numberForCheck = -5
    var isPositive = numberForCheck > 0
    var isEven = numberForCheck % 2 == 0

    println("Is number positive or even? - ${isPositive || isEven}")

    numberForCheck = 10
    isPositive = numberForCheck > 0
    isEven = numberForCheck % 2 == 0
    println("Is number positive and even? - ${isPositive && isEven}")

}