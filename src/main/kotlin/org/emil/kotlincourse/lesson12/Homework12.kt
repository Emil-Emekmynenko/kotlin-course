package com.emil.org.emil.kotlincourse.lesson12

fun main() {
    println(averageValue(listOf(1,2,3,4,5)))
    printNumbersUntil(7)
    println()
    println(isEven(2))
    println()
    println(findFirstNegative(listOf(1, 2, -3, 4, 5)))
    println()
    processList(listOf("ofvr", null, "erfer"))
    println()
    drawRectangle(10,10)
}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun funEmpty(){}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun sum2(a: Int, b: Int) = a + b

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun str(string: String){}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun averageValue (list: List<Int>): Double{
    var result = 0
    for (i in list)
        result += i
    return result.toDouble() / list.size
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun lengthString(str: String?): Int? = str?.length

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun nullDouble(): Double?{
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun nullList(list: List<Int>?){}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun nullString(number: Int): String?{
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun nullList2(): List<String?>{
    val str: List<String?> = listOf("3242")
    return str
}

//Напишите сигнатуру функции,
//которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun allNull(number: Int?,str: String?): Boolean?{
    return null
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number: Int) = number * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// Задача 3:
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(number: Int) {
    if (number < 1)
        return
    for (i in 1..number) {
        println(i)
    }
}
//    var i = 0
//    while (i++ < number) {
//        print(i)
//    }
//}

// Задача 4:
// Создайте функцию findFirstNegative,
// которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(list: List<Int>): Int? {
    for (i in list) {
        if (i < 0)
            return i
    }
    return null
}

// Задача 5:
// Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(list: List<String?>) {
    for (i in list) {
        if (i == null) {
            return
        }
        println(i)
    }
}

/*
Сделай рефакторинг функции, через определение вспомогательных приватных функций.
Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
Сначала сделай запуск функции и посмотри на результат её работы.
Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.
 */
fun typeVariable (number: Int, str: String) {
    if (number <= 0) throw IllegalArgumentException("$str должно быть положительным и больше нуля")
}

fun borderPicture (number: Int) {
    var line = "+"
    for (i in 1 until number - 1) {
        line += "-"
    }
    line += "+\n"
    print(line)
}

fun bordersLateral (num1: Int, num2: Int) {
    for (i in 1 until num2 - 1) {
        var middleLine = "|"
        for (j in 1 until num1 - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}


fun drawRectangle(width: Int, height: Int) {
    typeVariable(width,"width")
    typeVariable(height, "height")

    // Верхняя граница
    borderPicture(width)

    // Боковые границы
    bordersLateral(width, height)

    // Нижняя граница
    borderPicture(width)
}

