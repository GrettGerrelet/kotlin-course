package org.example.kotlincourse.lessons.lesson13

import org.example.kotlincourse.lessons.lesson04.b6

fun main() {

    val food = mapOf(
        "Овощи" to listOf("Картофель", "Морковь", "Лук"),
        "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
        "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
        "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
        "Зелень" to listOf(),
    )

    val b1 = food.get("Овощи")              // "Картофель", "Морковь", "Лук"
    val b2: List<String>? = food["Овощи"]   // [] = get

    println("1")
    for ((key, value) in food) {
        println("Key: $key Value: $value")
    }

    println("2")
    food.forEach { println("Key: ${it.key} Value: ${it.value}") }

    val b3: List<String> = food.getValue("Фрукты")
    val b4: List<String> = food.getOrDefault("Крупы", listOf()) // пустой список
    val b5: List<String> = food.getOrElse("Рыба") {
        println("Ключ не найден")
        emptyList()
    }

    if (!food.contains("Мясо") && !food.contains("Рыба")) {
        println("Продукты для веганов")
    }

    val b6 = food.map {
        "${it.key} ${it.value}"
    }
}

