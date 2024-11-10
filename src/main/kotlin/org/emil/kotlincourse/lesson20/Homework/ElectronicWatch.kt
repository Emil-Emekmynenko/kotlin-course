package com.emil.org.emil.kotlincourse.lesson20.Homework

import java.io.InputStream

abstract class ElectronicWatch(override val sensorType: String, override val maxSensoredValue: Int) :
    Powerable,
    AutomaticShutdown,
    BatteryOperated,
    LightEmitting,
    SoundEmitting
{
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

    override fun setVolume(volume: Int) {
        TODO("Not yet implemented")
    }

    override fun mute() {
        TODO("Not yet implemented")
    }

    override fun playSound(stream: InputStream) {
        TODO("Not yet implemented")
    }
}