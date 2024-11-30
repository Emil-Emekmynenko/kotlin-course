package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 3. Создай функцию, которая принимает список строк и число,
а возвращает список из строк, длина которых больше или равна заданному числу.
Если список пуст, нужно выкинуть исключение.
По аналогии с предыдущим заданием выполни трансформации и проверки.
 */

fun lengthElementsList(list: List<String>, num: Int): List<String> {
    val resultList = list.filter { it.length >= num }
    require(resultList.isEmpty()){"В списке нет ни одной, удовлетворяющей условиям, строки"}
    return resultList
}

fun main() {
    //анонимную функцию
    val lengthElementsList0 = fun (list: List<String>, num: Int): List<String> {
        val resultList = list.filter { it.length >= num }
        require(resultList.isNotEmpty()){"В списке нет ни одной, удовлетворяющей условиям, строки"}
        return resultList
    }

    //лямбда выражение с указанием типа
    val lengthElementsList1: (list: List<String>, num: Int) -> List<String> = { list, num ->
        val resultList = list.filter { it.length >= num }
        require(resultList.isNotEmpty()){"В списке нет ни одной, удовлетворяющей условиям, строки"}
        resultList
    }

    //лямбда выражение без указания типа
    val lengthElementsList2 = {list: List<String>, num: Int ->
        val resultList = list.filter { it.length >= num }
        require(resultList.isNotEmpty()){"В списке нет ни одной, удовлетворяющей условиям, строки"}
        resultList
    }

    println(lengthElementsList0(listOf("erferf","efrfeerf","erfe","erferferf"),5))
    println(lengthElementsList1(listOf("erferf","efrfeerf","erfe","erferferf"),3))
    println(lengthElementsList2(listOf("erferf","efrfeerf","erfe","erferferf"),100))
}