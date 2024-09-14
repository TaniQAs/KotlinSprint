package org.example.SkillboxPractice

fun main() {
    val sizes = """
высота: 185
ширина: 120
длина: 160
   """
    println(sizes)

    val carNumber = "М" + 657 + "ВС"
    println(carNumber)

    val firstName = "Фёдор"
    val lastName = "Тютчев"
    val fullName = "$firstName $lastName"
    println(fullName)

    val a = 12
    val b = 4
    println("14a + b = ${14 * a + b}")

    val c = 5
    val d = 6
    val result = """
        y = cx + d,
        c = $c, d = $d,
        y = ${c}x + $d
        """
    println(result)

    //Методы строки и их вызовы
    val output = """
        
   Тренировка:
   1. 10 приседаний
   2. 10 отжиманий
   3. Бег 1 км
   """.trimIndent()
    println(output)

    // Методы перевода регистров: .uppercase() и .lowercase()
    println("егор".uppercase()) // ЕГОР
    println("Железный".lowercase()) // железный

    //Метод, разворачивающий строку: .reversed()
    println("АБВГДЕЕ".reversed()) //ЕЕДГВБА

    /* Метод поиска подстроки: .indexOf()
    Результатом метода является число — индекс (порядковый номер),
    на котором начинается подстрока в строке   */
    println("Кошка".indexOf("Кошк")) // 0
    println("Собака".indexOf("ака")) // 3
    println("Попугай".indexOf("шк")) // -1

    //метод take() («взять») — отдаёт первые n символов из строки
    println("Полиэтилен".take(4)) // Поли

    //метод takeLast() («взять последние») отдаёт последние n символов
    println("Полиэтилен".takeLast(4)) // илен

    /* метод substring может принимать и один, и два параметра, с одним параметром он вернёт часть строки,
начиная с номера в параметре; с двумя — в диапазоне */
    println("Полиэтилен".substring(4)) // этилен
    println("Полиэтилен".substring(2, 4)) // ли

    /* Если результатом метода является другая строка,
то на ней тоже можно вызвать другой метод — получится вызов методов «по цепочке» */
    println("Большая строка".take(8).plus("удача")) // Большая удача




}