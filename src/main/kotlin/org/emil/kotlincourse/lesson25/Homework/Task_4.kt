package com.emil.org.emil.kotlincourse.lesson25.Homework

import com.emil.org.emil.kotlincourse.lesson12.sum

/*
Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
По аналогии с предыдущим заданием выполни трансформации и проверки.
Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
 */

fun sumNumbers(num: Long): Int{
    val str = num.toString()
    return str.map { it.digitToInt()}.sum()
}

fun main() {
    //анонимную функцию
    val sumNumbers0 = fun (num: Long): Int{
        val str = num.toString()
        return str.map { it.digitToInt()}.sum()
    }

    //лямбда выражение с указанием типа
    val sumNumbers1: (Long) -> Int = {num ->
       num.toString().map { it.digitToInt()}.sum()
   }

    //лямбда выражение без указания типа
    val sumNumbers2 = {num: Long ->
        num.toString().map { it.digitToInt()}.sum()
    }
    println(sumNumbers0(12341234134))
    println(sumNumbers1(12))
    println(sumNumbers2(1234123413434534))


}