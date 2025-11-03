package org.example.kotlincourse.lessons.lesson16.homework16.shapes

import kotlin.math.sin

class Triangle(val a: Double, val b: Double, val angle: Double): Shape() {
    override fun area(): Double {
        val angle = Math.toRadians(angle)
        return 0.5 * a * b * sin(angle)
    }
}