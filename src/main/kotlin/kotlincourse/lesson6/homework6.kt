package kotlincourse.lesson6

fun main() {

    //Задание 1: "Определение Сезона"
    //Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

    val month = 1
    when {
        month in 3..5 -> println("Spring")
        month in 6..8 -> println("Summer")
        month in 9..11 -> println("Autumn")
        month == 12 || month in 1..2 -> println("Winter")
        else -> println("Error")
    }

    // Задание 2: "Расчет Возраста Питомца"
    // Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
    // До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

//    val agePet = 4
//    fun ageHuman(agePet: Int): Double {
//        return if agePet in 1..2) {
//            agePet * 10.5
//        }
//        else if (agePet > 2) {
//            21 + (agePet * 4)
//        }
//    }
}
