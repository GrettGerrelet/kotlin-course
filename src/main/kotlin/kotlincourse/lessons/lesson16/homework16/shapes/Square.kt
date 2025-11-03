package org.example.kotlincourse.lessons.lesson16.homework16.shapes

import kotlin.math.pow

class Square(val side: Double): Shape(){
    override fun area(): Double {
        return side.pow(2)
    }
}