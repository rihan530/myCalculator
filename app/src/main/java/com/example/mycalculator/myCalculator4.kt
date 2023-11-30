package com.example.mycalculator

import java.util.InputMismatchException

fun main() {
    var inputNum1 : String
    var inputNum2 : String
    var operator : String
    var num1 : Int
    var num2 : Int
    var operators = arrayOf("+", "-", "*", "/")
    var reCalculate : Int
    var reOperator : String
    var calculator = Calculator() //abstractOperation 변수 선언

    try {
        print("숫자1 : ")
        inputNum1 = readLine().toString()

        while (true) {
            if (IsNum().isNum(inputNum1)) {
                break
            } else {
                println("숫자가 아닙니다. 다시 입력하세요.")
                print("숫자1 : ")
                inputNum1 = readLine().toString()
                continue
            }
        }
        print("연산자 : ")
        operator = readLine().toString()

        while (true) {
            if (IsPresent().isPresent(operators, operator)) {
                break
            } else {
                println("연산자가 아닙니다. 다시 입력하세요.")
                print("연산자 : ")
                operator = readLine().toString()
                continue
            }
        }
        print("숫자2 : ")
        inputNum2 = readLine().toString()

        while (true) {
            if (IsNum().isNum(inputNum2)) {
                break
            } else {
                println("숫자가 아닙니다. 다시 입력하세요.")
                print("숫자2 : ")
                inputNum2 = readLine().toString()
                continue
            }
        }
    } catch (e : InputMismatchException) {
        println("오류가 발생했습니다.")
        return
    }

    num1 = inputNum1.toInt()
    num2 = inputNum2.toInt()

    // abstractOperation 클래스의 상속받은 operate 함수 호출
    var result = calculator.operate(num1, operator, num2)

    PrintResult().printResult(num1, operator, num2, result)
    while (true) {
        reCalculate = result.toInt()
        reOperator = operator
        print("연산자 : ")
        operator = readLine().toString()
        if (operator == "") {
            num1 = reCalculate
            operator = reOperator
        } else if (operator == "exit") {
            return
        } else {
            try {
                while (true) {
                    if (IsPresent().isPresent(operators, operator)) {
                        break
                    } else {
                        println("연산자가 아닙니다. 다시 입력하세요.")
                        print("연산자 : ")
                        operator = readLine().toString()
                        continue
                    }
                }
                print("숫자2 : ")
                inputNum2 = readLine().toString()

                while (true) {
                    if (IsNum().isNum(inputNum2)) {
                        break
                    } else {
                        println("숫자가 아닙니다. 다시 입력하세요.")
                        print("숫자2 : ")
                        inputNum2 = readLine().toString()
                        continue
                    }
                }
            } catch (e : InputMismatchException) {
                println("오류가 발생했습니다.")
                return
            }
            num1 = result.toInt()
            num2 = inputNum2.toInt()
        }
        result = calculator.operate(num1, operator, num2)
        PrintResult().printResult(num1, operator, num2, result)
    }
}