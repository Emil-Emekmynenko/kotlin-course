package com.emil.org.emil.kotlincourse.lesson22.Homework.extentions

/*
Задача 3: Переворот элементов пары
Реализуйте метод расширения revert для класса Pair, который меняет местами первый и второй элементы пары. Метод должен возвращать новую пару с перевернутыми элементами. Протестируйте эту функцию на различных парах значений, в том числе null.

 */

fun <K, V>Pair<K, V>.revert(): Pair<V?, K?> {
    return Pair(second, first)
}