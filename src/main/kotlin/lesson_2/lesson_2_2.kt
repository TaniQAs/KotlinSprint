package org.example.lesson_2

fun main() {


    val numberOfMainEmployees = 50

    val salaryOfOneMainEmployee = 30000

    val numberOfInterns = 30

    val salaryOfOneIntern = 20000

    val expensesOfSalaryMainEmployees = numberOfMainEmployees * salaryOfOneMainEmployee

    println(expensesOfSalaryMainEmployees)

    val totalSalaryOfMainEmployeesAndInterns = expensesOfSalaryMainEmployees + (numberOfInterns * salaryOfOneIntern)

    println(totalSalaryOfMainEmployeesAndInterns)

    val averageSalaryOfMainEmployeesAndInterns = totalSalaryOfMainEmployeesAndInterns / (numberOfMainEmployees + numberOfInterns)

    println(averageSalaryOfMainEmployeesAndInterns)


}