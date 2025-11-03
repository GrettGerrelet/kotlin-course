package org.example.kotlincourse.lessons.lesson16.homework16.animals

class Bird: Animal() {
    override fun makeSound() {
        println("\u001B[34mПтичка говорит: Tweet\u001B[0m")
    }
}