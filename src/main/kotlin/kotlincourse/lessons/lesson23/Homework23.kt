package org.example.kotlincourse.lessons.lesson23

// Задание 1
// Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun example01(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.filter { it % 2 == 0 }
        .average()
}


// Задание 2
// Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
// Сделай проверку, что входящее число больше нуля.
// Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Создай лямбда выражение без указания типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun example02(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}


// Задание 3
// Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке более одного раза).
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

fun List<Int>.duplicates(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}


fun main() {
    // Задание 1
    val e1 = fun (list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.filter { it % 2 == 0 }
            .average()
    }
    val e11: (List<Int>) -> Double = { list ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val e111 = { list: List<Int> ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val list1 = listOf<Int>()
    val list2 = listOf(1)
    val list3 = listOf(1, 2, 3, 4, 5, 6)
    println(e111(list3))

    // Задание 2
    val e2 = fun (bigNumber: Long): Int {
        require(bigNumber > 0) { "Число должно быть больше нуля" }
        return "$bigNumber".sumOf { it.digitToInt() }
    }
    val e22: (Long) -> Int = { number ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
    val e222 = { number: Long ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }

    // Задание 3
    val d1 = fun List<Int>.(): Set<Int> {
        return toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val d11: List<Int>.() -> Set<Int> = {
        toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val l = listOf(0, 1, 2, 4, 2, 5, 6, 5, 7)
    println(l.d11())
}