package com.emil.org.emil.kotlincourse.lesson21.Homework

fun main() {
    println("---Задание 1---")
    println(toMap(listOf(1, 2, 3), listOf("one", "two")))

    println("---Задание 2---")
    println(getMiddleElement(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

    println("---Задание 3---")
    val listHolder = ListHolder<Int>()
    listHolder.list.addAll(0, listOf(1, 2, 3, 4, 5, 6, 7))
    listHolder.addAllElements(999)
    println(listHolder.getAllElements())

    println("---Задание 4---")
    println("Просто реализован интерфейс Mapper")

    println("---Задание 5---")
    val phrasesToListOfStrings = PhrasesToListOfStrings()
    println(phrasesToListOfStrings.transform("Мнимая реальность"))

    println("---Задание 6---")
    println(phrasesToListOfStrings.transformList(listOf("Тор", "Капитан Америка", "Железный человек")))

    println("---Задание 7---")
    println("Просто реализован интерфейс Validator")

    println("---Задание 8---")
    val stringValidator = StringValidator()
    println(stringValidator.checkVariableType("   "))

    println("---Задание 9---")

    println("---Задание 10---")
    val listValidator = ListValidator<Int>()

    println(listValidator.checkVariableType(listOf(1, 2, 3, null, 5, 6, 7, 8)))


}

/*
Задание 1
Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
которая будет создавать карту из списков ключей и значений.
Если ключей или значений больше, то оставшиеся ключи или значения не записываем в словарь.
 */

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val newMap = mutableMapOf<K, V>()
    val sizeKeys = keys.size
    val sizeValues = values.size
    val resultSize = if (sizeKeys > sizeValues) sizeKeys else sizeValues
    var i = 0
    while (i != resultSize - 1) {
        newMap[keys[i]] = values[i]
        i++
    }
    return newMap
}

/*
Задание 2
Напишите функцию getMiddleElement<T>(list: List<T>): T?,
которая будет возвращать средний элемент списка, если он существует.
 */

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isEmpty()) return null
    if (list.size == 1) return list[0]
    val indexList = list.size / 2
    val result = list[indexList - 1]
    return result
}
