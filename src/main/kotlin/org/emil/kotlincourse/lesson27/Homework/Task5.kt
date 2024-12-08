package com.emil.org.emil.kotlincourse.lesson27.Homework

/*
Задание 5: Использование run для преобразования и инициализации Employee
Создайте объект класса Person. Используйте функцию run, чтобы инициализировать объект Employee,
добавить ему email и department с помощью apply, вернуть инициализированный объект.
 */

fun main() {
    val person = Person("Ivan", 18).apply{
        email = "buba@gmail.com"
    }

    val employee = person.run {
        Employee(name, age,"QA").apply {
            email = person.email
            department = "Tecnical"
        }
    }
    println(employee.name)
    println(employee.age)
    println(employee.position)
    println(employee.email)
    println(employee.department)

}