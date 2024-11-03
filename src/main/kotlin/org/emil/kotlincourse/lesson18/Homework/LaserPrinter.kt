package com.emil.org.emil.kotlincourse.lesson18.Homework

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = splitText(text)
        for (word in words) {
            printColored(word, Colors.BLACK, Background.WHITE) // Черный текст на белом фоне
        }
    }
}
