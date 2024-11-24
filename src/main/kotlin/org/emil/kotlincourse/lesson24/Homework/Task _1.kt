package com.emil.org.emil.kotlincourse.lesson24.Homework

import kotlin.properties.Delegates

//NullPointerException
//ArrayIndexOutOfBoundsException
//ClassCastException
//NumberFormatException
//IllegalArgumentException — это исключение, которое сигнализирует о том, что аргумент,
// переданный в метод или функцию, является недопустимым или неправильным

//IllegalStateException — это исключение, которое сигнализирует о том,
// что объект находится в недопустимом состоянии для выполнения текущей операции.

//OutOfMemoryError - переполнение памяти (например в изменяемый список добавляем бесконечно параметры)

//StackOverflowError — это ограниченный по размеру участок памяти,
// в котором хранятся вызовы функций и их локальные переменные.
// Когда стек переполняется из-за слишком большого количества вызовов,
// программа завершает выполнение с ошибкой StackOverflowError

fun examplesOfErrors() {

    // 1. NullPointerException
    val value1 = listOf(1, 2, 3, null)
    val result1 = value1[3]
    println(result1!!)

    // 2. ArrayIndexOutOfBoundsException
    val value2 = listOf(1, 2)
    println(value2[2])

    // 3. ClassCastException
    val value3 = "Str"
    value3 as List<Int>

    // 4.NumberFormatException
    val value4 = "Str1"
    value4.toDouble()

    // 5.IllegalArgumentException
    val list = listOf(1, 2, 3)
    list.subList(2, 1)

    // 6.IllegalStateException
    val scanner = java.util.Scanner(System.`in`)
    scanner.close()
    scanner.nextLine()

    // 7.OutOfMemoryError
    val value7 = mutableListOf<String>()
    while (true){
        value7.add("Я тебя заполню полностью")
    }

    // 8.StackOverflowError
    errorsCall()

}

fun errorsCall(){
    errorsCall()
}
