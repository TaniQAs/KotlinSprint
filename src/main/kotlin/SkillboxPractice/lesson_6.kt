package org.example.SkillboxPractice

fun main() {

    /* val bloggerName = "Василий" // имя блогера
     val dateVideoShown = "13.08.2023" // дата выхода ролика
     val payment = 20000 // оплата блогеру

     val productName = "Суперклей" // название товара

     val productBuyPrice = 78 // цена закупки товара
     val productSellPrice = 170 // цена продажи товара

     val videoView = 150000 // просмотры видео
     val linkClicked = 1670 // переходы по ссылке на покупку
     val salesAmount = 456 // количество покупок

     val totalIncome = salesAmount * productSellPrice // стоимость всех проданных товаров
     val totalBuyPrice = salesAmount * productBuyPrice // стоимость закупки товаров
     val salesProfit = totalIncome - totalBuyPrice // прибыль с продаж
     val pureProfit = salesProfit - payment // чистая прибыль

     val reportText = """
         Отчет о рекламной кампании
         Блогер: $bloggerName
         Ролик вышел $dateVideoShown
         Заплачено за ролик: $payment рублей

         Рекламируемый товар: $productName
         Закупочная цена: $productBuyPrice рублей
         Цена продажи: $productSellPrice рублей

         Количество просмотров рекламного ролика: $videoView
         Переходов по рекламной ссылке: $linkClicked
         Покупок товара: $salesAmount
         Общая стоимость проданного товара: $totalIncome рублей
         Прибыль от продаж: $salesProfit рублей
         Чистая прибыль: $pureProfit рублей
         """.trimIndent()

     println(reportText) */

    val bloggerName = "Оксана" // имя блогера
    val dateVideoShown = "10.09.2024" // дата выхода ролика
    val payment = 35000 // оплата блогеру

    val productName = "Фитнес-браслет" // название товара

    val productBuyPrice = 700 // цена закупки товара
    val productSellPrice = 2400 // цена продажи товара

    val videoView = 370000 // просмотры видео
    val linkClicked = 3250 // переходы по ссылке на покупку
    val salesAmount = 153 // количество покупок

    val totalIncome = salesAmount * productSellPrice // стоимость всех проданных товаров
    val bloggersFee = totalIncome * 0.1 // гонорар блогера
    val totalBuyPrice = salesAmount * productBuyPrice // стоимость закупки товаров
    val salesProfit = totalIncome - totalBuyPrice // прибыль с продаж
    val pureProfit = salesProfit - payment - bloggersFee // чистая прибыль

    val reportText = """
        Отчет о рекламной кампании
        Блогер: $bloggerName
        Ролик вышел $dateVideoShown
        Заплачено за ролик: $payment рублей
        
        Рекламируемый товар: $productName
        Закупочная цена: $productBuyPrice рублей
        Цена продажи: $productSellPrice рублей

        Количество просмотров рекламного ролика: $videoView
        Переходов по рекламной ссылке: $linkClicked
        Покупок товара: $salesAmount
        Общая стоимость проданного товара: $totalIncome рублей
        Гонорар блогера: $bloggersFee рублей
        Прибыль от продаж: $salesProfit рублей
        Чистая прибыль: $pureProfit рублей
        """.trimIndent()

    println(reportText)

}