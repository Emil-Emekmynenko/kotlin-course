package com.emil.org.emil.kotlincourse.lesson23.Homework

fun safeCastToList(variable: Any): Int {
    val value = variable as? List<*>
    return if(value is List<*>) value.size else -1
}