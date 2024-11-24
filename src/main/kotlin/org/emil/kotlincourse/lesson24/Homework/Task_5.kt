package com.emil.org.emil.kotlincourse.lesson24.Homework

class ErrorIndex(value1: ArrayIndexOutOfBoundsException) : RuntimeException(value1)

fun main() {
    try {
        val value2 = listOf(1, 2)
        println(value2[2])

    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Ошибка ${e.message}")
        throw ErrorIndex(value1 = ArrayIndexOutOfBoundsException("Так делать не нужно, это исключение сам придумал"))
    }
}