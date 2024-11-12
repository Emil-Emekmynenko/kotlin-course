package com.emil.org.emil.kotlincourse.lesson20.Homework

fun main() {
    val fridgeReal = FridgeReal(5)
    val washingMachineReal = WashingMachineReal(60)
    val kettle = Kettle(100)
    val oven = Oven(300)

    //Включаем устройства по очереди
    println("Включаем устройства по очереди")
    fridgeReal.powerOn()
    washingMachineReal.powerOn()
    kettle.powerOn()
    oven.powerOn()
    println()

    //Открываем устройство
    println("Открываем устройство")
    fridgeReal.open()
    washingMachineReal.open()
    kettle.open()
    oven.open()
    println()

    //Устанавливаем температуру
    println("Устанавливаем температуру")
    fridgeReal.setTemperature(4)
    washingMachineReal.setTemperature(55)
    kettle.setTemperature(101)
    oven.setTemperature(299)
    println()

    //Закрываем устройство
    println("Закрываем устройство")
    fridgeReal.close()
    washingMachineReal.close()
    kettle.close()
    oven.close()
    println()

    //Выключаем устройство
    println("Выключаем устройство")
    fridgeReal.powerOff()
    washingMachineReal.powerOff()
    kettle.powerOff()
    oven.powerOff()
    println()
}