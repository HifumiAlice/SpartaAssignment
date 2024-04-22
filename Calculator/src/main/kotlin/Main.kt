package org.example

import java.util.Scanner

fun main() {
//    println("---------------------------")
//    println("계산기 사용법")
//    println("연산자를 선택해주세요 : cal.changeMod(\"기호\")")
//    println("ex) 모드 선택 :  + , -, *, /, %")
//    println("숫자 2개를 입력해주세요")
//    println("ex) cal.input(10,20)")
//    println("---------------------------")
//    var cal = Calculator()
//
//    cal.changeMod("+")
//    cal.input(10.0,20.0)
//
//    cal.changeMod("0") // 잘못된 변경
//
//    cal.changeMod("-")
//    cal.input(10.0,20.0)
//    cal.changeMod("*")
//    cal.input(10.0,20.0)
//    cal.changeMod("/")
//    cal.input(10.0,20.0)
//    cal.changeMod("%")
//    cal.input(10.0,20.0)


    var cal = Calculator()
    val scanner = Scanner(System.`in`)
    var input : String
    var operator : String = ""
    var numberDouble : Double = 0.0
    var numberInt : Int = 0
    var resultInt : Int = 0
    var resultDouble : Double = 0.0
    var i : Int = 0 // 첫번째 숫자인지 판별
    var doubleFlag : Boolean = false // 한번이라도 실수형 입력 받으면 True
    var intFlag : Boolean = false



    println("------------------------------------")
    println("계산기 사용법")
    println("숫자 입력창에 정수 또는 실수를 입력해주세요 ")
    println("연산 입력창에는 +, -, *, /, % 연산만 입력해주세요")
    println("숫자 또는 연산 입력창에 \"q 또는 quit\"을 입력하면 계산기 작동을 멈춥니다.")
    println("숫자 또는 연산 입력창에 \"r 또는 reset\"을 입력하면 계산값이 초기화 됩니다.")
    println("------------------------------------")

    while(true){
        print("숫자 입력창 :   ")
        input = scanner.next()

        if (input == "q" || input == "quit") {
            println("------------------------------------")
            println("계산기를 종료합니다.")
            println("------------------------------------")
            break
        } else if (input == "r" || input == "reset") {
            println("------------------------------------")
            println("계산 결과를 초기화 합니다.")
            println("------------------------------------")
            i = -1
            doubleFlag = false
            resultDouble = 0.0
            resultInt = 0
        } else {

            try {
                numberInt = input.toInt()
//                println("정수")
//                println("정수 : ${numberInt}")
                intFlag = true
            } catch (e: NumberFormatException) {

//                println("정수 변환 불가")

                try {  // 실수 변환
                    numberDouble = input.toDouble()
//                    println("실수")
//                    println("실수 : ${numberDouble}")
                    doubleFlag = true
                } catch (e: NumberFormatException ) {
                    println("------------------------------------")
                    println("정수 또는 실수를 입력해주세요")
                    println("------------------------------------")
                    continue
                } catch(e : Exception) {
                    println("------------------------------------")
                    println("나도 모르는 에러 : ${e}")
                    println("------------------------------------")
                    continue
                }
            }

            // 첫번쨰 수와 두번째 수를 입력 받는 중간에 한번만 실행됨
            if (i == 0 ) {
//                println("i : ${i}")
                operator = returnOperator()
                if (operator == "r" || operator == "reset") {
                    i = 0
                    doubleFlag = false
                    resultDouble = 0.0
                    resultInt = 0
                    continue
                } else if (operator == "q" || operator == "quit") {
                    break
                } else {
//                    println("모드 체인지")
                    cal.changeMod(operator)

                    // 정수로 입력 받았다면
                    if (intFlag == true) {
                        resultInt = numberInt
                        resultDouble = resultInt.toDouble()
                        intFlag = false
                    } else { // 실수로 입력 받았다면
                        resultDouble = numberDouble
                    }
                    i++
                    continue

                }
            }
            // 첫번쨰 수와 두번째 수를 입력 받는 중간에 한번만 실행됨

            // 한번이라도 실수였던 적이 있으면
            if (doubleFlag == true) {
//                println("정수 플래그1 : ${intFlag}")
                if(intFlag == true) {
                    resultDouble = cal.input(resultDouble,numberInt)
                    intFlag = false
                } else {
                    resultDouble = cal.input(resultDouble,numberDouble)
                }

                println("계산 결과 : ${resultDouble}")

            } else { // 실수가 된 적이 없다면
//                println("정수 플래그2 : ${intFlag}")
                resultInt = cal.input(resultInt, numberInt)
                intFlag = false
                resultDouble = resultInt.toDouble()
                println("계산 결과 : ${resultInt}")

            }

            // 연산기호 정하기
            operator = returnOperator()

            if (operator == "r" || operator == "reset") {
                i = 0
                doubleFlag = false
                resultDouble = 0.0
                resultInt = 0
                continue
            } else if (operator == "q" || operator == "quit") {
                break
            } else {
                cal.changeMod(operator)
            }

        }

        i++ // 회수 올리기
    }


}
fun returnOperator() : String{
    val scanner = Scanner(System.`in`)
    var input : String

    while (true) {
        print("연산기호 입력창 : ")
        input = scanner.next()

        if (input == "+" || input == "-" || input == "*" || input == "/" || input == "%") {
            return input
        } else if (input == "q" || input == "quit" || input == "r" || input == "reset") {
            return input
        }
        else {
            println("------------------------------------")
            println("연산기호가 잘못됐습니다.")
            print("다시 입력해주세요 : ")
            println("------------------------------------")
        }

    }
}

