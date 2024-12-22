package com.emil.org.emil.kotlincourse.lesson30.Homework

/*
Задание 2
Создай функцию, которая выводит на печать человекочитаемые названия
типов недвижимости в порядке возрастания длины названия enum.
 */

fun printNameTypeProperty(){
    TypeOfResidentialProperty.entries.sortedBy { it.name.length }.forEach { println(it.translation )}
}
fun main() {
    printNameTypeProperty()
}