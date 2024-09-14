package org.example.SkillboxPractice

fun main() {

    var number: Int? = null

    var nonNulltring: String = "Hello Kotlin"
    val nullableString: String? = "Hello Kotlin 2"
    println(nullableString?.uppercase())
    println(null)


    if (nullableString != null)
        println(nullableString.uppercase())

    /* Операции с null
    Операция присваивания. Переменной с nullable-типом можно присвоить значение null.
Сравнение «равно — не равно». Можно узнать, является ли значение переменной null или нет */

    val name: String? = null
    val isNameNull = name == null
    println(isNameNull)

    var age:Int? = 0
    val isAgeNull = age == null
    println(isAgeNull)

    // Операторы для работы с nullable-типами
    // Оператор «?.» — оператор безопасного вызова (safe-call operator)
    var name1: String? = "Вася"
    var name2: String? = null
    println(name1)
    println(name2)

    // Если при выводе вызвать один из методов методов строки, будет ошибка
    // println(name1.uppercase())

    // Для вызовов методов nullable-переменных используется оператор «?.»
    println(name1?.uppercase())
    println(name2?.uppercase())

    // Оператор можно (и иногда нужно) вызывать несколько раз. Выводом такой операции тоже будет null
    println(name?.uppercase()?.reversed())

    /* Оператор «?:» — «Элвис»-оператор
    Если значение не null, в нём используется значение переменной, если null, то значение справа.
    Допустим, приходит значение. Мы не контролируем, откуда и каким образом оно приходит: из базы данных,
    из другого сервиса или задано пользователем. Оно может быть null, тогда вместо него нужно добавить
    значение по умолчанию (default value). Значением по умолчанию является значение, которое нам нужно подставить,
    если нет иного. Например, через форму связи приходит поле «Профессия». Но у человека может и не быть профессии
    или он её не указал, поэтому при выводе напишем значение по умолчанию «Не указано».
     */
    var profession1: String? = "Столяр"
    var profession2: String? = null
    val defaultProfession = "Не указано"
    println(profession1 ?: defaultProfession)
    println(profession2 ?: defaultProfession)



}