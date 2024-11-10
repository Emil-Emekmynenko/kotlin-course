package com.emil.org.emil.kotlincourse.lesson20.Homework

class FridgeReal(maxTemperature: Int) : EquipmentWithTemperatureSetting(maxTemperature) {
    fun freeze(){
        if (checkPower())
            println("Холодильник морозит")
    }
}