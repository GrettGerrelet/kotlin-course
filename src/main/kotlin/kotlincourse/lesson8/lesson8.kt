package kotlincourse.lesson8

//
//fun main() {
//    val simpleString = "Это простая строка"
//
//    val firstName = "Иван"
//    val lastName = "Иванов"
//    val fullName = "$firstName $lastName"
//
//    val age = 30
//    val greeting = "Привет! Меня зовут $fullName, и мне $age лет."
//
//
//    val person = Person("Алексей", 25)
//    val introduction = "Меня зовут $person.name, и мне ${person.age} лет."
//
//    val details = "Здесь находятся ${getDetails()}"
//
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y равен ${x + y}"
//
//
//    val originalString = "Kotlin is fun"
//
//    val subString = originalString.substring(7)
//
//    val subString2 = originalString.substring(3, 6)
//
//    val replacedString = originalString.replace("fun", "awesome")
//
//    val words = originalString.split(" ")
//
//    val length = "Hello".length
//
//    val upper = "hello".uppercase()
//
//    val lower = "HELLO".lowercase()
//
//    val trimmed = "  hello  ".trim()
//
//    val starts = "Kotlin".startsWith("Kot")
//
//    val ends = "Kotlin".endsWith("lin")
//
//    val contains = "Hello".contains("ell")
//
//    val empty = "".isNullOrEmpty()
//
//    val blank = "  ".isNullOrBlank()
//
//    val repeat = "ab".repeat(3)
//
//    val letter = originalString[5]
//
//    val indexOfChar = "Kotlin".indexOf('t')
//
//    val indexOfWord = "Kotlin is the best language".indexOf("best")
//
//    val backReverse = "niltoK".reversed()
//
//    val multiLineString = """
//    Первая строка
//    Вторая строка
//    Третья строка
//""".trimIndent()
//
//    val name = "Алексей"
//    val city = "Москва"
//    val age = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//   Имя: %s
//   Город: %s
//   Возраст: %d
//   Количество друзей: %,d
//   Рейтинг пользователя: %.1f
//   Баланс счета: $%,.2f
//""".trimIndent()
//    println(text.format(name, city, age, friendsCount, rating, balance))
//
//    println(backReverse)
//
//}
//

//fun main() {
//    println(convert("Для завершения проекта важно"))
//}

//fun convert(string: String): String {
//    return when {
//        string.startsWith("ошибка",true) -> string.replace("ошибка", "небольшое недоразумение", true)
//        string.endsWith("важно", true) -> "$string ...но не критично"
//        else -> ""
//    }
//}

fun main() {
//    val text1 = "Kotlin: The Fun Way to Learn Programming"
//    val text2 = "contact@example.com"
//    val indexOfAt = text2.indexOf("@")
//    println(text2.substring(indexOfAt + 1))

    val number = "123-456-7890"
    val split = number.split("-")
    println("XXX-XXX-${split[2]}")

}