package com.emil.org.emil.kotlincourse.lesson21.Homework
/*
Задание 7
Напишите интерфейс Validator<T>,
который будет проверять значение типа T на соответствие определенным
условиям и возвращать булево значение (успешная или неуспешная проверка).
 */

interface Validator<T> {
    fun checkVariableType(item: T): Boolean
}