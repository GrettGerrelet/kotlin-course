package org.example.kotlincourse.lessons.lesson14.homework

class Party (var location: String, var attendees: Int) {
    fun details() {
        when {
            attendees <= 30 -> println("Место проведения: $location, Количество участников: $attendees")
            attendees > 30 -> println("Слишком много участников")
            attendees == 0 -> println("На вашу вечеринку никто не придёт")
            else -> println("С подсчётом приглашённых гостей что-то не так")
        }
    }
}