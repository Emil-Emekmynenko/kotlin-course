package com.emil.org.emil.kotlincourse.lesson7

import javax.sql.RowSetListener

fun main () {
    cycle1()
    println()
    cycle2()
    println()
    cycle3()
    println()
    cycle4()
    println()
    cycle5()
    println()
    cycle6()
    println()
    cycle7()
    println()
    cycle8()
    println()
    cycle9(listOf(2,4,5,61,3,5,62))
    println()
    cycle10()
}

/*
Вывод чисел от 1 до 10:
Напишите программу, которая выводит числа от 1 до 10 с использованием цикла while.
 */

fun cycle1 () {
    var count = 0
    while (count++ < 10){
        print(count)
        print(" ")
    }
}

/*
Четные числа до 20: Используя цикл while, выведите все четные числа от 2 до 20.
 */

fun cycle2 () {
    var count = 1
    while (count++ < 20) {
        if (count % 2 == 0)
            print(count)
        print(" ")
    }
}

/*
Сумма чисел от 1 до 50: Напишите программу, которая суммирует числа от 1 до 50 с помощью цикла while.
 */
fun cycle3 () {
    var count = 0
    var sum = 0
    while (count++ < 50)
        sum += count
    print(sum)
}

/*
Вывод чисел от 10 до 1: Используя цикл do while, выведите числа от 10 до 1.
 */
fun cycle4 () {
    var count = 10
    do {
        print(count)
        print(" ")
    } while (--count >= 1)
}

/*
Факториал числа 5: Напишите программу,
которая вычисляет факториал числа 5 с использованием цикла while.
 */

fun cycle5 () {
    var count = 5
    var result = 1
    while (count > 1) {
        result *= count--
        print(result)
        print(" ")
    }
}

/*
Сумма четных чисел до 100: Используя цикл while, найдите сумму всех четных чисел от 2 до 100.
 */
fun cycle6 () {
    var count = 1
    var sum = 0
    while (count++ < 100){
        if (count % 2 == 0)
            sum += count
    }
    print(sum)
}

/*
Таблица умножения на 3: Напишите программу, которая выводит таблицу умножения на 3.
 */

fun cycle7 () {
    val count = 1..9
    val count2 = 3
    for (i in count) {
        print("$count2 х $i = ${i * count2}")
        println()
    }
}

/*
Вывод символов до точки: Используя цикл do while, выведите символы строки "Kotlin." по одному до точки.
 */
fun cycle8 () {
    val string = "Kotlin."
    var count = 0
    do {
        println(string[count])
        count++
    }
    while (string[count] != '.')
}

/*Наибольшее число из списка: Напишите программу,
которая находит наибольшее число из заданного списка чисел с использованием цикла while.
Пример списка: [5, 12, 7, 22, 9]
 */
fun cycle9 (list: List<Int>) {
    var index = 0
    var maxNumber = list[0] // Изначально предполагаем, что первый элемент - максимальный
    // Цикл для перебора всех элементов списка
    while (index < list.size) {
        if (list[index] > maxNumber) {
            maxNumber = list[index] // Обновляем максимальное число
        }
        index++ // Переходим к следующему элементу
    }
    println(maxNumber)
}


/*
Генерация чисел до 15: Используя цикл do while, напишите программу, которая генерирует и выводит числа от 1 до 15.
 */

fun cycle10 () {
    var count = 1
    do {
        print(count)
        print(" ")
    }
    while (count++ < 15)
}