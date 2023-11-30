package com.example.mycalculator

// Calculator 클래스를 별도의 파일로 생성 및 추상화
//class Calculator{
//
//    fun PlusOperation(plusOperation: PlusOperation, num1: Int, num2: Int): Double {
//        return PlusOperation().operate(num1, num2)
//    }
//
//    fun MiusOperation(minusOperation: MinusOperation, num1: Int, num2: Int): Double {
//        return MinusOperation().operate(num1, num2)
//    }
//
//    fun MultiplyOperation(multiplyOperation: MultiplyOperation, num1: Int, num2: Int): Double {
//        return MultiplyOperation().operate(num1, num2)
//    }
//
//    fun DivisionOperation(divisionOperation: DivisionOperation, num1: Int, num2: Int): Double {
//        return DivisionOperation().operate(num1, num2)
//    }
//}

class Calculator: AbstractOperation() {
    override fun operate(num1: Int, operator: String, num2: Int): Double {
        when (operator) {
            "+" -> return PlusOperation().operate(num1, num2)
            "-" -> return MinusOperation().operate(num1, num2)
            "*" -> return MultiplyOperation().operate(num1, num2)
            "/" -> return DivisionOperation().operate(num1, num2)
        }
        return 0.0
    }
}