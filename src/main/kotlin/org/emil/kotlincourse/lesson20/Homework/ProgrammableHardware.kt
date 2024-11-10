package com.emil.org.emil.kotlincourse.lesson20.Homework

abstract class ProgrammableHardware(private val availableMethods: List<String>) : ElectricalAppliances(), Programmable {
    override fun programAction(action: String) {
        when(action) {
            "Включи" -> powerOn()
            "Выключи" -> powerOff()
            else -> println("Ничего не произошло")
        }
    }

    override fun execute() {
        println("Вывести на экран список доступных методов: $availableMethods")
    }
}