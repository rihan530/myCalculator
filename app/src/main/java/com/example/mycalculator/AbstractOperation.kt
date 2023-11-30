package com.example.mycalculator

abstract class AbstractOperation {
    abstract fun operate(num1: Int, operator : String, num2: Int): Double
}