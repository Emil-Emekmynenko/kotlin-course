package com.emil.org.emil.kotlincourse.lesson24.Homework

class ErrorFavoriteNumber(messenger: String): AssertionError(messenger)

fun main() {

    try {
        favoriteNumber(8)
    } catch (e: ErrorFavoriteNumber){
        println("ErrorFavoriteNumber - Это не любимое число, его значение ${e.message}")
    }
    println("Дальше программа работает")
}
fun favoriteNumber(number: Int){
    if (number != 7){
        throw ErrorFavoriteNumber("$number")
    }
    println(number)
}