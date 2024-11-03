package com.emil.org.emil.kotlincourse.lesson17.Homework

import com.sun.jdi.Value

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

/*
Создай подклассы этого контейнера, которые будут добавлять строку material в какое-то определённое место.

Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

Второй класс должен получать список строк и вставлять их в начало контейнера
но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться
 в контейнере по индексам 0, 2, 4 и так далее.

Третий класс должен добавлять элементы в список в алфавитном порядке.
Если мы добавляем новый элемент в список, то он должен встать где-то между
другими элементами и занять место в соответствии с сортировкой по алфавиту.

Четвёртый класс должен принимать словарь из строк (ключи и значения).
Каждая пара ключа и значения должна попадать в контейнер следующим
образом - ключ в начало, значение в конец.

 */

class AddFirstMaterial(): Materials() {
    fun addFirst(material: String) {
        val extract = extractMaterial().toMutableList()
        extract.add(0, material) // Вставляем на дно
        extract.forEach { addMaterial(it) } // Возвращаем в контейнер
    }
}

class AddingOneByOne(): Materials() {
    fun addAlternating(newMaterials: List<String>) {
        val currentMaterials = extractMaterial().toMutableList()
        val result = mutableListOf<String>()

        var i = 0
        var j = 0
        while (i < currentMaterials.size || j < newMaterials.size) {
            if (j < newMaterials.size) {
                result.add(newMaterials[j])
                j++
            }
            if (i < currentMaterials.size) {
                result.add(currentMaterials[i])
                i++
            }
        }

        result.forEach { addMaterial(it) }
    }
}

class AlphabeticalSorting: Materials() {
    fun addInAlphabeticalOrder(material: String) {
        val materialsList = extractMaterial().toMutableList()
        materialsList.add(material)
        materialsList.sort() // Сортируем по алфавиту
        materialsList.forEach { addMaterial(it) }
    }
}

class AddMap: Materials() {
    fun addKeyValueMaterials(materialsMap: Map<String, String>) {
        materialsMap.forEach { (key, value) ->
            addMaterial(key)   // Добавляем ключ в начало
            addMaterial(value) // Добавляем значение в конец
        }
    }
}







