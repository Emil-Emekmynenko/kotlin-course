package com.emil.org.emil.kotlincourse.lesson18.Homework

class Bird : Animal() {
    override fun makeSound() {
        printColored("Kar",Colors.BLACK, Background.GREEN)
    }
}