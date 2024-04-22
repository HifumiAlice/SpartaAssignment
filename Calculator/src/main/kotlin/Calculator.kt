package org.example

import DivClass
import MulClass
import ReminderClass
import SubClass


class Calculator {
    var operator: String = " "
    var add = AddClass() // 더하기 클래스
    var sub = SubClass() // 빼기 클래스
    var mul = MulClass() // 곱하기 클래스
    var div = DivClass() // 나누기 클래스
    var remainder = ReminderClass() // 나머지 클래스


    fun changeMod(str: String) {
        if (str == "+" || str == "-" || str == "*" || str == "/" || str == "%") {
            operator = str
//            println("----------------")
//            println("모드가 변경됐습니다.")
//            println("현재 모드 : ${operator}")

        } else {
            println("----------------")
            println("모드가 잘못됐습니다.")
            println("+, -, *, /, % 에서 골라주세요")
            println("현재 모드 : ${operator}")
        }
    }

    fun input(num1: Int, num2: Int) : Int {
        if (operator == "+") {
            println("${num1} + ${num2} = ${num1 + num2}")
            return add.calculate(num1, num2)
        } else if (operator == "-") {
            println("${num1} - ${num2} = ${num1 - num2}")
            return sub.calculate(num1, num2)
        } else if (operator == "*") {
            println("${num1} * ${num2} = ${num1 * num2}")
            return mul.calculate(num1, num2)
        } else if (operator == "/") {
            println("${num1} / ${num2} = ${num1 / num2}")
            return div.calculate(num1, num2)
        } else {                // (operator == "%") {
            println("${num1} % ${num2} = ${num1 % num2}")
            return remainder.calculate(num1, num2)
        }
    }

    fun input(num1: Double, num2: Int) : Double {
        if (operator == "+") {
            println("${num1} + ${num2} = ${num1 + num2}")
            return add.calculate(num1, num2)
        } else if (operator == "-") {
            println("${num1} - ${num2} = ${num1 - num2}")
            return sub.calculate(num1, num2)
        } else if (operator == "*") {
            println("${num1} * ${num2} = ${num1 * num2}")
            return mul.calculate(num1, num2)
        } else if (operator == "/") {
            println("${num1} / ${num2} = ${num1 / num2}")
            return div.calculate(num1, num2)
        } else {                // (operator == "%") {
            println("${num1} % ${num2} = ${num1 % num2}")
            return remainder.calculate(num1, num2)
        }
    }

    fun input(num1: Double, num2: Double) : Double {
        if (operator == "+") {
            println("${num1} + ${num2} = ${num1 + num2}")
            return add.calculate(num1, num2)
        } else if (operator == "-") {
            println("${num1} - ${num2} = ${num1 - num2}")
            return sub.calculate(num1, num2)
        } else if (operator == "*") {
            println("${num1} * ${num2} = ${num1 * num2}")
            return mul.calculate(num1, num2)
        } else if (operator == "/") {
            println("${num1} / ${num2} = ${num1 / num2}")
            return div.calculate(num1, num2)
        } else {                // (operator == "%") {
            println("${num1} % ${num2} = ${num1 % num2}")
            return remainder.calculate(num1, num2)
        }
    }

    fun input(num1: Int, num2: Double) : Double {
        if (operator == "+") {
            println("${num1} + ${num2} = ${num1 + num2}")
            return add.calculate(num1, num2)
        } else if (operator == "-") {
            println("${num1} - ${num2} = ${num1 - num2}")
            return sub.calculate(num1, num2)
        } else if (operator == "*") {
            println("${num1} * ${num2} = ${num1 * num2}")
            return mul.calculate(num1, num2)
        } else if (operator == "/") {
            println("${num1} / ${num2} = ${num1 / num2}")
            return div.calculate(num1, num2)
        } else {                // (operator == "%") {
            println("${num1} % ${num2} = ${num1 % num2}")
            return remainder.calculate(num1, num2)
        }
    }
}


/*
* 상속 없이 바로 계산기 클래스
* */
//class Calculator {
//    var operator : String = " "
//    fun changeMod(str : String) {
//        if (str == "+" || str == "-" || str == "*" || str == "/" || str == "%") {
//            operator = str
//            println("----------------")
//            println("모드가 변경됐습니다.")
//            println("현재 모드 : ${operator}")
//
//        } else {
//            println("----------------")
//            println("모드가 잘못됐습니다.")
//            println("+, -, *, /, % 에서 골라주세요")
//            println("현재 모드 : ${operator}")
//        }
//
//    }
//    fun input(n1 : Double, n2 : Double) : Double {
//        println("----------------")
//        println("↓↓↓↓↓↓ 계산 결과 ↓↓↓↓↓↓")
//        if (operator == "+") {
//            println(plus(n1,n2))
//            return  plus(n1,n2)
//        } else if (operator == "-") {
//            println(minus(n1,n2))
//            return minus(n1,n2)
//        } else if (operator == "*") {
//            println(mul(n1,n2))
//            return mul(n1,n2)
//        } else if (operator == "/") {
//            println(div(n1,n2))
//            return div(n1,n2)
//        } else if (operator == "%") {
//            println(remainder(n1,n2))
//            return remainder(n1,n2)
//        } else {
//            println("문제가 있습니다.")
//            return 0.0
//        }
//    }
//    fun plus (n1 : Double, n2 : Double) : Double {
//        return n1 + n2
//    }
//
//    fun minus(n1 : Double, n2 : Double) : Double {
//        return n1 - n2
//    }
//
//    fun mul(n1 : Double, n2 : Double) : Double {
//        return n1 * n2
//    }
//
//    fun div(n1 : Double, n2 : Double) : Double {
//        if (n2 == 0.toDouble()){
//            println("0으로 나눌 수 없습니다.")
//            return 0.0
//        } else {
//            return n1 / n2
//        }
//    }
//
//    fun remainder (n1 : Double, n2 : Double) : Double{
//        if (n2 == 0.toDouble()){
//            println("0으로 나머지를 구할 수 없습니다.")
//            return 0.0
//        } else {
//            return n1 % n2
//        }
//    }
//
//}

