package com.emil.org.emil.kotlincourse.lesson23.Homework

fun main(){
    val value1 = listOf(null, null)
    val value2 = "Str"
    println(safeCastToList(value1))

    println(getStringLengthOrZero(value2))

    println(sumIntOrDoubleValues(listOf(1, "sdfdf", 2.56, 4, "ewefwef", null )))

    println(squareFun(99))

    tryCastToListAndPrint(listOf("бобa", 777, null, ""))
    tryCastToListAndPrint("erferf")
}