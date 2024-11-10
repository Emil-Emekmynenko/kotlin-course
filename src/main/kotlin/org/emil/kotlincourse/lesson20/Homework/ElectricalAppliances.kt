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
    protected fun checkPower(): Boolean {
        if (!isOn) {
            println("Устройство выключено, для дальнейшей работы включите его")
        }
        return isOn
    }

}