package com.emil.org.emil.kotlincourse.lesson23.Homework

fun getStringLengthOrZero(variable : Any?): Int{
    val value = variable as? String
    return value?.length ?: 0
}