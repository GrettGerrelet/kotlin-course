package org.example.kotlincourse.lessons.lesson14.homework

object Moon {
    val isVisible: Boolean = true
    val phase: String = "новолуние"

    fun showPhase() {
        if (isVisible) {
            println("Луна видна. Фаза: $phase")
        } else {
            println("Луна не видна.")
        }
    }
}