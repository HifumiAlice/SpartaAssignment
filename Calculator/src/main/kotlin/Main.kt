package org.example

fun main() {
    println("---------------------------")
    println("계산기 사용법")
    println("연산자를 선택해주세요 : cal.changeMod(\"기호\")")
    println("ex) 모드 선택 :  + , -, *, /, %")
    println("숫자 2개를 입력해주세요")
    println("ex) cal.input(10,20)")
    println("---------------------------")
    var cal = Calculator()

    cal.changeMod("+")
    cal.input(10.0,20.0)

    cal.changeMod("0") // 잘못된 변경

    cal.changeMod("-")
    cal.input(10.0,20.0)
    cal.changeMod("*")
    cal.input(10.0,20.0)
    cal.changeMod("/")
    cal.input(10,20)
    cal.changeMod("%")
    cal.input(10.0,20.0)

}
