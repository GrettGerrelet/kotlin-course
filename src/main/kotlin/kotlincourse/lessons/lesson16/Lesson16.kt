package org.example.kotlincourse.lessons.lesson16

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}
fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}
abstract class MusicalInstrument {
    abstract fun playNote(note: String)
    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }
    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}

class Violin: MusicalInstrument() {
    override fun playNote(note: String) {

    }
}

fun main() {
    val violin = Violin()
}

// Полиморфизм в ООП — это принцип, позволяющий одному и тому же имени функции
// (или метода) работать по-разному в зависимости от контекста. Это достигается двумя основными способами:
// перегрузкой и переопределением.

//Перегрузка (Overloading): Это когда один и тот же метод может принимать разное количество или типы параметров.
// Например, функция add может складывать как два числа, так и объединять две строки.
// ыбор конкретной реализации метода зависит от типов и количества аргументов, переданных при вызове.

//Переопределение (Overriding): Это когда производный класс изменяет реализацию метода, унаследованного от базового класса.
// Так, метод базового класса и его производные классы могут иметь разное поведение,
// несмотря на то что вызывается одно и то же имя метода.
// Это позволяет объектам производных классов реагировать по-разному на одни и те же сообщения (вызовы методов).