package com.emil.org.emil.kotlincourse.lesson20.Homework

abstract class SmartLamp(override val sensorType: String, override val maxSensoredValue: Int) :
    Powerable,
    AutomaticShutdown,
    BatteryOperated,
    LightEmitting,
    Programmable,
    Rechargeable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun getCapacity(): Double {
        TODO("Not yet implemented")
    }

    override fun replaceBattery() {
        TODO("Not yet implemented")
    }

    override fun emitLight() {
        TODO("Not yet implemented")
    }

    override fun completeLiteEmission() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun getChargeLevel(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }
}