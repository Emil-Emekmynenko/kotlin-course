package com.emil.org.emil.kotlincourse.lesson26.Homework

/*
Задания на разработку кода

- Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр,
оставляющую только строки, удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
Функция должна вернуть результат фильтрации исходного списка строк.

- Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
Функция должна вернуть результат преобразования исходного списка чисел.

- Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
определяющую условие для включения числа в сумму.
Функция должна вернуть сумму чисел, прошедших проверку.

- Напишите функцию combineAndTransform,
которая принимает две коллекции одного типа и функцию для их объединения и
преобразования в одну коллекцию другого типа.
Функция должна вернуть результат преобразования (коллекцию второго типа)

 */

/*
- Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр,
оставляющую только строки, удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
Функция должна вернуть результат фильтрации исходного списка строк.
 */
fun filterStrings(listStr: List<String>, funFilter: (String) -> Boolean): List<String> {
    return listStr.filter { funFilter(it) }
}

/*
- Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
Функция должна вернуть результат преобразования исходного списка чисел.
 */
fun applyToNumbers(listInt: List<Number>, funApplyToNumbers: (Number) -> Number): List<Number> {
    return listInt.map { funApplyToNumbers(it) }
}

/*
- Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
определяющую условие для включения числа в сумму.
Функция должна вернуть сумму чисел, прошедших проверку.
 */
fun sumByCondition(listInt: List<Number>, funFilterSum: (Number) -> Boolean): Number {
    return listInt.filter { funFilterSum(it) }.sumOf { it.toInt() }
}

/*
- Напишите функцию combineAndTransform,
которая принимает две коллекции одного типа и функцию для их объединения и
преобразования в одну коллекцию другого типа.
Функция должна вернуть результат преобразования (коллекцию второго типа)
 */
fun <T, R> combineAndTransform(
    list1: List<T>,
    list2: List<T>,
    transform: (List<T>, List<T>) -> List<R>
): List<R> {
    return transform(list1, list2)
}


fun main() {
    println("----Входные данные----")
    val list = listOf("aboba", "notAboba", "er", "eferrferferf")
    val list2 = listOf(1, 2, 4, 5, 6, 7)
    val list3 = listOf(100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0)
    val list4 = listOf(1, 2, 4)
    val list5 = listOf(1, 2, 3)
    val num = 10

    println("----Задание1----")
    println(filterStrings(list) { it == "aboba" })
    println(filterStrings(list) { it.length == 2 })

    println("----Задание2----")
    println(applyToNumbers(list2) { it.toFloat() })
    println(applyToNumbers(list2) { it.toDouble() / num })

    println("----Задание3----")
    println(sumByCondition(list2) { it.toInt() % 2 == 0 })
    println(sumByCondition(list3) { it.toDouble() / num >= 30.0 })

    println("----Задание4----")
    println(combineAndTransform(list4, list5) { l1, l2 ->
        (l1 + l2).map { it * it }
    })
    println(combineAndTransform(list4, list5) { l1, l2 ->
        (l1 + l2).filter { it > 2 }
    })
}