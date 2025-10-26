package org.example.kotlincourse.lessons.lesson14.homework

fun main() {
    println("1. Событие: вечеринка")            // выводит информацию о месте проведения и количестве гостей
    val party = Party("House", 8)
    party.details()
    println("")

    println("2. Аспект реальности: эмоция")     // выводит описание эмоции в зависимости от её типа и интенсивности
    val emotion = Emotion("отчаяние", 5)
    emotion.express()
    println("")

    println("3. Природное явление: луна")       // выводит текущую фазу Луны
    val moon = Moon
    moon.showPhase()
    println("")

    println("4. Покупка: продукт")              // представляет продукт в магазине
    val product = Product("Печеньки", 100.0, 10)
    product.productCostAndAmount()
    println("")

    println("5. Мероприятие: концерт")
    val concert = Concert("Группа", "Локация", 500.0, 3)
    concert.informationAboutConcert()           // выводит информацию о концерте
    concert.buyTicket()                         // увеличивает количество проданных билетов на один
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    println("")

    println("6. Стеллаж и полки")

}

//Задание 6. Стеллаж и полки.
//Цель задания: Создать систему управления складским пространством с использованием классов "Стеллаж" и "Полка стеллажа".

//Класс Shelf (Полка Стеллажа)
//Характеристики:

//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.


// Класс Rack (Стеллаж)
//Характеристики:
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
