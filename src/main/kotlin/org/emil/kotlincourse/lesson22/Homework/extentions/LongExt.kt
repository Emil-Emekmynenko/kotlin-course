package com.emil.org.emil.kotlincourse.lesson22.Homework.extentions

/*
- Определите функцию-расширение для класса длинного числа,
допускающее null, которая не принимает аргументов и возвращает строку.
 */

fun Long?.longFun(): String{
    return this.toString()
}