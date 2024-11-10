package com.emil.org.emil.kotlincourse.lesson20.Homework

class Oven(maxTemperature: Int) : EquipmentWithTemperatureSetting(maxTemperature) {
    fun reheatFood(){
        if (checkPower())
            println("Греет еду")
    }
}