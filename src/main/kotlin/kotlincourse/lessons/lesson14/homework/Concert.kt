package org.example.kotlincourse.lessons.lesson14.homework

class Concert(
    var group: String,
    var location: String,
    var cost: Double,
    var maxNumberOfPeople: Int,
    private var ticketsSold: Int = 0
)
{
    fun informationAboutConcert () {
        println("""
            Место проведения концерта: $location
            Выступает группа: $group
            Стоимость билетов: $cost руб.
        """.trimIndent())
    }

    fun buyTicket() {
        if (ticketsSold < maxNumberOfPeople) {
            ticketsSold++
            println("Билет №$ticketsSold куплен")
        } else {
            println("Все билеты распроданы")
        }
    }
}