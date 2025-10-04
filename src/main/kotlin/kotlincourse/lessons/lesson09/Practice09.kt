package org.example.kotlincourse.lessons.lesson09

fun main() {

    // Используя arrayOf:
    val numbers01 = arrayOf(1, 2, 3, 4, 5)
    val numbers02: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Специализированные типы
    val doubles = doubleArrayOf(1.1, 2.2, 3.3)

    // Пустой масссив (на 5 элементов)
    val emptyArray = Array(5) {
        "здесь мог бы быть код"
    }
    val emptyNullableArray = arrayOfNulls<Int>(5)

    //  ПРАКТИКА
    val a01: Array<Int> = Array(10) {0}
    for (i in a01.indices) {
        a01[i] = (i + 1) * 10
    }
}