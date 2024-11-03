package com.emil.org.emil.kotlincourse.lesson18.Homework

class ShoppingCart {
     private val items: MutableMap<String, Int> = mutableMapOf()

    // Добавляет одну единицу товара
     fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Добавляет указанное количество товара
     fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Добавляет товары из словаря
    fun addToCart(itemsToAdd: Map<String, Int>) {
        for ((itemId, amount) in itemsToAdd) {
            addToCart(itemId, amount)
        }
    }

    // Добавляет по одной единице для каждого ID из списка
    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        val totalItems = items.values.sum()
        val totalUniqueItems = items.size
        val itemDetails = items
            .entries
            .joinToString("\n") { (id, count) -> "ID: $id, Количество: $count" }
        return "Корзина:\n$itemDetails\nИтоговое количество артикулов: $totalUniqueItems" +
                "\nОбщее количество товаров: $totalItems"
    }
}