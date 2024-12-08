package com.emil.org.emil.kotlincourse.lesson27.Homework

/*
Задание 2: Использование apply для инициализации объекта Employee
Создайте объект Employee и используйте apply для инициализации его полей email и department.

 */

fun main() {
    val employee = Employee("Biba",7,"bu").apply {
        email = "buba@gmail.com"
        department = "Technical"
    }
}