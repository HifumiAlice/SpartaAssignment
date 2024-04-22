import kotlin.math.round


class MulClass : AbstractCalculator() {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    override fun calculate(num1: Int, num2: Double): Double {
        return round((num1.toDouble() * num2) * 100000) / 100000.0
    }

    override fun calculate(num1: Double, num2: Int): Double {
        return round((num1 * num2.toDouble()) * 100000) / 100000.0
    }

    override fun calculate(num1: Double, num2: Double): Double {
        return round((num1 * num2) * 100000) / 100000.0
    }
}