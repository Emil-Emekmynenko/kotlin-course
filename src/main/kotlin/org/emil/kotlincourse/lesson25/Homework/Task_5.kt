package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 5. Создай функцию расширение списка чисел,
которая будет возвращать список уникальных чисел (без дубликатов).

Создай аналогичную анонимную функцию.
Создай аналогичное лямбда выражение с указанием типа.
Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

 */

fun List<Number>.uniqueNumbers(): List<Number> {
    return this.distinct()
}

fun main() {
    //анонимную функцию
    val uniqueNumbers0 = fun List<Number>.(): List<Number> {
        return this.distinct()
    }

    //лямбда выражение с указанием типа
    val uniqueNumbers1: List<Number>.() -> List<Number> = {
        this.distinct()
    }

    println(listOf(1,1,2,2,3,4).uniqueNumbers0())
    println(listOf(1.0,1.0,2.0,2.0,3.0,4.0).uniqueNumbers1())

    println(listOf(1f,1f,2f,2f,3f,4f).uniqueNumbers0())
    println(listOf(1.0f,1.0f,2.0f,2.0f,3.0f,4.0f).uniqueNumbers1())

}