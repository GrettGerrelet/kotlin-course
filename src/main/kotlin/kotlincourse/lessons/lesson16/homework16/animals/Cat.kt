package org.example.kotlincourse.lessons.lesson16.homework16.animals

import org.example.kotlincourse.lessons.lesson16.Colors

class Cat: Animal() {
    override fun makeSound() {
        println("${Colors.CYAN}Кошечка говорит: Meow${Colors.RESET}")
    }
}