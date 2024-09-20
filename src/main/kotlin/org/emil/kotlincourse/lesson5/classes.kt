package com.emil.org.emil.kotlincourse.lesson5

fun main () {
    val sum = 5 + 5
    val diff = 10 / 5
    val product = 10 * 5
    val quotient = 10 / 5
    val remainder = 10 % 5
    val isEqual = (5 == 4)
    val isNotEqual = (5 != 5)
    val isGreater = (5 > 3)
    val isLesser = (5 < 5)
    val isGreaterOrEqual = (5 >= 5)
    val isLesserOrEqual = (5 <= 5)
    val andResult = false && false
    // преоритет всегда за &&, потом ||
    // true && false = false
    // true || false = true
    val orResult = true || true
    val notResult = !(5 == 5)
    var number = 0
    number++ // конструкция увеличивается на 1 (инкремент)
    number-- // конструкция уменьшается на 1 (декремент)
    ++number // сначала добавляет к переменной 1, потом производится вычисление
    --number // сначала уменьшает от переменной 1, потом производится вычисление

    println(notResult)

    var name: String? = null
    val result = name ?: "Unknown"
// оператор Элвиса, если name = null, отдаём "Unknown", если name есть значение, выводим значение

    printVolume (null)
    printPrice(100.0, 15)
    printPrice(100.0, null)
}

fun printVolume (userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

fun printPrice (price: Double, sale: Int?) {
    val koeff = (100 - (sale  ?: 0)) / 100.0
    println(price * koeff)
}