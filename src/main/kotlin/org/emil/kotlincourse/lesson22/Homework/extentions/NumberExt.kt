package com.emil.org.emil.kotlincourse.lesson22.Homework.extentions

import kotlin.math.absoluteValue

/*
Задача 4: Проверка допустимого отклонения числа
Реализуйте метод расширения within для класса Number,
который проверяет, что текущее число отклоняется от эталонного
не более допустимого значения. Метод принимает два параметра:
other — число для сравнения и deviation — максимально допустимое отклонение.
Метод должен возвращать true, если разница между текущим числом и числом для
сравнения не превышает заданное отклонение. Протестируйте функцию на разных типах чисел.
Для получения отклонения, у разницы чисел нужно вызвать свойство absoluteValue.

 */

fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = (this.toDouble() - other.toDouble()).absoluteValue
    return if (difference <= deviation.toDouble() ) true else false
}