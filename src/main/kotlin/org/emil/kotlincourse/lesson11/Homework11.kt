package com.emil.org.emil.kotlincourse.lesson11

import kotlin.collections.Map
import kotlin.collections.Map as Map1

fun main() {
    /*   Задание 1: Создание Пустого Словаря
         Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
     */
    val map1: Map<Int, Int> = mapOf()

    /*    Задание 2: Создание и Инициализация Словаря
          Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
     */
    val map2 = mapOf(1F to 1.0, 2F to 2.0)

    /*    Задание 3: Создание Изменяемого Словаря
          Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
     */
    val map3 = mutableMapOf<Int, String>()

    /*    Задание 4: Добавление Элементов в Словарь
          Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
     */
    map3[3] = "three"

    /*    Задание 5: Получение Значений из Словаря
          Используя словарь из предыдущего задания, извлеките значение, используя ключ.
          Попробуй получить значение с ключом, которого в словаре нет.
     */
    println(map3[3])
    println(map3[4])

    /*    Задание 6: Удаление Элементов из Словаря
          Удалите определенный элемент из изменяемого словаря по его ключу.
     */
    map3.remove(1)
    println(map3)

    /*    Задание 7: Перебор Словаря в Цикле
          Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
          Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
     */
    val map4 = mapOf(1.0 to 1, 2.0 to 2, 3.0 to 3, 4.0 to 0)
    for ((dividend, divider) in map4) {
        if (divider == 0) {
            println("бесконечность")
        } else println(dividend / divider)
    }
    /*    Задание 8: Перезапись Элементов Словаря
          Измените значение для существующего ключа в изменяемом словаре.
     */
    val map5 = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map5[2] = "four"

    /*    Задание 9: Сложение Двух Словарей
          Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
     */
    val map6 = mapOf(1 to "one", 2 to "two", 3 to "three")
    val map7 = mapOf(4 to "four", 5 to "fife", 6 to "six")
    val map8 = mutableMapOf<Int, String>()
    for ((int, string) in map6) {
        map8[int] = string
    }
    for ((int, string) in map7) {
        map8[int] = string
    }
    println(map8)

    /*    Задание 10: Словарь с Сложными Типами
          Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
          Добавьте несколько элементов в этот словарь.
     */
    val set1 = setOf(1, 2, 3, 4, 5, 6)
    val set2 = setOf(7, 8, 9)
    val map9 = mapOf("one" to set1, "two" to set2)

/*    Задание 11: Использование Множества в Качестве Значения
      Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
      Добавь данные в словарь.
      Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
      Распечатай полученное множество.
 */
    val map10: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    map10[1]= mutableSetOf("one", "two", "three")
    map10[2] = mutableSetOf("Lebron", "Kobe", "Durant")

    map10[2]?.add("Jordan")
    println(map10[2])


/*    Задание 12: Поиск Элемента по Значению
      Создай словарь, где ключами будут пары чисел.
      Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
 */

    val map11: MutableMap<MutableSet<Int>, String> = mutableMapOf()
    map11[mutableSetOf(1,2)] = "one"
    map11[mutableSetOf(3,4)] = "two"
    map11[mutableSetOf(5,6)] = "three"
    for ((key, value) in map11) {
        for (i in key){
            if (i == 5) {
                println(value)
            }
        }
    }

//    ======
//    Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.

/*    Задание 6: Словарь Библиотека
      Ключи - автор книги, значения - список книг
 */
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()
    library["Пушкин"] = mutableListOf("Капитанская дочка", "Руслан и Людмила", "Зимнее утро")

/*    Задание 12: Справочник Растений
      Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
 */
    val mapPlants: MutableMap<String, MutableList<String>> = mutableMapOf()
    mapPlants["Цветы"] = mutableListOf("Розы", "Фиалки", "Лилии")
/*    Задание 8: Четвертьфинала
      Ключи - названия спортивных команд, значения - списки игроков каждой команды
 */
    val teamPlayers: MutableMap<String, MutableSet<String>> = mutableMapOf()
    teamPlayers["Старая Барселона"] = mutableSetOf("Мессси", "Хави", "Иньеста", "Суарес")
    for((key,value) in teamPlayers)
        println("Команда: $key \nСостав: $value")

/*    Задание 9: Курс лечения
      Ключи - даты, значения - список препаратов принимаемых в дату
 */
    val courseTreatment: MutableMap<String, MutableList<String>> = mutableMapOf()
    courseTreatment["12.10.24"] = mutableListOf("Анальгин", "Активированный уголь", "Антипохмелин")

/*    Задание 10: Словарь Путешественника
      Ключи - страны, значения - словари из городов со списком интересных мест.
 */
    val travelerDictionary: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf()
    travelerDictionary["Россия"] = mutableMapOf("Москва" to mutableListOf("ВДНХ", "Царицино"))
    println(travelerDictionary)

}