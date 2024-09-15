package kotlincourse

//Уникальный номер машины уникален и не изменяемый
val chassis: String = "12345"   //неизменяемое

var color: String = "Blue"      //изменяемое

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4       //константы всегда большими буквами или с нижним подчёркиванием

val finally_report: String by lazy { "..."
}

var fuel: Double = 0.0
    get() = field               //возвращает текущее значение
    set(value) {
        if (value > 0) field += value
    }