package com.emil.org.emil.kotlincourse.lesson26.Homework

/*
Напишите функцию, которая принимает другую функцию без аргументов и возвращаемого значения.
 */
fun funUntil(arg: () -> Unit) {}

/*
Создайте функцию, принимающую функцию с одним аргументом типа Int и возвращающую String.
 */
fun funString(arg: (Int) -> String) {}

/*
Реализуйте функцию, принимающую функцию расширения типа Int, принимающую String и возвращающую Boolean.
 */
fun funExtensionInt(arg: Int.(String) -> Boolean) {}

/*
Напишите функцию, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.
 */
fun funDouble2(arg1: (Double, Double) -> Boolean) {}

/*
Напишите функцию, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>
 */
fun <T>funList(arg: (T) -> List<T>) {}

/*
Создайте функцию, принимающую функцию с аргументом типа String и возвращающую другую функцию,
принимающую Int и возвращающую Boolean.
 */
fun funBoolean(arg: (String) -> ((Int) -> Boolean)) {}

/*
Напишите функцию, которая принимает список чисел, множество строк,
функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>
 */
fun funMap(
    arg1: List<Int>,
    arg2: Set<String>,
    arg3: (List<Int>, Set<Int>) -> Map<String, Int>)
{

}

/*
Напишите функцию, возвращающую строку, принимающую число и функцию, принимающую число и возвращающую строку
 */
fun funString2(arg1: Int, arg2: (Int) -> String): String {
    return arg2(arg1)
}

/*
Напишите функцию, принимающую функцию, которая возвращает функцию без аргументов и возвращаемого значения.
 */
fun funFucking(arg1: () -> () -> Unit){}