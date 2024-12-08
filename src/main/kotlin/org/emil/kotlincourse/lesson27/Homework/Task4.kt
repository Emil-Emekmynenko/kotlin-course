package com.emil.org.emil.kotlincourse.lesson27.Homework

/*
Задание 4: Использование with для преобразование Person в Employee
Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee,
указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.
 */

fun main() {
    val person = Person("Ivan", 18)

    val employee = with(person){
        Employee(name, age, position = "QA automation")
    }

}