package com.emil.org.emil.kotlincourse.lesson21.Homework

/*
Задание 5
Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
 */

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(item: String): List<String> {
        return item.split(" ")
    }

    override fun transformList(list: List<String>): List<List<String>> {
        return list.map { it.split(" ") }
    }

}