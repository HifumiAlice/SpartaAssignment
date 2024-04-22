package org.example

import AbstractCalculator

open class AddClass : AbstractCalculator(){
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun calculate(num1: Int, num2: Double): Double {
        return num1.toDouble() + num2
    }

    override fun calculate(num1: Double, num2: Int): Double {
        return num1 + num2.toDouble()
    }

    override fun calculate(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}