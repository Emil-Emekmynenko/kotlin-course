package com.emil.org.emil.kotlincourse.lesson15

class Wind(
    private val speed: Int
) {
    fun convertSpeed(): Int{
        return speed * 1000 / 3600
    }
}