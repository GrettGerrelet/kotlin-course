package org.example.kotlincourse.lessons.lesson05

// ЗАДАЧИ С ОПЕРАТОРОМ ЭЛВИСА

fun main() {

    // ЗАДАЧА 1. Рассчитать предполагаемую интенсивность звука после затухания.
    // Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
    // Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.

    val baseIntensity: Double = 3.0
    val coefficient: Double? = null
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)
    println(resultIntensity)

    // ЗАДАЧА 2. Рассчитать полную стоимость доставки.
    // Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
    // которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50

    val defaultCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    val insuranceCost = (cost ?: defaultCost ) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost
    println(totalCost)

    // ЗАДАЧА 3. Сообщить об ошибке в случае отсутствия показаний атмосферного давления.
    val pressure: String? = null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = pressure ?: attentionMessage
    println(pressureForLab)

}