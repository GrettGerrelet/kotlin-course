package org.example.kotlincourse.lessons.lesson16.homework16.shapes

import kotlin.math.PI
import kotlin.math.pow

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return PI * radius.pow(2)           // возведение значения переменной radius во 2 степень
    }
}