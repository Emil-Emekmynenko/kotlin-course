package com.emil.org.emil.kotlincourse.lesson15.Homework
/*
Цель Задания
Создать систему управления складским пространством с использованием классов "Стеллаж" и "Полка стеллажа".
Класс Shelf (Полка Стеллажа)

Характеристики:
    Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
    Список предметов (items): хранит названия предметов на полке.

Методы:
Добавление Предмета (addItem):
    Принимает название предмета.
    Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
    Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.

Удаление Предмета (removeItem):
    Принимает название предмета.
    Удаляет предмет, если он найден на полке.
    Возвращает true, если предмет был удален, и false, если такой предмет не найден.

Проверка Вместимости (canAccommodate):
    Принимает название предмета.
    Определяет, вместится ли предмет на полку.
    Возвращает true, если предмет вместится, и false, если места недостаточно.

Проверка наличия предмета:
    Принимает название предмета
    Возвращает true если такой предмет есть

Получение списка предметов:
    Возвращает неизменяемый список предметов

 */



class Shelf(
    var capacity: Int,
    var items : MutableList<String>
) {
    //Метод добавления предмета на полку
    fun addItem(name: String): Boolean {
       return canAccommodate(name) && items.add(name)
        }
    fun removeItem(name: String): Boolean {
        return items.remove(name)
    }

    fun canAccommodate(name: String): Boolean {
        return (items.joinToString("").length + name.length) <= capacity
    }

    fun checkingItem(name: String): Boolean{
        return items.contains(name)
    }

    fun gettingListItems(): List<String> {
        return items.toList()
    }

    fun remainingCapacity() : Int {
        return capacity - items.joinToString("").length
    }
}