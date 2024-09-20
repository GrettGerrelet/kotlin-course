package kotlincourse.lesson6

//условные операторы
fun main() {
    val number = 4 //getNumber() например
    if (number > 5) {       //если (true)
        println("число больше 5")
    } else {                //иначе
        println("число меньше 5")
    }

//диапазон
    val intRange = 1..10            //от 1 до 10
    val intRangeUntil = 1 until 10  //от 1 до 9
    val downTo = 10 downTo 1
    val charRange: CharRange = 'd'..'r'

//проверяем, входит ли функция в диапазон
    val inRange = 2 in intRange
    //val notInRange = 20 !in intRange - число не входит в диапазон

    println(intRange)
    println(inRange)

    val score = 95
    when {
        score in 90..100 -> println("Отлично")
        score in 80 .. 89 -> println("Хорошо")
        score in 70 .. 79 -> println("Удовл.")
        else -> println("Подумай ещё")
    }
//отличие when от if/else - when более удобочитаемо, исключение, если проверка только одна

//вычисление значений для переменных
    val a = 3
    val b = 4

    val max = if (a > b) {
        a
    } else {
        b
    }

}

fun getTimeOfDay(hour: Int): String {
    return if  (hour < 0 || hour > 23) {
        "Неверное значение"
    }
     else if (hour in 0..4) {
        "Ночь"
    } else if (hour in 5..11) {
        "Утро"
    } else {
        "Вечер"
    }
}


