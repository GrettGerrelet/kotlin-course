package kotlincourse.lesson5

fun main() {

    val sum = "5" + "3"
    val dif = 10 - 5
    val quotient = 10 * 5
    val remainder = 10 % 5
    val remainder2 = 10 % 6                  //остаток от деления

    //операторы сравнения:
    val isEqual = 5 == 4                     //равно
    val isNotEqual = (5 != 5)                //не равно
    val isGreater = (5 > 3)
    val isLesser = (5 < 3)
    val isGreaterOrEqual = (5 >= 3)
    val isLesserOrEqual = (5 <= 3)

    //логические операторы
    val andResult = false && false           //и, возвращает true только если с обеих сторон true
    val orResult = true || false             //или, возвращает false только если с обеих сторон false
    val notResult = !(5 > 3)                 //переворачивает значение, было true, стало false
    var number = 5
    number += 3
    number /= 2

    val a = (3 + 2 < 6) && (4 * 2 == 8) // true
    (10 - 5 >= 5) || (2 * 3 != 6) // true
    (8 / 2 == 4) && (7 % 3 != 1)// false
    (9 - 3 >= 6) && (8 / 2 != 4) // false
    ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1) // true
    ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) // true
    ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4) //true
    ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8) // false


    val defaultName = "Unknown"

    var name: String? = "we"

    val result = name ?: throw Exception("Не может быть  null")  //  Если name равен null то Unknown

    fun printPrice(price: Double, s: Int?) {
        val koef = (100 - (s ?: 0 ))/100.0
        println(price * koef)
    }

    fun printSiteLang(lang: String?){
        val defaultLang: String = "Eng"
        println(lang ?:"Eng" )
    }

    fun printBox(stuff: String?) {
        println(stuff ?: throw Exception("Box is empty"))
    }

}