package com.emil.org.emil.kotlincourse.lesson22.Homework

import com.emil.org.emil.kotlincourse.lesson22.Homework.extentions.*

fun main() {
    println("----Задание 1-2 ----")
    val arrayCheck = arrayOf(1,3).arrayFun()
    println(arrayCheck)

    val charCheck = 'i'.charOrNull(1, 2, false)
    println()

    val longCheck: Long = 132421343242134131
    println(longCheck.longFun())

    val mapCheck = mapOf(8 to listOf(1,4,5,6,7)).mapFun(9)
    println(mapCheck)
    val listCheck = mutableListOf("a", "b", "c").mutableListFun("1", 8)
    println(listCheck)
    println("----Задание 3----")
    val pairCheck1 = Pair(1, "s").revert()
    val pairCheck2 = Pair(null, "S").revert()
    println(pairCheck1)
    println(pairCheck2)
    println("----Задание 4----")
    // Int
    println(10.within(15, 5))
    println(10.within(15, 4))
    // Double
    println(10.5.within(10.2, 0.5)) // true
    println(10.5.within(10.2, 0.2)) // false
    // Float
    println(10.5f.within(10.8f, 0.5f)) // true
    println(10.5f.within(10.8f, 0.2f)) // false
    println("----Задание 5----")
    println("0041".encrypt(5))
    println("0049".decrypt(5))

    println("----ПИДМАРКОЗ----")
    val str = "ПИДМАРКОЗ".pidmarkoz(listOf("Анна",
        "Бубочка", "Слоняш", "Квадробер 1998",
        "Родной", "Дамский угодник 779" ,
        "Чай втроём","Барак", "Зёма"))
}



