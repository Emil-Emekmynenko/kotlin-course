package com.emil.org.emil.kotlincourse.lesson15.Homework

import com.emil.org.emil.kotlincourse.lesson10.indexList

/*
Класс Rack (Стеллаж)
    Характеристики:
        Список полок (shelves): хранит полки стеллажа.
        Максимальное количество полок.

Методы:
    Добавление Полки (addShelf):
        Добавляет новую полку в стеллаж.
        Возвращает true, если полка была успешно добавлена или false
        если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.

    Удаление Полки (removeShelf):
        Принимает индекс полки для удаления.
        Удаляет полку по указанному индексу.
        Возвращает true, если полка была успешно удалена или false если она не существует.

    Добавление Предмета (addItem):
        Добавляет предмет на самую свободную полку.
        Возвращает true, если предмет успешно добавлен,
        и false, если на всех полках недостаточно места.

    Удаление Предмета (removeItem):
        Находит и удаляет предмет с любой полки.
        Возвращает true, если предмет был удален, и false, если такой предмет не найден.

    Проверка наличия предмета на полке:
        Возвращает true если предмет есть на одной из полок

     Получение списка полок:
        Возвращает неизменяемый список полок

     Печать Содержимого (printContents):
        Выводит в консоль информацию о каждой полке: индекс, вместимость,
        оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде

    Сложное удаление полки (advancedRemoveShelf):
        Принимает индекс полки для удаления
        Перераспределяет предметы по имеющимся полкам, начиная с самых длинных.
        Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
        Удаляет полку с оставшимися предметами
        Возвращает список предметов, которые не удалось удалить

 */


class Rack(
    private var shelves: MutableList<Shelf>,
    private val maxQuantityShelves : Int,

    ) {
    fun addShelf(shelf: Shelf): Boolean {
        return if (maxQuantityShelves < shelves.size && shelves.contains(shelf)) {
            shelves.add(shelf)
            true
        } else false
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else false
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem (item: String): Boolean {
        for (shelf in shelves)
            if(shelf.checkingItem(item) && shelf.removeItem(item)){
                shelf.removeItem(item)
                return true
            }
        return false
    }

    fun checkingItem(item: String) : Boolean {
        for (shelf in shelves)
            if (shelf.checkingItem(item))
                return true
        return false
    }

    fun listShelves(): List<Shelf> {
       return shelves.toList()
    }

    fun printContents(nameShelf: Shelf) {
        println(
            "Список предметов полки ${nameShelf.items}.\n" +
            "Индекс полки ${shelves.indexOf(nameShelf)}.\n"+
            "Вместимость полки ${nameShelf.capacity}.\n"+
            "Оставшаяся вместимость ${nameShelf.remainingCapacity()}."
        )
    }
    /*
    Сложное удаление полки (advancedRemoveShelf):
        Принимает индекс полки для удаления
        Перераспределяет предметы по имеющимся полкам, начиная с самых длинных.
        Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
        Удаляет полку с оставшимися предметами
        Возвращает список предметов, которые не удалось удалить
     */
    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val itemsToReallocate = shelves[index].gettingListItems().toMutableList()
        val remainingItems = mutableListOf<String>()

        // Удаляем полку
        shelves.removeAt(index)

        // Перераспределяем предметы
        for (item in itemsToReallocate) {
            var placed = false
            for (shelf in shelves.sortedByDescending { it.remainingCapacity() }) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                remainingItems.add(item)
            }
        }

        return remainingItems
    }

}



