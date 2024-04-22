//import java.math.*
import kotlin.math.round

class ReminderClass : AbstractCalculator() {
    override fun calculate(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            println("------------------------------------")
            println("0으로 나눌 수 없습니다.")
            println("다시 입력해주세요")
            println("------------------------------------")
            return num1
        } else {
            return num1 % num2
        }
    }

    override fun calculate(num1: Int, num2: Double): Double {
        if (num2 == 0.0) {
            println("------------------------------------")
            println("0으로 나눌 수 없습니다.")
            println("다시 입력해주세요")
            println("------------------------------------")
            return num1.toDouble()
        } else {
            return round((num1.toDouble() % num2) * 100000) / 100000.0
//            return num1.toDouble() % num2
        }

    }

    override fun calculate(num1: Double, num2: Int): Double {
        if (num2 == 0) {
            println("------------------------------------")
            println("0으로 나눌 수 없습니다.")
            println("다시 입력해주세요")
            println("------------------------------------")
            return num1
        } else {
            return round((num1 % num2.toDouble()) * 100000) / 100000.0
        }

    }

    override fun calculate(num1: Double, num2: Double): Double {
        if (num2 == 0.0) {
            println("------------------------------------")
            println("0으로 나눌 수 없습니다.")
            println("다시 입력해주세요")
            println("------------------------------------")
            return num1
        } else {
            return round((num1 % num2) * 100000) / 100000.0
//            return num1 % num2
        }
    }
}