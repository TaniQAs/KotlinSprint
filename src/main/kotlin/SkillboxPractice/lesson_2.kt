package org.example.SkillboxPractice

fun main(args: Array<String>) {
    val expectedEarnings = 500
    val goodMetalPrice = 120
    val badMetalPrice = 50
    val expenses = 300
    val day1Earnings = 6 * goodMetalPrice + 8 * badMetalPrice - expenses
    val day2Earnings = 3 * goodMetalPrice + 2 * badMetalPrice - expenses
    val day3Earnings = 4 * goodMetalPrice + 11 * badMetalPrice - expenses
    val day4Earnings = 7 * goodMetalPrice + 0 * badMetalPrice - expenses
    val day5Earnings = 3 * goodMetalPrice + 7 * badMetalPrice - expenses

    val actualEarnings = (day1Earnings + day2Earnings + day3Earnings + day4Earnings + day5Earnings) / 5f
    val isPromiseFulfilled = actualEarnings >= expectedEarnings

    println("Средний доход: $actualEarnings")
    println("Выполнил ли обещание Василий Иванович? - $isPromiseFulfilled")


}