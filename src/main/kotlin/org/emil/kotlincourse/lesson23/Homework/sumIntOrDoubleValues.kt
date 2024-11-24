package com.emil.org.emil.kotlincourse.lesson23.Homework

/*
Задача 5
Напишите функцию sumIntOrDoubleValues,
которая принимает список элементов типа Any и возвращает сумму всех целочисленных (Int)
и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.
 */

fun sumIntOrDoubleValues(list: List<Any?>): Double{
    var sum = 0.0
    for (i in list)
        if (i is Int) {
            sum += i.toDouble()
        } else if (i is Double) {
            sum += i
        } else continue
    return sum
    }



