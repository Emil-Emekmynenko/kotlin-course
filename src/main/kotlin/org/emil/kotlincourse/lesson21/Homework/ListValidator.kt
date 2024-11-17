package com.emil.org.emil.kotlincourse.lesson21.Homework
/*
Задание 10
Создай класс ListValidator
с дженериком, ограниченным типом Number
имплементируй интерфейс Validator
типизированный по типу List с nullable типом дженерика класса
Реализуй проверку:
что ни один элемент списка не является null
Ни один элемент приведённый к типу Double не равен 0.0

 */
class ListValidator<N: Number> : Validator<List<Number?>> {
    override fun checkVariableType(item: List<Number?>): Boolean {
        val result = item.map { it?.toDouble() }
        return !result.contains(null) && !result.contains(0.0)
    }
}