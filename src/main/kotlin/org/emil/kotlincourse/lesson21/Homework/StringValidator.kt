package com.emil.org.emil.kotlincourse.lesson21.Homework

/*
Задание 8
Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
 */

class StringValidator : Validator<String?> {
    override fun checkVariableType(item: String?): Boolean {
        return (item != null) && (item != "") && item.isNotBlank()
    }
}