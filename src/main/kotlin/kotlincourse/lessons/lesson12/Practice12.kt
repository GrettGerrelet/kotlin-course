package org.example.kotlincourse.lessons.lesson12

fun main() {

    val example = listOf<Int>(1, 2, 3, 4, 5)
    example.size > 5
    example.isNotEmpty()
    example.getOrElse(80, {80})
    example.joinToString { " : " }
    println(example.sum())
    println(example.average())
    println(example.contains(6))
    println(example.filter { it in 18..30 })
    example.filterNotNull()

    val exString = listOf<String>("Name1", "Name2", "Name3")
    exString.map { it.length }          // длина слова
    exString.associate { it to it.reversed() } // Создает словарь (Map) из списка
    exString.sorted() // сортировка в алфавитном порядке

    println(example.forEach { it * it })
    println(exString.groupBy { it.first() })

}