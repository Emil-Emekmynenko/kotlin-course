package com.emil.org.emil.kotlincourse.lesson18.Homework

class Cat : Animal() {
    override fun makeSound(song: String) {
        animalSound("Meow", Colors.RESET)
    }
}
