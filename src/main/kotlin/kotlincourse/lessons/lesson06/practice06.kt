package org.example.kotlincourse.lessons.lesson06

fun main() {
    // Оператор IF
    val number = 10
    if (number > 5) {
        println("Число больше 5")
    }

    // Оператор ELSE
    if (number % 2 == 0) {
        println("чётное")
    } else {
        println("нечётное")
    }

    if (number < 0) {
        println("Число отрицательное")
    } else if (number == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }

    // Диапазон чисел (последовательность)
    val intRange = 1..10
    val intRangeUntil = 1 until 10      // в этом диапазоне последнее число не включается
    val downTo = 10 downTo 1
    val charRange = 'd'..'r'

    // Оператор проверки вхождения в диапазон
    val inRange = 2 in intRange
    val notInRange = 2 !in intRange

    // Оператор WHEN
    val score = 95
    when (score) {
        in 90..100 -> println("Отлично")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        else -> println("Нужно подучить")
    }

    // Использование IF как выражение
    val a = 5
    val b = 6
    val max = if (a > b) {
        println()
        a
    } else {
        b
    }

    // Использование WHEN как выражение
    val result = when (score) {
        in 90..100 -> "Отлично"
        in 80..89 -> "Хорошо"
        in 70..79 -> "Удовлетворительно"
        else -> "Нужно подучить"
    }
    println(result)


    examle1(10)
    example2(24)
    example3(15, true)
}

// ПРАКТИКА
fun examle1 (arg: Int) {
    if (arg in 1..5) {
        println("Ночь")
    } else if (arg in 6..11) {
        println("Утро")
    } else if (arg in 12..17) {
        println("День")
    } else if (arg in 18..24) {
        println("Вечер")
    } else println("Что-то пошло не так")
}

fun example2 (arg: Int) {
    when (arg) {
        in 1..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..24 -> println("Вечер")
    }
}

fun example3 (arg1: Int, arg2: Boolean) {
    if (arg1 > 30 || arg1 < -5) {
        println("Возьми машину")
    } else if (arg1 >= 15 && !arg2) {
        println("Прогулка")
    } else println("Ошибка")
}




