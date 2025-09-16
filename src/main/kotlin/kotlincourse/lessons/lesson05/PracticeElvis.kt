package org.example.kotlincourse.lessons.lesson05

// ЗАДАЧА 1. Вернуть язык интерфейса для сайта. Если пользователь не установил язык, то вернуть язык по умолчанию - Английский.
// ЗАДАЧА 2. Задача: Определить общий запас энергии зарядного устройства, учитывая, что если дополнительный
// аккумуляторный модуль отсутствует, его вклад в общий запас энергии равен нулю.
// Известно, что встроенная батарея имеет энергию 5000 мАч, а дополнительный модуль, если он подключен, имеет энергию 2000 мАч.
// Контекст: У вас есть портативное зарядное устройство для мобильного телефона.
// Это устройство состоит из двух основных частей: встроенной батареи и дополнительного аккумуляторного модуля.
// Встроенная батарея всегда имеет известное количество энергии
// но дополнительный модуль может быть либо подключен с известным количеством энергии, либо отсутствовать.
// ЗАДАЧА 3. Контекст: Вы работаете на складе и отвечаете за инвентаризацию.
// Ваша задача — убедиться, что в каждом контейнере есть товары, иначе сообщить об ошибке.
// ЗАДАЧА 4. Рассчитай стоимость товара со скидкой, если цена известна, а скидка (указанная в процентах) может быть не установлена

fun main() {

    // ЗАДАЧА 1
    val userLang: String? = "Italian"
    val defaultLang = "English"
    val currentLang = userLang ?: defaultLang
    println(currentLang)

    // ЗАДАЧА 2
    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val powerBank = innerAccumulator + (externalAccumulator ?: 0)
    println(powerBank)

    // ЗАДАЧА 3
    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "Attention!"
    println(checkedGoods)

    // ЗАДАЧА 4
    val price = 80.0
    val discountInPercent: Double? = null
    val discount = (discountInPercent ?: 0.0) / 100.0
    val discountPrice = price - price * discount
    println(discountPrice)

}