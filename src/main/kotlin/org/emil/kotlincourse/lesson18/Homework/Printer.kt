package com.emil.org.emil.kotlincourse.lesson18.Homework

abstract class Printer {
    abstract fun print(text: String)

    protected fun splitText(text: String): List<String> {
        return text.split(" ")
    }
}