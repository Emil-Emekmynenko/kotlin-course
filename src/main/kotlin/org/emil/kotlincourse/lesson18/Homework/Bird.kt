package com.emil.org.emil.kotlincourse.lesson18.Homework

class Bird : Animal() {
    override fun makeSound(song: String) {
        animalSound("Kar",Colors.GREEN)
    }
}