package org.example.kotlincourse.lessons.lesson14

class Wind(private var speed: Int) {
    fun convertToMetresPerSecond(): Double {
        return speed / 3.6
    }

    fun setSpeed(speed1: Int) {
        if (speed1 < 0) {
            return
        } else {
            speed = speed1
        //  this.speed - если поле класса и аргумент функции с одним и тем же названием
        }
    }

    fun print () {
        println(speed)
    }
}