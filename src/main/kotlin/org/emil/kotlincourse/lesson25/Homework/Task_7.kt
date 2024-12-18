package com.emil.org.emil.kotlincourse.lesson25.Homework

/*
Задание 7. Создай функцию расширения словаря из списка и множества,
которая принимает все известные тебе типы
(вспомни все что знаешь и под каждый тип создай аргумент)
и возвращает строку. Функция должна распечатать все данные,
которые тебе в ней доступны и вернуть конкатенацию всех данных которые
ей доступны (порядок неважен). Конкатенация - это присоединение.
Код должен быть отформатирован таким образом, чтобы легко читался.

По аналогии с предыдущим заданием выполни трансформации.

 */

fun Map<List<*>,Set<*>>.allTypes(
    arg1: Byte,
    arg2: Short,
    arg3: Int,
    arg4: Long,
    arg5: Float,
    arg6: Double,
    arg7: String,
    arg8: Boolean,
    arg9: Char,
    arg10: Any,
): String {
    val str = "$arg1" +
            "$arg2" +
            "$arg3" +
            "$arg4" +
            "$arg5" +
            "$arg6" +
            arg7 +
            "$arg8" +
            "$arg9" +
            "$arg10"
    println(str)
    return str
}

fun main() {
    //анонимную функцию
    val allTypes0 = fun Map<List<*>, Set<*>>.(
        arg1: Byte,
        arg2: Short,
        arg3: Int,
        arg4: Long,
        arg5: Float,
        arg6: Double,
        arg7: String,
        arg8: Boolean,
        arg9: Char,
        arg10: Any,
    ): String {
        val str = "$arg1" +
                  "$arg2" +
                  "$arg3" +
                  "$arg4" +
                  "$arg5" +
                  "$arg6" +
                   arg7 +
                "$arg8" +
                "$arg9" +
                "$arg10"
        println(str)
        return str
    }

    //лямбда выражение с указанием типа
    val allTypes1: Map<List<*>, Set<*>>.(
        Byte, Short, Int,
        Long, Float, Double,
        String, Boolean, Char,
        Any,
    ) -> String = { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 ->
        val str = "$arg1" +
                  "$arg2" +
                  "$arg3" +
                  "$arg4" +
                  "$arg5" +
                  "$arg6" +
                     arg7 +
                  "$arg8" +
                  "$arg9" +
                  "$arg10"
        println(str)
        str
    }
    val map = mapOf(listOf("уаука") to setOf(""))
//    val map1 = map.allTypes(1,2,4,5, 6F, 7.0, "erfe", true,'t','d')
    val map2 = allTypes0(mapOf(),1,2,4,5, 6F, 7.0, "erfe", true,'t','d')
    println(map2)
    val map3 = allTypes1(mapOf(),1,2,4,5, 6F, 7.0, "erfe", true,'t','d')
}

