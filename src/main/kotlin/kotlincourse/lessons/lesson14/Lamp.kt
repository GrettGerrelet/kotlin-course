package org.example.kotlincourse.lessons.lesson14

class Lamp(var shine: Boolean) {

    fun turnOn() {
        val shine = true
    }

    fun turnOff() {
        val shine = false
    }

    fun toggle() {
        shine = !shine
        if (shine) {
            println("On")
        } else {
            println("Off")
        }
    }
}