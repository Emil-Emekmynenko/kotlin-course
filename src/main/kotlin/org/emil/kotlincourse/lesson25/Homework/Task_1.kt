package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 1. Создай константу в файле с текстом. Создай функцию,
которая ничего не принимает и не возвращает и печатает в консоль текст константы.

- Создай аналогичную анонимную функцию.
- Создай аналогичное лямбда выражение с указанием типа.
- Создай лямбда выражение без указания типа.
- Проверь как функция работает

 */

const val TEXT = "I am Iron Man"

fun ironMan() {
    println(TEXT)
}

fun main() {

    //анонимную функцию
    val ironMan0 = fun () {
        println(TEXT)
    }

    //лямбда выражение с указанием типа
    val ironMan1: () -> Unit = {
        println(TEXT)
    }

    //лямбда выражение без указания типа
    val ironMan2 = {
        println(TEXT)
    }

    ironMan()
    ironMan0()
    ironMan1()
    ironMan2()

}