package com.emil.org.emil.kotlincourse.lesson18.Homework

class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}