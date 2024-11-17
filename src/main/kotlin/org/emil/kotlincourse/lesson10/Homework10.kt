package com.emil.org.emil.kotlincourse.lesson10

fun main() {
//Работа с массивами Array
    /* Задание 1: Создание и Инициализация Массива
    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
     */
    val array1 = arrayOf(1, 2, 3, 4, 5)

    /*Задание 2: Создание Пустого Массива
    Создайте пустой массив строк размером 10 элементов.
     */
    val array2 = Array(10) { "" }

    /*Задание 3: Заполнение Массива в Цикле
    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
     */
    val array3 = doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0)
    for (i in array3.indices) {
        array3[i] = i * 2.0
    }

    /*Задание 4: Изменение Элементов Массива
    Создайте массив из 5 элементов типа Int. Используйте цикл,
    чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
     */
    val array4 = Array(5) { 0 }
    for (i in array4.indices)
        array4[i] = i * 3

    /*Задание 5: Работа с Nullable Элементами
    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
     */
    val array5: Array<String?> = arrayOf(null, "efe", "erferg")


    /*Задание 6: Копирование Массива
    Создайте массив целых чисел и скопируйте его в новый массив в цикле.
     */
    val array6 = arrayOf(1, 2, 3, 4)
    val arrayCopy = Array(4) { 0 }
    for (i in array6.indices)
        arrayCopy[i] = array6[i]

    println(arrayCopy.toList())

    /*Задание 7: Разница Двух Массивов
    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого
     */
    val array7 = arrayOf(100, 90, 80, 70, 60)
    val array8 = arrayOf(50, 48, 35, 22, 7)
    val arrayResult = Array(5) { 0 }

    for (i in arrayResult.indices)
        arrayResult[i] = array7[i] - array8[i]
    println(arrayResult.toList())


    println(indexCount(arrayOf(0, 4, 8, 34, 343, 5, 8, 6, 7, 8, 332, 234, 465, 567)))
    iteratingOverArray(arrayOf(1, 4, 5, 6, 7, 8, 90, 4, 3, 2, 2, 4, 7, 9, 0, -6))
    iterateOverList()
    mergingLists()
    minAndMaxElement()
    listFiltering()
    addSet()
    removeSet()
    bustSet()
    println(checkingElement(set7 = setOf("fef", "8", "7"), string = "7"))
    mergingSet()
    setConversion()
    intersectionsSets()
    setDifference()
}

/*Задание 8: Поиск Индекса Элемента
Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
Реши задачу через цикл while.
 */

fun indexCount(array9: Array<Int>): Int {
    var index = 0
    while (index <= array9.size - 1) {
        if (array9[index] == 5) {
            return index
        }
        index++
    }
    return -1
}

/*Задание 9: Перебор Массива
Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
Напротив каждого элемента должно быть написано “чётное” или “нечётное”
 */

fun iteratingOverArray(array10: Array<Int>) {
    val even = " - чётное"
    val odd = " - нечётное"
    for (i in array10.indices)
        if (array10[i] == 0) {
            println("0")
        } else if (array10[i] % 2 != 0) {
            val index = array10[i]
            println("$index$odd")
        } else if (array10[i] % 2 == 0) {
            val index = array10[i]
            println("$index$even")
        }
}

/*Задание 10: Поиск Значения в Массиве по вхождению
Создай функцию, которая принимает массив строк и строку для поиска.
Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
Верни найденный элемент из функции в виде строки.
 */

fun searchValues(array11: Array<String>, string: String): String {
    for (i in array11) {
        if (i.contains(string))
            return i
    }
    return "Элемент не найден."
}

//Работа со списками List

/*
Задание 1: Создание Пустого Списка
Создайте пустой неизменяемый список целых чисел.
 */
val list1 = listOf<Int>()

/*
Задание 2: Создание и Инициализация Списка
Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
 */
val list2 = listOf("Hello", "World", "Kotlin")

/*
Задание 3: Создание Изменяемого Списка
Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
 */
val list3 = mutableListOf(1, 2, 3, 4, 5)

/*
Задание 4: Добавление Элементов в Список
Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
 */
fun addList(list: List<Any>) {
    val list4 = mutableListOf(5, 6, 8, 9, 4, 3)
    list4.add(6)
    list4.add(7)
    list4.add(9)
}

/*Задание 5: Удаление Элементов из Списка
Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
 */

fun removeList() {
    val list5 = mutableListOf("Боба", "Биба", "World")
    list5.remove("World")
}

/*Задание 6: Перебор Списка в Цикле
Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
 */
fun iterateOverList() {
    val list6 = listOf(1, 10, 100, 1000, 10000)
    for (i in list6)
        println(i)
}

/*
Задание 7: Получение Элементов Списка по Индексу
Создайте список строк и получите из него второй элемент, используя его индекс.
 */
fun indexList() {
    val list7 = listOf("a", "b", "c", "d")
    println(list7[1])
}

/*
Задание 8: Перезапись Элементов Списка по Индексу
Имея изменяемый список чисел,
измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
 */
fun rewritingElementsList() {
    val list8 = mutableListOf(1, 3, 4, 5, 6, 7)
    list8[1] = 6
}

/*
Задание 9: Объединение Двух Списков
Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
Реши задачу с помощью циклов.
 */
fun mergingLists() {
    val list9 = listOf("a", "b")
    val list10 = listOf("c", "d")
    val list11 = mutableListOf<String>()
    for (i in list9) {
        list11.add(i)
    }
    for (i in list10) {
        list11.add(i)
    }
    println(list11)
}

/*
Задание 10: Нахождение Минимального/Максимального Элемента
Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
 */
fun minAndMaxElement() {
    val list12 = listOf(2, 5, 6, 7, 8, 3, 1, 12, 223, 5, 79)
    var numberMax = list12[0]
    var numberMin = list12[0]
    for (i in list12.indices) {
        if (list12[i] > numberMax)
            numberMax = list12[i]
        if (list12[i] < numberMin) {
            numberMin = list12[i]
        }
    }
    println("$numberMax - максимальное число \n$numberMin - минимальное число")
}

/*
Задание 11: Фильтрация Списка
Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
 */

fun listFiltering() {
    val list13 = listOf(1, 8, 90, 4, 3, 2, 3, 4, 56, 8, 9, 0, 0, 4546, 45, 33, 23, 23, 2, 34, 67, 2)
    val list14 = mutableListOf<Int>()
    for (i in list13) {
        if (i % 2 == 0)
            list14.add(i)
    }
    println(list14)
}

//Работа с Множествами Set

/*Задание 1: Создание Пустого Множества
Создайте пустое неизменяемое множество целых чисел.
 */
val set1 = setOf<Int>()

/* Задание 2: Создание и Инициализация Множества
Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
 */
val set2 = setOf(1, 10, 100)

/*
Задание 3: Создание Изменяемого Множества
Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
 */
val set3 = mutableSetOf("Kotlin", "Java", "Python")

/*
Задание 4: Добавление Элементов в Множество
Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
 */
fun addSet() {
    val set4 = mutableSetOf("Какие", "языки", "я", "не", "люблю", ":")
    set4.add("Swift")
    set4.add("Go")
    println(set4)
}

/*
Задание 5: Удаление Элементов из Множества
Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
 */
fun removeSet() {
    val set5 = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    set5.remove(2)
    println(set5)
}

/*
Задание 6: Перебор Множества в Цикле
Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
 */
fun bustSet() {
    val set6 = setOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    for (i in set6)
        println(i)
}

/*
Задание 7: Проверка Наличия Элемента в Множестве
Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
 */
fun checkingElement(set7: Set<String>, string: String): Boolean {
    for (i in set7)
        if (i == string)
            return true
    return false
}

/*Задание 8: Объединение Двух Множеств
Создайте два множества строк и объедините их в одно новое множество,
содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
 */
fun mergingSet() {
    val set8 = setOf("a", "b", "c")
    val set9 = setOf("c", "d")
    val set10 = mutableSetOf<String>()
    for (i in set8){
        set10.add(i)
    }
    for (i in set9){
        set10.add(i)
    }
    println(set10)
}
/*
Задание 9: Нахождение Пересечения Множеств
Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
 */
fun intersectionsSets() {
    val set11 = setOf(1,2,3,4,5)
    val set12 = setOf(4,5,6)
    val set13 = mutableSetOf<Int>()
    for (i in set11)
        for (i2 in set12)
            if (i == i2)
                set13.add(i)
    println(set13)
}

/*
Задание 10: Нахождение Разности Множеств
Создайте два множества строк и найдите разность первого множества
относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором).
Реши задачу через вложенные циклы и переменные флаги.
 */
fun setDifference() {
    val set14 = setOf("a", "b", "c", "d")
    val set15 = setOf("c", "d", "e", "f")
    val set16 = mutableSetOf<String>()
    for (i in set14) {
        var examination = false
        for (i2 in set15)
            if (i == i2) {
                examination = true
                break
            }
        if (!examination) {
            set16.add(i)
        }
    }
    println(set16)
}

/*
Задание 11: Конвертация Множества в Список
Создайте множество строк и конвертируйте его в список с использованием цикла.
 */

fun setConversion() {
    val set20 = setOf("Kotlin", "Java", "Python")
    val list20 = mutableListOf<String>()
    for (i in set20)
        list20.add(i)
    println(list20)
}
