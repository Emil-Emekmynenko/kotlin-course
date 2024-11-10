package com.emil.org.emil.kotlincourse.lesson20.Homework

class WashingMachineReal(maxTemperature: Int) : EquipmentWithTemperatureSetting(maxTemperature) {
    fun washing(){
        if (checkPower())
            println("Машина начала стирку")
    }
}