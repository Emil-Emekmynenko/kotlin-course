package com.emil.org.emil.kotlincourse.lesson23.Homework

/*
Задача 6
Создайте функцию tryCastToListAndPrint,
которая принимает параметр типа Any и пытается привести его к типу List<*>.
Если приведение успешно, функция должна напечатать все строки из списка,
если элемент не является строкой то вывести предупреждение об этом.
Если приведение неудачно, должно быть выведено сообщение об ошибке,
не прерывая выполнение программы.
 */

fun tryCastToListAndPrint(value: Any) {
    (value as? List<*>)?.forEach {
        val result = (it as? String) ?: "Элемент $it не является строкой"
        println(result)
    } ?: println("Не удачное преображение")

//    val result = value as? List<*> //?: println("Не удачное преображение")
//    if (result != null) {
//        for (i in result.indices) {
//            if (result[i] !is String){
//                println("Элемент ${result[i]} не является строкой")
//                println(result[i])
//            } else if (result[i] is String){
//                println(result[i])
//            } else println("Не удачное преображение")
//        }
//    }
}

