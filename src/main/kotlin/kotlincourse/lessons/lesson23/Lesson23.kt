package org.example.kotlincourse.lessons.lesson23

// Обычное объявление функции
fun increment1(a: Int): Int {
    return a + 1
}

// Анонимная функция, присвоенная переменной
val increment2 = fun (a: Int): Int {   // название функции перешло в название переменной
    return a + 1
}

// Лямбда выражение с явно указанным типом
val increment3: (Int) -> Int = { a ->
    a + 1
}