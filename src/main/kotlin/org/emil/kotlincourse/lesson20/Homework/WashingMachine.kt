package com.emil.org.emil.kotlincourse.lesson20.Homework

import java.io.InputStream

abstract class WashingMachine(
    override val capacity: Int,
    override val maxTemperature: Int,
    override val sensorType: String,
    override val maxSensoredValue: Int
) :
    Powerable,
    Openable,
    WaterContainer,
    TemperatureRegulatable,
    WaterConnection,
    AutomaticShutdown,
    Drainable,
    Timable,
    SoundEmitting,
    Programmable
{
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

    override fun fillWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun connectToWaterSupply() {
        TODO("Not yet implemented")
    }

    override fun getWaters(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun getWater(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun connectToDrain() {
        TODO("Not yet implemented")
    }

    override fun drain() {
        TODO("Not yet implemented")
    }

    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }
}