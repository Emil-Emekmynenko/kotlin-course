package com.emil.org.emil.kotlincourse.lesson27.Homework

/*
Задание 6: Использование let для безопасного преобразования Person в Employee
Создайте функцию, которая принимает объект класса Person?, который может быть null.
В функции используйте функцию let для создания Employee, только если объект Person не null.
В противном случае возвращается null
 */

fun transformLet(arg: Person?): Employee?{
    return arg?.let {
        Employee(it.name, it.age, "QA").apply {
            email = it.email
            department = "Technical"
        }
    }
}
fun main() {
    val person = Person("Ivan", 18,).apply {
        email = "buba@gmail.com"
    }

    val employee = transformLet(person)
    println(employee?.name)
    println(employee?.age)
    println(employee?.position)
    println(employee?.email)
    println(employee?.department)

    val nullPerson: Person? = null
    println(transformLet(nullPerson))

}