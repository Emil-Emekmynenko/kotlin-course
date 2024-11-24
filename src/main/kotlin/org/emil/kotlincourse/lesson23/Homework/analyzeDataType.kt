package com.emil.org.emil.kotlincourse.lesson23.Homework

fun analyzeDataType(variable : Any){
    when(variable){
        is String -> println("Это строка: $variable")
        is Int -> println("Это целое число: $variable")
        is List<*> -> println("Это список, количество элементов: ${variable.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${variable.size}")
        else -> println("Неизвестный тип данных")
    }
}