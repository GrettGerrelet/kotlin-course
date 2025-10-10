package org.example.kotlincourse.lessons.lesson11

fun main() {
    fun003("Строка")

    println(multiplyByTwo(4))
    isEven(4)
    println("")
    printNumbersUntil(10)
    println("")
    println(findFirstNegative(listOf(-5, 1, 2, 3, 4, -1)))
    println("")
    println(processList(setOf("text", "test")))

}

// ЗАДАЧИ НА СИГНАТУРУ МЕТОДА
// Не принимает аргументов и не возвращает значения.
fun fun001() {
}

// Принимает два целых числа и возвращает их сумму.
fun fun002(a: Int, b: Int): Int {
    return a+b
}

// Принимает строку и ничего не возвращает.
fun fun003(a: String) {
    println(a)
}

// Принимает список целых чисел и возвращает среднее значение типа Double.
fun fun004(a: List<Int>): Double {
    return a.average()
}

// Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun fun005(a: String?): Int? { // Сложна, нипанятна
    return null
}

// Не принимает аргументов и возвращает nullable вещественное число.
fun fun006(): Double? {
    return null
}

// Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun fun007(a: Int?) {
}

// Принимает целое число и возвращает nullable строку.
fun fun008(a: Int): String? {
    return null
}

// Не принимает аргументов и возвращает список nullable строк. Сложна, нипанятна
fun fun009() {
}

// Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun fun010(a: String?, b: Int?): Boolean {
    return true
}

// ЗАДАЧИ НА НАПИСАНИЕ КОДА
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a*2
}

// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if (a%2 == 0) {
        println(true)
    }
    return false
}

// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(a: Int) {
    if (a < 1) return
    for (i in 1..a) {
        println(i)
    }
}

// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int? {
    for (i in a) {
        if (i < 0) {
            return i
            }
        }
    return null
}

// Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(a: Set<String?>) {
    for (i in a) {
        if (i == null) return
        println(i)
    }
}