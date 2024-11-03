package com.emil.org.emil.kotlincourse.lesson15

class Lamp(
    private var isOn : Boolean

) {
    fun switch(){
        isOn = !isOn
        println(isOn)
    }
}