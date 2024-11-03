package com.emil.org.emil.kotlincourse.lesson18.Homework

class Dog : Animal() {
    override fun makeSound() {
        printColored("Wow", Colors.BLACK, Colors.RED) // Синий цвет
    }
}
