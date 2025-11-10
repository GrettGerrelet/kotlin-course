package org.example.kotlincourse.lessons.lesson17

class Bankomat(private var pinCode: String) {

    private var balance: Double = 0.0

    private fun checkPIN(pinCode: String): Boolean {
        return if (this.pinCode == pinCode) {
            true
        } else {
            println("Неверный ПИН-код")
            false
        }
    }

    fun getBalance(pinCode: String): Double {
        return if (checkPIN(true.toString())) {
            balance
        } else {
            println("Неверный ПИН-код")
            0.0
        }
    }

    fun deposit(pinCode: String, amount: Double) {
        if (checkPIN(true.toString()) && amount > 0.0) {
            balance += amount
        }
    }

    fun withdraw(pinCode: String, amount: Double): Double {
        return if (checkPIN(true.toString()) && amount > 0.0) {
            if (balance > amount) {
                balance -= amount
                amount
            } else {
                val balance2 = balance
                balance = 0.0
                balance2
            }
        } else {
            0.0
        }
    }
}