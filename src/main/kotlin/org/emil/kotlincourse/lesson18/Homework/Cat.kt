package com.emil.org.emil.kotlincourse.lesson18.Homework

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.RED, Background.WHITE)
    }
}
