package com.emil.org.emil.kotlincourse.lesson20.Homework

abstract class ElectricalAppliances : Powerable {
    private var isOn = false
    override fun powerOn(){
        isOn = true
        println("Прибор включен")
    }

    override fun powerOff() {
        isOn = false
        println("Прибор выключен")
    }
}