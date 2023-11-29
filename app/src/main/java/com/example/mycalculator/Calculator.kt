package com.example.mycalculator

class Calculator{

    fun PlusOperation(plusOperation: PlusOperation, num1: Int, num2: Int): Double {
        return PlusOperation().operate(num1, num2)
    }

    fun MiusOperation(minusOperation: MinusOperation, num1: Int, num2: Int): Double {
        return MinusOperation().operate(num1, num2)
    }

    fun MultiplyOperation(multiplyOperation: MultiplyOperation, num1: Int, num2: Int): Double {
        return MultiplyOperation().operate(num1, num2)
    }

    fun DivisionOperation(divisionOperation: DivisionOperation, num1: Int, num2: Int): Double {
        return DivisionOperation().operate(num1, num2)
    }


}