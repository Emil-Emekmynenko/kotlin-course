package com.emil.org.emil.kotlincourse.lesson20.Homework

import java.io.InputStream

abstract class RobotCleaner(
    override val capacity: Int,
    override val sensorType: String,
    override val maxSensoredValue: Int
) :
    Powerable,
    Openable,
    WaterContainer,
    AutomaticShutdown,
    Timable,
    BatteryOperated,
    SoundEmitting,
    Programmable,
    Movable,
    Cleanable,
    Rechargeable{
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

    override fun getWaters(amount: Int) {
        TODO("Not yet implemented")
    }

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun setTimer(time: Int) {
        TODO("Not yet implemented")
    }

    override fun getCapacity(): Double {
        TODO("Not yet implemented")
    }

    override fun replaceBattery() {
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

    override fun move(direction: String, distance: Int) {
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