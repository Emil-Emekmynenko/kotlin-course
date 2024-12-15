package com.emil.org.emil.kotlincourse.lesson27.Homework

/*
Задание 1. Функция высшего порядка.

Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента
и измеряет время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах.
Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.

Для проверки результата можно выполнить в ней например такой ресурсоёмкий код:

val myFunction = {
    val list = List(10000000) { (0..10000).random() }
    list.sorted()
}

 */

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    timeTracker { myFunction() }

}

fun timeTracker(arg: () -> Any): Long{
    val start = System.currentTimeMillis()
    arg()
    val end = System.currentTimeMillis()
    val result = end - start
    println("Время выполнения: $result мс")
    return result
}

