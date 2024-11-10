package com.emil.org.emil.kotlincourse.lesson18.Homework

class Dog : Animal() {
    override fun makeSound(song: String) {
        animalSound("Wow", Colors.YELLOW)
    }
}
