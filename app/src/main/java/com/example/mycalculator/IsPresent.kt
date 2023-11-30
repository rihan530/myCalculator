package com.example.mycalculator

class IsPresent {

        //입력받은 연산자가 맞는지 검증
    fun <T> isPresent(arr: Array<T>, target: T): Boolean {
        return arr.contains(target)
    }
}