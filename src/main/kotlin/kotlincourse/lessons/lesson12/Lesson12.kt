package org.example.kotlincourse.lessons.lesson12

fun main() {

// КОЛЛЕКЦИИ
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

// Итерация коллекции через forEach - работает как цикл, перебирая каждый элемент коллекции,
// помещая его в специальную переменную 'it' и выполняет блок кода с каждым элементом коллекции.
    val positive = mutableListOf<Int>()
//    for (i in numbers) {
//        val isPositive = i > 0
//        if (isPositive) {
//            positive.add(i)
//        }
//    }
    numbers.forEach {
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }
// it — это просто способ сказать "тот элемент, который я сейчас рассматриваю"

// Фильтрация коллекций
//    fun filter(collection: List<Int>): List<Int> {
//        val result = mutableListOf<Int>()
//        for (i in collection) {
//            if (i in 7..17) result.add(i)
//        }
//        return result
//    }
//
    val list = listOf(8, 56, 23, 87, 12, 18, 11)
//    val filtered1 = filter(list)
//    println(filtered1)

    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers) // Вывод: [2, 4]

// filterNot
// Похож на filter, но выбирает элементы, которые не соответствуют условию.
    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Вывод: [-1, -3, -5]

// filterNotNull
// Используется для отбрасывания всех null значений из коллекции.
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Вывод: [1, 2, 3]

// Получение первого или последнего элемента коллекции
    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()
    println(firstElement)
    println(lastElement)

// Получение элемента с условием что его может не быть
// firstOrNull или lastOrNull возвращает первый или последний элемент,
// который соответствует условию, или null, если такого элемента нет.
// getOrElse возвращает элемент по индексу или значение по умолчанию, если индекс вне диапазона списка.
    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Вывод: 2
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable) // Вывод: null
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // Вывод: -1

}