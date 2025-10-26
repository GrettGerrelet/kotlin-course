package org.example.kotlincourse.lessons.lesson14.homework

class Concert(
    var group: String,
    var location: String,
    var cost: Double,
    var maxNumberOfPeople: Int,
    private var ticketsSold: Int
)
{
    fun informationAboutConcert () {
        println("""
            Место проведения концерта: $location
            Выступает группа: $group
        """.trimIndent())
    }

    fun buyTicket() {
        for (i in 0..maxNumberOfPeople)
            i+1
        println()
    }

}