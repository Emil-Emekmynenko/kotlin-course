package com.emil.org.emil.kotlincourse.lesson18.Homework

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
