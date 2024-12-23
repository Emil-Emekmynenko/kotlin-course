package com.emil.org.emil.kotlincourse.lesson18.Homework

import com.emil.org.emil.kotlincourse.lesson18.printColored

class Logger () {

    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> printColored("$level: $message", Colors.YELLOW)
            "ERROR" -> printColored("$level: $message", Colors.BLUE, Background.RED)
            "DEBUG" -> printColored("$level: $message", Colors.RESET)
            else -> println("INFO: $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Случилось непонятное")
    }
}