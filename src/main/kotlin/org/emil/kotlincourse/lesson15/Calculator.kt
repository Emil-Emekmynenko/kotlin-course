package com.emil.org.emil.kotlincourse.lesson15

class Calculator {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun main() {
    val result = Calculator.add(5, 3)
    println("Result: $result")
}