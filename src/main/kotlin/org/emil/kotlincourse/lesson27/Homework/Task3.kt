package com.emil.org.emil.kotlincourse.lesson27.Homework

fun main() {
    val person = Person("Ivan", 18).also {
        it.email = "buba@gmail.com"
    }
    printPerson(person)
}

fun printPerson(arg: Person){
    println("Информация об объекте Person" +
            "\n Name: ${arg.name}" +
            "\n Age: ${arg.age}" +
            "\n Email: ${arg.email}")
}

