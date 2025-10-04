package org.example.kotlincourse.lessons.lesson08

fun main() {

    textСonversion("Удача")
    extractingDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    maskingCardNumber("4539 1488 0343 6467")
    emailСonversion("username@example.com")
    extractingFileFormat("C:/Пользователи/Документы/report.txt")
    createAbbreviation("Котлин лучший язык программирования")

}

// 1. ПРЕОБРАЗОВАНИЕ СТРОК
fun textСonversion (arg: String) {
    val result = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg , но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути.")
        !arg.contains(" ") -> "Иногда, $arg , но не всегда"
        else -> arg
    }
}

// 2. ИЗВЛЕЧЕНИЕ ДАТЫ ИЗ СТРОКИ ЛОГА
fun extractingDate (arg: String) {
    val date = arg.split("->")
    when {
        date.size == 2 -> println("""Дата: ${date[1].substring(1, 11)} 
            |Время: ${date[1].substring(12)}"""
            .trimMargin())
        else -> println("Error")
    }
}

// 3. МАСКИРОВАНИЕ ЛИЧНЫХ ДАННЫХ
fun maskingCardNumber (arg: String) {
    val cardsNumber = arg.split(" ")
    when {
        cardsNumber.size == 4 -> println("**** **** **** ${cardsNumber[3]}")
        else -> println("Error")
    }
}

// 4. ФОРМАТИРОВАНИЕ АДРЕСА ЭЛЕКТРОННОЙ ПОЧТЫ.
fun emailСonversion (arg: String) {
        when {
            "@" in arg && "." in arg -> {
                val email = arg.replace("@", " [at] ")
                               .replace(".", " [dot] ")
            println(email)
            } else -> println("Error")
        }
}

// 5. ИЗВЛЕЧЕНИЕ ИМЕНИ ФАЙЛА ИЗ ПУТИ.
fun extractingFileFormat (arg: String) {
    when {
        "/" in arg -> {
            val file = arg.substringAfterLast("/")
            println(file)
        } else -> println("Error")
    }
}

// 6. СОЗДАНИЕ АББРЕВИАТУРЫ ИЗ ФРАЗЫ.

fun createAbbreviation (arg: String) {
    when {
        " " in arg -> {
            val phrase = arg.split(" ")
            var abbreviation = ""               // переменная, накапливающая буквы
            for (word in phrase) {
                abbreviation += word.first()
                                    .uppercaseChar()
            }
            println(abbreviation)
        } else -> println("Error")
    }
}