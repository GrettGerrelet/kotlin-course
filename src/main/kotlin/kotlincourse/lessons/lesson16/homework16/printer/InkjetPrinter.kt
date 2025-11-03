package org.example.kotlincourse.lessons.lesson16.homework16.printer

class InkjetPrinter: Printer() {
    override fun printingMethod(arg: String) {
        val words = arg.split(" ")

        for (i in words) {
            println(i.uppercase())
        }
    }
}