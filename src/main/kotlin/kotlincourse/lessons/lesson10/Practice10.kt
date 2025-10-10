package org.example.kotlincourse.lessons.lesson10

import java.security.Key

fun main() {
    // ПАРЫ
    // Pair - это класс данных в Kotlin, который хранит два значения: первое (first) и второе (second).
    // Эти значения могут быть разных типов.
    // Пары часто используются в функциях, которые требуют возвращения двух значений.

    val pair = 1 to "a"

    // СЛОВАРИ
    // Пустой неизменяемый словарь:
    val emptyMap = mapOf<String, String>() // ключ и значение

    // Неизменяемый словарь, проинициализированный значениями
    val capitals = mapOf("Россия" to "Москва", "Франция" to "Париж")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    // Используются в основном только неизменяемые словари

    // Практика:
    val map01 = mapOf<String, Int>("One" to 1, "Two" to 2)
    val map02 = mutableMapOf<String, String>("Korea" to "Seoul")
    map02["Japan"] = "Tokio"        // добавляет значение
    map02.remove("Korea")

    for ((strana, stolitsa) in map02) {
        println("$strana: $stolitsa")
    }
    map02["Russia"] = "Moscow"
    map04(map02,"Russia")
}

fun map04(map: Map<String, String>, key: String) {
    for ((k, v) in map) {
        if (key == k) {
            println(v)
            return
        }
    }
    println("Error")
}