package com.emil.org.emil.kotlincourse.lesson15

class CAR(
    var brand : String,
    var model: String
) {
    fun void(){
        println("I am $brand $model")
    }

    companion object {
        val brandList = listOf("Audi", "Lada", "BMW")
    }

}