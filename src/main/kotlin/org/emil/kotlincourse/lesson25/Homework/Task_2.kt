package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
С помощью require проверь, что список не пустой.

- Создай аналогичную анонимную функцию.
- Создай аналогичное лямбда выражение с указанием типа.
- Создай лямбда выражение без указания типа.
- Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
 */

fun arithmeticMean(list: List<Int>): Double {
    require(list.isNotEmpty()) { "Нужен не пустой список" }
    return list.average()
}

fun main() {
    //аналогичную анонимную функцию
    val arithmeticMean0 = fun(list: List<Int>): Double {
        require(list.isNotEmpty()) { "Нужен не пустой список" }
        return list.average()
    }

    //лямбда выражение с указанием типа
    val arithmeticMean1: (list: List<Int>) -> Double = { list ->
        require(list.isNotEmpty()) { "Нужен не пустой список" }
        list.average()
    }
    //лямбда выражение без указания типа
    val arithmeticMean2 = { list: List<Int> ->
        require(list.isNotEmpty()) { "Нужен не пустой список" }
        list.average()
    }


    println(arithmeticMean(listOf(10, 10, 20, 20)))
    println(arithmeticMean1(listOf(-1, 1, 4, 5, 9, 0)))
    println(arithmeticMean2(listOf(-100, 100, 122, 5, 9, 0)))
    println(arithmeticMean0(listOf()))
}