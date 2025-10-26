package org.example.kotlincourse.lessons.lesson14.homework

class Emotion(var type: String, var intensity: Int) {
    fun express() {
        println("Это $type $intensity уровня")
    }
}