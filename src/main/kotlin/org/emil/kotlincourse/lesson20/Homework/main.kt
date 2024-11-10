package com.emil.org.emil.kotlincourse.lesson20.Homework

fun main() {
    val fridgeReal = FridgeReal(5)
    val washingMachineReal = WashingMachineReal(60)
    val kettle = Kettle(100)
    val oven = Oven(300)

    //Включаем устройства по очереди
    println("Включаем устройства по очереди")
    println(fridgeReal.powerOn())
    println(washingMachineReal.powerOn())
    println(kettle.powerOn())
    println(oven.powerOn())
    println()

    //Открываем устройство
    println("Открываем устройство")
    println(fridgeReal.open())
    println(washingMachineReal.open())
    println(kettle.open())
    println(oven.open())
    println()

    //Устанавливаем температуру
    println("Устанавливаем температуру")
    println(fridgeReal.setTemperature(4))
    println(washingMachineReal.setTemperature(55))
    println(kettle.setTemperature(101))
    println(oven.setTemperature(299))
    println()

    //Закрываем устройство
    println("Закрываем устройство")
    println(fridgeReal.close())
    println(washingMachineReal.close())
    println(kettle.close())
    println(oven.close())
    println()

    //Выключаем устройство
    println("Выключаем устройство")
    println(fridgeReal.powerOff())
    println(washingMachineReal.powerOff())
    println(kettle.powerOff())
    println(oven.powerOff())
    println()


}