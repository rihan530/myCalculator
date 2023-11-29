package com.example.mycalculator

fun main() {
    var num1 = readLine()!!.toInt()
    var operator = readLine().toString()
    var num2 = readLine()!!.toInt()

    val result = calculate(num1, operator, num2)
    println("$num1 $operator $num2 = $result")
}

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
}

fun calculate(num1: Int, operator : String, num2 : Int): Int {
    when (operator) {
        "+" -> return Calculator().plus(num1, num2)
        "-" -> return Calculator().minus(num1, num2)
        "*" -> return Calculator().multiply(num1, num2)
        "/" -> return Calculator().division(num1, num2)
    }
    return 0
}