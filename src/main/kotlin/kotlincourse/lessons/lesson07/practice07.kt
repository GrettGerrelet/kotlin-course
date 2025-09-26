package org.example.kotlincourse.lessons.lesson07

fun main() {

    val length = 34
    for (i in 0 until length) {
        println(i)
    }

    println("")

    var counter7: Int = 0
    var sum7: Int = 0
    while (counter7 <= 10) {
        sum7 += counter7
        counter7++
    }
    println(sum7)

    println("")

    var counter8: Int = 0
    var sum8: Int = 0
    do {
        counter8++
        sum8 += counter8
    } while ((sum8 + counter8) <= 50)



}