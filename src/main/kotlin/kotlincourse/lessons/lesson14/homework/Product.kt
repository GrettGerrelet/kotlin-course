package org.example.kotlincourse.lessons.lesson14.homework

class Product(var name: String, var price: Double, var amount: Int) {
    fun  productCostAndAmount() {
        println(
            """
            Наименование товара: $name
            Цена: $price монет
            Остаток: $amount шт.
            """.trimIndent()
        )
    }
}