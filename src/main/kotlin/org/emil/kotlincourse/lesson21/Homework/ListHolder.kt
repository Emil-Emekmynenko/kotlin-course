package com.emil.org.emil.kotlincourse.lesson21.Homework

import com.emil.org.emil.kotlincourse.lesson10.addList

/*
Задание 3
Напишите класс ListHolder, который будет хранить список элементов
типа T и иметь метод для добавления и получения всех элементов.
 */

class ListHolder<T> {
    val list = mutableListOf<T>()

    // Метод получения всех элементов
    fun getAllElements(): List<T> {
        return list
    }

    // Метод добавления элемента
    fun addAllElements(item: T) {
        list.add(item)
    }
}