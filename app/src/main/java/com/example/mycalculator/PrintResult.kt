package com.example.mycalculator

class PrintResult {

    //계산결과 메시지 출력
    fun printResult(num1: Int, operator: String, num2: Int, result : Double) {
        when(operator) {
            "+" -> println("$num1 더하기 $num2 결과는 : ${result.toInt()} 입니다.")
            "-" -> println("$num1 빼기 $num2 결과는 : ${result.toInt()} 입니다.")
            "*" -> println("$num1 곱하기 $num2 결과는 : ${result.toInt()} 입니다.")
            "/" -> println("$num1 나누기 $num2 결과는 : ${result.toInt()} 입니다.")
        }
    }
}