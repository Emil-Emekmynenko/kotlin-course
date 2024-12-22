package com.emil.org.emil.kotlincourse.lesson31.Homework

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {


    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal, Float>()
    private var currentContainers = 0

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }
        if (currentContainers >= (storageCapacity / containerCapacity).toInt()) {
            throw IllegalStateException("Хранилище заполнено")
        }

        val existingAmount = storage.getOrDefault(cereal, 0.0f)
        val newAmount = existingAmount + amount

        return if (newAmount > containerCapacity) {
            storage[cereal] = containerCapacity
            currentContainers++
            newAmount - containerCapacity
        } else {
            storage[cereal] = newAmount
            0.0f
        }
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }
        val existingAmount = storage.getOrDefault(cereal, 0.0f)

        return if (existingAmount >= amount) {
            storage[cereal] = existingAmount - amount
            amount
        } else {
            storage[cereal] = 0.0f
            existingAmount
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        val existingAmount = storage.getOrDefault(cereal, 0.0f)
        if (existingAmount > 0) return false

        storage.remove(cereal)
        currentContainers--
        return true
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0.0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        val existingAmount = storage.getOrDefault(cereal, 0.0f)
        return containerCapacity - existingAmount
    }

    override fun toString(): String {
        return "CerealStorage(containerCapacity=$containerCapacity, storageCapacity=$storageCapacity, storage=$storage)"
    }

    // дальше будет переопределением методов интерфейса
}