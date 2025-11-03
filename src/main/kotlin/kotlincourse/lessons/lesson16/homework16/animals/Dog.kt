package org.example.kotlincourse.lessons.lesson16.homework16.animals

class Dog: Animal() {
    override fun makeSound() {
        println("\u001B[32mСобачка говорит: Bark\u001B[0m")
    }
}