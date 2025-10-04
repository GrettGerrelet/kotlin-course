package org.example.kotlincourse.lessons.lesson08

//    val simpleString = "Это простая строка"
//
//    val firstName = "Иван"
//    val lastName = "Иванов"
//    val fullName = firstName + " " + lastName       // "Иван Иванов"
//
//    // ШАБЛОНЫ СТРОК
//    val age = 30
//    val greeting = "Привет! Меня зовут $firstName, и мне $age лет."
//
//    // ОБРАЩЕНИЕ К СВОЙСТВАМ ОБЪЕКТА
//    class Person(val name: String, val age: Int)
//
//    val person = Person("Алексей", 25)
//    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."
//
//    // ИСПОЛЬЗОВАНИЕ МЕТОДОВ В ШАБЛОННЫХ СТРОКАХ
//    fun getDetails(): String {
//        return "очень интересные детали"
//    }
//
//    val details = "Здесь находятся ${getDetails()}"
//
//    // СЛОЖНЫЕ ВЫРАЖЕНИЯ
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y равен ${x + y}"
//
//    // МАНИПУЛЯЦИИ СО СТРОКАМИ
//    val originalString = "Kotlin is fun"
//    val subString = originalString.substring(7)  // "is fun" начинается с индеска 7 и до конца строки
//    val subString2 = originalString.substring(3, 6) // "lin" от 3 индекса до 6, индексы начинаются с 0
//    val replacedString = originalString.replace("fun", "awesome")  // "Kotlin is awesome" замена
//    val words = originalString.split(" ")  // ["Kotlin", "is", "fun"] преобразование в массив, пробел - разделитель
//    val length = "Hello".length  // 5 длина строки
//    val upper = "hello".uppercase()  // "HELLO" изменение регистра
//    val lower = "HELLO".lowercase()  // "hello"
//    val trimmed = "  hello  ".trim()  // "hello" удаляет пробелы в начале и в конце строки
//    val starts = "Kotlin".startsWith("Kot")  // true проверяет начало строки
//    val ends = "Kotlin".endsWith("lin", true)  // true проверяет конец строки, ignor- игнорирование регистра
//    val contains = "Hello".contains("ell")  // true содержит ли ell
//    val empty = "".isNullOrEmpty()  // true
//    val blank = "  ".isNullOrBlank()  // true
//    val repeat = "ab".repeat(3)  // "ababab"
//    val letter = originalString[5] // 'n' поиск буквы по индексу
//    val indexOfChar = "Kotlin".indexOf('t') // поиск индекса, результат = 2
//    val indexOfWord = "Kotlin is the best language".indexOf("best")
//    val backReverse = "niltoK".reversed()
//
//    // МНОГОСТРОЧНЫЕ СТРОКИ
//    val multiLineString = """
//   Первая строка
//   Вторая строка
//   Третья строка
// """.trimIndent() // trim - форматирует этот блок, убирая пробелы в начале и в конце строки, ориентируясь на самый минимальный отступ
//
//    // \n - перенос строки
//
//    // Правила расчета индексов для получения подстроки
//    // Метод substring() может принимать один или два аргумента.
//    // В случае с одним аргументом, будет получена подстрока, начинающаяся с буквы с указанным индексом:
//    val string = "Sweet summer child"
//    val subString = string.substring(6) // "summer child"
//
//    // В случае с двумя аргументами, метод вернёт подстроку, начинающуюся с символа с первым индексом
//    // и заканчивающуюся символом, предшествующим последнему индексу.
//    //
//    // Вот три правила, которые помогут запомнить как правильно подсчитать индексы подстроки:
//    //
//    // Начальный индекс включительно, конечный индекс не включительно.
//    // Начальный индекс равен индексу первой буквы подстроки, конечный индекс равен индексу первой буквы
//    // следующей за подстрокой фразы либо длине строки если подстрока заканчивается вместе с фразой.
//    // Начальный индекс равен индексу первой буквы подстроки, конечный индекс равен сумме начального индекса и длины подстроки.
//    val string = "Sweet summer child"
//    val subString = string.substring(6, 12) // "summer"
//
//    // ФОРМАТИРОВАНИЕ СТРОК
//    val name = "Алексей"
//    val city = "Москва"
//    val age = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//  Имя: %s
//  Город: %s
//  Возраст: %d
//  Количество друзей: %,d
//  Рейтинг пользователя: %.1f
//  Баланс счета: $%,.2f
// """.trimIndent()
//    println(text.format(name, city, age, friendsCount, rating, balance))
//    /*
// Результат:
// Имя: Алексей
// Город: Москва
// Возраст: 32
// Количество друзей: 1 052
// Рейтинг пользователя: 5,0
// Баланс счета: $2 534,76
// */
fun main() {
    example1("Ошибка в системе вызвала панику")
}

fun example1(arg: String) {
    val result = when {
        arg.startsWith("Ошибка") -> arg.replace("Ошибка", "Небольшое недоразумение")
        arg.endsWith("важно") -> "$arg ... но не критично."
        else -> arg
    }
    println(result)
}
