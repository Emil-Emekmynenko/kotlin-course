package com.emil.org.emil.kotlincourse.lesson24.Homework


fun main() {

    try {
        examplesOfErrors()

    } catch (e: Throwable){
        when(e){
            is NullPointerException -> println("NullPointerException")
            is ClassCastException -> println("ClassCastException")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is IllegalStateException -> println("IllegalStateException")
            is OutOfMemoryError -> println("OutOfMemoryError")
            is StackOverflowError -> println("StackOverflowError")
            else -> println("Другая неизвестная ошибка")
        }
    }

}