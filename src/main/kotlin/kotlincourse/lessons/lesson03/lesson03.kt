package org.example.kotlincourse.lessons.lesson03

class lesson03 {

    lateinit var phoneNumber: String        // переменная, которая вычисляется позже

    val lazyValue: String by    lazy   {    //
        "Hello! This is a lazy string"
    }

    companion object {
        const val PI = 3.14                 // переменная, которая заранее определена и её не надо вычислять
    }

    val name: String = "Alice"              // неизменяемая переменная, String - строка
    var age0: Int = 30                      // изменяемая переменная, Int - целые числа
    var age1 = 31                           // допустимый формат

    // private перед любой переменной делает её недоступной для "внешнего" пользователя
    // (увидеть можно, использовать нельзя)

    fun example() {
        age0 = 31
        speed?.dec()
        count = 5
    }

    var score: Int = 10
    var speed: Double? = null               // nullable-переменная "ничего", в которую потом что-то "кладётся"

    var count: Int = 0
        get () {                            // регулирует то, как мы будем получать переменные
            return if (field > 100) field else 0
        }
        set(value) {                        // регулирует то, как мы будем записывать данные, переопределяет переменную
            if (value >= 0) field = value
        }
    // field - специальное зарезервированное слово для обозначения поля переменной
    // Из него можно получить текущее значение переменной либо установить в него новое значение.
}