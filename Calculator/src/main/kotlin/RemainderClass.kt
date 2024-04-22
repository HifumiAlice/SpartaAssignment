class ReminderClass : AbstractCalculator() {
    override fun calculate(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            println("0으로 나눌 수 업습니다.")
            return 0
        } else {
            return num1 % num2
        }
    }

    override fun calculate(num1: Int, num2: Double): Double {
        if (num2 == 0.0) {
            println("0으로 나눌 수 업습니다.")
            return 0.0
        } else {
            return num1.toDouble() % num2
        }

    }

    override fun calculate(num1: Double, num2: Int): Double {
        if (num2 == 0) {
            println("0으로 나눌 수 업습니다.")
            return 0.0
        } else {
            return num1 % num2.toDouble()
        }

    }

    override fun calculate(num1: Double, num2: Double): Double {
        if (num2 == 0.0) {
            println("0으로 나눌 수 업습니다.")
            return 0.0
        } else {
            return num1 % num2
        }
    }
}