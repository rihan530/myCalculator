package com.example.mycalculator

import java.util.Arrays.equals
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

    try {
        print("숫자1 : ")
        inputNum1 = readLine().toString()

        while (true) {
            if (isNum(inputNum1)) {
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
            if (isPresent(operators, operator)) {
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
            if (isNum(inputNum2)) {
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

    var result = calculate(num1, operator, num2)

    println("$num1 $operator $num2 = $result")
    while (true) {
        reCalculate = result
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
                    if (isPresent(operators, operator)) {
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
                    if (isNum(inputNum2)) {
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
            num1 = result
            num2 = inputNum2.toInt()
        }
        result = calculate(num1, operator, num2)
        println("$num1 $operator $num2 = $result")
    }
}

//Calculator 클래스 생성
class Calculator{
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun division(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun remainder(num1: Int, num2: Int): Int {
        return num1 % num2
    }
}

//입력받은 연산자에 맞게 계산하여 반환
fun calculate(num1: Int, operator : String, num2 : Int): Int {
    when (operator) {
        "+" -> return Calculator().plus(num1, num2)
        "-" -> return Calculator().minus(num1, num2)
        "*" -> return Calculator().multiply(num1, num2)
        "/" -> return Calculator().division(num1, num2)
        "%" -> return Calculator().remainder(num1, num2)
    }
    return 0
}

//입력받은 연산자가 맞는지 검증
fun <T> isPresent(arr: Array<T>, target: T): Boolean {
    return arr.contains(target)
}

// 입력받은 값이 숫자인지 검증하여 숫자면 true, 아니면 false를 반환
fun isNum(string: String) : Boolean {
    var input : Char
    var result = true

    for (i in 0 until string.length) {
        input = string.elementAt(i)
        if (input.toInt() < 48 || input.toInt() > 57) {
            result = false
        }
    }
    return result
}