package com.emil.org.emil.kotlincourse.lesson21.Homework

/*
Задание 4
Создайте интерфейс Mapper<T, R>,
который будет определять метод для преобразования элементов типа T в элементы типа R.
 */

/*
Задание 6
Добавь к интерфейсу Mapper ещё один метод, который будет преобразовывать список
элементов типа T в список элементов типа R.
Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.
 */
interface Mapper<T, R> {
    fun transform(item: T): R

    fun transformList(list: List<T>): List<R>
}