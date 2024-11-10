package com.emil.org.emil.kotlincourse.lesson20.Homework

class Kettle(maxTemperature: Int) : EquipmentWithTemperatureSetting(maxTemperature) {
    fun boilWater(){
        if (checkPower())
            println("Чайник кипятит воду")
    }
}