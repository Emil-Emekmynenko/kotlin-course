package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 6. Создай функцию расширение словаря из строк и чисел,
которая принимает число и возвращает список ключей, длина которых
меньше их значений но больше заданного в функции аргумента.
В случае если список получается пустой нужно выкинуть исключение IllegalState.
По аналогии с предыдущим заданием выполни трансформации и проверки.
 */

fun Map<String,Int>.keysLength(num: Int): List<String> {
    val numList = mutableListOf<String>()
    for ((key,value) in this)
        if (key.length < value && key.length > num)
            numList.add(key)
    if (numList.isEmpty()) throw IllegalStateException()
    return numList
}

fun main() {
    //анонимную функцию
    val keysLength0 = fun Map<String,Int>.(num: Int): List<String> {
        val numList = mutableListOf<String>()
        for ((key,value) in this)
            if (key.length < value && key.length > num)
                numList.add(key)
        if (numList.isEmpty()) throw IllegalStateException()
        return numList
    }

    //лямбда выражение с указанием типа
    val keysLength1: Map<String,Int>.(num: Int) -> List<String> = {num ->
        val numList = mutableListOf<String>()
        for ((key,value) in this)
            if (key.length < value && key.length > num)
                numList.add(key)
        if (numList.isEmpty()) throw IllegalStateException()
        numList
    }

    println(mapOf("Биба" to 7, "Боба" to 3).keysLength0(2))
    println(mapOf("Биба" to 7, "Боба" to 3).keysLength1(2))

    println(mapOf("Бибаefrerferf" to 7, "Боба" to 3).keysLength1(4))


}