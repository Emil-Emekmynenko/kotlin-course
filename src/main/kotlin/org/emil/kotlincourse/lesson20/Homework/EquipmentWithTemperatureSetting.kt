package com.emil.org.emil.kotlincourse.lesson20.Homework

open class EquipmentWithTemperatureSetting(override val maxTemperature: Int) :
    ProgrammableHardware(listOf("Метод1", "Метод2")),
    TemperatureRegulatable,
    Openable
{
    private var isOpen = false
    override fun setTemperature(temp: Int) {
        if (temp > maxTemperature){
            return println("Установи температуру ниже: $maxTemperature")
        } else println("Установлена температура: $temp")
    }

    override fun open() {
        isOpen = true
        println("Устройство открыто")
    }

    override fun close() {
        isOpen = false
        println("Устройство закрыто")
    }
}