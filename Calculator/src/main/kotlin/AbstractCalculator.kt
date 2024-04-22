abstract class AbstractCalculator {
    abstract fun calculate(num1: Int, num2: Int): Int
    abstract fun calculate(num1: Double, num2: Int) : Double
    abstract fun calculate(num1: Int, num2: Double) : Double
    abstract fun calculate(num1: Double, num2: Double) : Double

}