package com.emil.org.emil.kotlincourse.lesson21.Homework

/*
Задание 9
Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
Реализуй проверку, что число чётное.
 */

class OddValidator: Validator<Int> {
    override fun checkVariableType(item: Int): Boolean {
        return item % 2 == 0
    }
}