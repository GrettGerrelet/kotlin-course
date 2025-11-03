package org.example.kotlincourse.lessons.lesson16.homework16

import org.example.kotlincourse.lessons.lesson16.Colors
import org.example.kotlincourse.lessons.lesson16.homework16.animals.Bird
import org.example.kotlincourse.lessons.lesson16.homework16.animals.Cat
import org.example.kotlincourse.lessons.lesson16.homework16.animals.Dog
import org.example.kotlincourse.lessons.lesson16.homework16.printer.InkjetPrinter
import org.example.kotlincourse.lessons.lesson16.homework16.printer.LaserPrinter
import org.example.kotlincourse.lessons.lesson16.homework16.shapes.Circle
import org.example.kotlincourse.lessons.lesson16.homework16.shapes.Square
import org.example.kotlincourse.lessons.lesson16.homework16.shapes.Triangle

fun main() {

    println("1. ЖИВОТНЫЕ И ИХ ЗВУКИ")
    val animals = listOf(Dog(), Cat(), Bird())
    for (i in animals) {
        i.makeSound()
    }
    println("")

    println("2. ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ И ИХ ПЛОЩАДЬ")
    val shapes = listOf(
        Circle(5.0),
        Triangle(10.0, 4.0, 90.0),
        Square(5.0)
    )

    for (i in shapes) {
        println("Площадь фигуры: ${"%6.2f".format(i.area())}${Colors.RESET}")
    }
    println("")

    println("3. ПРИНТЕР")
    val laserPrinter = LaserPrinter()
    laserPrinter.printingMethod("Это чёрные буквы на белом фоне")
    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.printingMethod("Это разбитый на кусочки текст")
    println("")

    println("4. КОРЗИНА ТОВАРОВ")


}
// Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на цветном фоне.
// Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона
// и проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте


// Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
// Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
// Выполнить перегрузку addToCart который:
// Принимает два аргумента (itemId и количество amount)
// Принимает словарь из id и количества и добавляет всё в корзину
// Принимает список из id (добавляет по одной единице).
// Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
// Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
// Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
// включая итоговое количество артикулов и общее количество всего товара в корзине.

// Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами уровня логирования
// (INFO, WARNING, ERROR, DEBUG)
// Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO
// Выполнить перегрузку метода log, который:
// Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.
// Принимает список сообщений и все их выводит с уровнем INFO
// Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
// Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.