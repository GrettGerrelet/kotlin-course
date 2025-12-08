package org.example.kotlincourse.lessons.lesson25

// Задание 1.
// Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента
// и измеряет время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах.
// Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

// Классы для выполнения заданий
class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun ex1(fnc: () -> Any): Long {
    val start = System.currentTimeMillis()
    fnc()
    return System.currentTimeMillis() - start
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(ex1(myFunction))
}
// Задание 2
    val em = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "dep1"
    }

// Задание 3

fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}

    val person = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }

// Задание 4

//fun main() {
//    val person = Person("Andrew", 32).apply {
//        email = "andrew@gm.com"
//    }
//
//    val employee = with(person) {
//        Employee(name, age, "Front dev").also {
//            it.email = email
//            it.department = "dep2"
//        }
//    }
//}
// Задание 5

//fun main() {
//    val person = Person("Andrew", 32).apply {
//        email = "andrew@gm.com"
//    }
//
//    val employee = person.run {
//        Employee(name, age, "Front dev").also {
//            it.email = email
//            it.department = "dep2"
//        }
//    }
//}
// Задание 6

fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}