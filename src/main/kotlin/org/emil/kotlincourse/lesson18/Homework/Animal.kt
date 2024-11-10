package com.emil.org.emil.kotlincourse.lesson18.Homework

abstract class Animal {
    abstract fun makeSound(sound: String)

    protected fun animalSound (sound: String, color: String){
        printColored(sound, color)
    }
    fun printColored(text: String, color: String, background: String = ""){
        println("$color$background$text${Colors.RESET}")
    }
}
