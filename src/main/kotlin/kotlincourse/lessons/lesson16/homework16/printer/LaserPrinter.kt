package org.example.kotlincourse.lessons.lesson16.homework16.printer

import org.example.kotlincourse.lessons.lesson16.Background
import org.example.kotlincourse.lessons.lesson16.Colors

class LaserPrinter: Printer() {
    override fun printingMethod(arg: String) {
        val words = arg.split(" ")

        for (i in words) {
            val backgroundColors = Background.WHITE
            val letterСolor = Colors.BLACK
            println("$backgroundColors$letterСolor${i.uppercase()}${Colors.RESET}")
        }
    }
}