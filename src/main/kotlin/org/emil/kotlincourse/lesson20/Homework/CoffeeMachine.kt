package com.emil.org.emil.kotlincourse.lesson20.Homework

abstract class CoffeeMachine(
    override val maxTemperature: Int,
    override val capacity: Int,
    override val sensorType: String,
    override val maxSensoredValue: Int
) :
    Powerable,
    Openable,
    TemperatureRegulatable,
    WaterContainer,
    AutomaticShutdown,
    Timable,Mechanical,
    Programmable,
    Cleanable,
    Rechargeable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun getWaters(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }

    override fun performMechanicalAction() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun clean() {
        TODO("Not yet implemented")
    }

    override fun getChargeLevel(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }
}