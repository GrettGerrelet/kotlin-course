package org.example.kotlincourse.lessons.lesson11

fun main() {
    greetUser("User")
    val r = sum(2,3)
    println(r)
    printSum(2,3)
    multiply(3, 3)
}

// ФУНКЦИИ (fun)
// Функции - блок кода, который что-то делает

// fun имяФункции(параметры): ТипВозвращаемогоЗначения {
//    Тело функции
//    return возвращает значение
// }

// () = "выполнить" он же "оператор invoke")

fun greetUser(name: String) {
    println("Hello, $name!")
}

// аргументы передаются через запятую, тип возвращаемого значения - через двоеточие
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

// ОДНОСТРОЧНЫЕ ФУНКЦИИ
fun multiply(a: Int, b: Int): Int = a * b

// ПРИВАТНЫЕ ФУНКЦИИ
private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}
fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

// RETURN
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// если нужно прекратить работу функции можно ипользовать return
fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
    }
    println("Value not found")
}

// ПРАКТИКА
fun doSomething() {
}

fun isNullOrEmpty(a: String?): Boolean {
    return true
}

fun summary(a: Int, b: Int): Int {
    return a + b
}

fun maxNumber(a: Int, b: Int): Int {
    return if (a>b) {
        a
    } else b
}

fun positiveNumbers (a: List<Int>) {
    for (i in a) {
        if (i > 0) {
            println(i)
        } else if (i == 0) {
            println("Zero")
        } else return
    }
}

fun list(a: MutableList<String>, b: String) {
    for (i in a.indices) {
        if (a[i].contains(b)) {
            a[1] = a[1].replace(b,b.uppercase())
            return
        }
    }
}

fun sumCount(menu: Map<String, Double>): Double {
    var sum = 0.0
    for ((key, value) in menu) {
        sum -= if (value < 0) {
            0 - value
        } else {
            value
        }
    }
    return sum
}
