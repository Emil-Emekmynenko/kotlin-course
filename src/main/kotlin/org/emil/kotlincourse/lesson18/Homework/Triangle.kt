package com.emil.org.emil.kotlincourse.lesson18.Homework

class Triangle(val base: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}