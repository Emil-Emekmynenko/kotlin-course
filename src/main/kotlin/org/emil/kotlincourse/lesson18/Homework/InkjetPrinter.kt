package com.emil.org.emil.kotlincourse.lesson18.Homework

class InkjetPrinter : Printer() {
    private val colors = listOf(
        Pair(Colors.RED, Background.WHITE), // Красный текст на белом фоне
        Pair(Colors.GREEN, Background.WHITE), // Зеленый текст на белом фоне
        Pair(Colors.BLUE, Background.WHITE) // Синий текст на белом фоне
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var colorIndex = 0

        for (word in words) {
            val textColor = colors[colorIndex].first
            val backgroundColor = colors[colorIndex].second
            printColored(word, textColor, backgroundColor)
            colorIndex++
            if (colorIndex >= colors.size) {
                colorIndex = 0
            }
        }
    }
}