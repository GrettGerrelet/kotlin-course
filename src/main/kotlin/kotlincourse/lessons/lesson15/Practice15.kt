package org.example.kotlincourse.lessons.lesson15

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val materialsFirstFromTheContainer = MaterialsFirstFromTheContainer()
    ordinalNumbers.forEach { materialsFirstFromTheContainer.addMaterial(it) }
    println(materialsFirstFromTheContainer.extractFirst())
    println(materialsFirstFromTheContainer.extractFirst())
    println(materialsFirstFromTheContainer.extractFirst())
    println(materialsFirstFromTheContainer.printContainer())
}