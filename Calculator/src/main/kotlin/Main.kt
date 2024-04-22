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
//    cal.input(10,20)
//    cal.changeMod("%")
//    cal.input(10.0,20.0)


    var cal = Calculator()
    val scanner = Scanner(System.`in`)
    var input : String
    var operator : String = ""
    var numberDouble : Double = 0.0
    var numberInt : Int = 0
    var resultDouble : Double = 0.0
    var i : Int = 0 // 첫번째 숫자인지 판별
    var flag : Boolean = false // 입력받은게 정수인지 판별
    var resultFlag : Boolean = false // 한번이라도 실수형 입력 받으면 True
    println("------------------------------------")
    println("계산기 사용법")
    println("숫자 입력창에 정수 또는 실수를 입력해주세요 ")
    println("숫자 입력창에 \"그만\"을 입력하면 계산기 작동을 멈춥니다.")
    println("숫자 입력창에 \"초기화\"을 입력하면 계산값이 초기화 됩니다.")
    println("연산 입력창에는 +, -, *, /, % 연산만 입력해주세요")
    println("------------------------------------")

    while(true){
        print("숫자 입력창 :   ")
        input = scanner.next()

        if (input == "그만") {
            println("------------------------------------")
            println("계산기를 종료합니다.")
            println("------------------------------------")
            break
        } else if (input == "초기화") {
            println("------------------------------------")
            println("계산 결과를 초기화 합니다.")
            println("------------------------------------")
            i = -1
            resultFlag = false
            resultDouble = 0.0
        } else {

            try {
                numberDouble = input.toDouble()

                if(numberDouble-numberDouble.toInt() == 0.0) { // 정수 입력
                    numberInt = numberDouble.toInt()
                    flag = true
                } else { // 실수인경우
                    resultFlag = true
                }

                if (i == 0 ) {
                    operator = returnOperator()
                    if (operator == "초기화") {
                        i = 0
                        resultFlag = false
                        resultDouble = 0.0
                        continue
                    } else if (operator == "그만") {
                        break
                    } else {
                        cal.changeMod(operator)
                    }
                }

                if (flag == true) { // 정수 입력일 떄
                    if (i == 0) {
                        resultDouble = numberInt.toDouble()
                        flag = false
                        i++
                        continue
                    }

                    resultDouble = cal.input(resultDouble,numberInt)
                    flag = false
                } else { // 실수 입력일 때
                    if (i == 0) {
                        resultDouble = numberDouble
                        i++
                        continue
                    }
                    resultDouble = cal.input(resultDouble,numberDouble)
                }
                if (resultFlag == true) { // 실수를 보여줄 떄
                    println("계산 결과 : ${resultDouble}")
                } else {
                    println("계산 결과 : ${resultDouble.toInt()}")
                }

                operator = returnOperator()
                if (operator == "초기화") {
                    i = 0
                    resultFlag = false
                    resultDouble = 0.0
                    continue
                } else if (operator == "그만") {
                    break
                } else {
                    cal.changeMod(operator)
                }



            } catch (e: NumberFormatException) { // 숫자로 바꾸는데 실패하면 처리
                println("------------------------------------")
                println("정수 또는 실수를 입력해주세요")
                println("------------------------------------")
            } catch (e : Exception) {
                println("------------------------------------")
                println("에러 발생 : " + e)
                println("------------------------------------")
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
        } else if (input == "그만" || input == "초기화") {
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

