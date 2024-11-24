package com.emil.org.emil.kotlincourse.lesson23.Homework

/*
Создайте функцию, которая принимает параметр типа Any.
Функция гарантированно ожидает число (в виде числа или строки,
например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа.
Если придёт число, его нужно возвести в квадрат, если придёт строка,
то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

 */

fun squareFun(num: Any?): Double {
    return if (num is Int) {
        (num * num).toDouble()
    } else if (num is Double) {
        num * num
    } else if (num is String) {
        num.toDouble() * num.toDouble()
    } else throw IllegalArgumentException("Не верный тип")
}