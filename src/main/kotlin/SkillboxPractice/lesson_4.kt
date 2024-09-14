package org.example.SkillboxPractice

fun main() {
    val escapedString = "Hello\nWorld"
    println(escapedString)

    val commonString = """Hello
        |kotlin.
        |This is a 
        |common string
        """.trimMargin()
    println(commonString)

    val secondGhar = commonString[1]
    println(secondGhar)

    //Конкатинация строк
    val hello = "Hello"
    println(hello + "kotlin")

    println(hello.uppercase())
    println(hello)

    //Длина строки %str% - %length% символов
    val longStr = "The longest string you've ever seen"

    val  resultString = "Length of " + "\"" + longStr + "\"" + longStr.length + " symbols"
    println(resultString)

    val resultString2 = "Length of \"$longStr\" - ${longStr.length} symbols"
    println(resultString2)

    // contains
    val str = "Hello kotlin"
    println(str.contains("H"))
    println(str.contains("kotlin"))
    println(str.contains("world"))

    // replace
    println(str.replace("l", "2"))


    val replaceFirst = str.replaceFirst("Hello", "First")
    println(replaceFirst)










}