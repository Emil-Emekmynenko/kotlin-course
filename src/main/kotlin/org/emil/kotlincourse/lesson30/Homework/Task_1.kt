package com.emil.org.emil.kotlincourse.lesson30.Homework

import kotlin.math.pow

/*
Задание 1
Создай Enum со статусами прохождения теста (pass, broken, failure).
Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

 */

enum class StatusTests(val status: String){
    PASS("pass"),
    BROKEN("broken"),
    FAILURE("failure"),
    ;
}


enum class TypeOfResidentialProperty(
    val translation: String
) {
    APARTMENTS_NEW_BUILDINGS("Квартиры в новостройках"),
    APARTMENTS_SECONDARY_BUILDINGS("Квартиры на вторичном жилье"),
    PENTHOUSES("Пентхаусы"),
    HOTEL_APARTMENTS("Квартиры в отеле"),
    TOWNHOUSES("Таунхаусы"),
    COTTAGES("Коттеджи"),
    COUNTRY_HOUSES("Дома за городом");

}

enum class PlanetsOfSolarSystem(val distanceToSunInAU: Double, val weightPlanetInTon: Double) {
    MERCURY(0.39, 3.285 * 10.0.pow(20)),
    VENUS(0.72, 4.867 * 10.0.pow(21)),
    EARTH(1.00 , 5.972 * 10.0.pow(21)),
    MARS(1.52, 6.39 * 10.0.pow(20)),
    JUPITER(5.20, 1.898 * 10.0.pow(24)),
    SATURN(9.58, 5.683 * 10.0.pow(23)),
    URANUS(19.22, 8.681 * 10.0.pow(22)),
    NEPTUNE(30.05, 1.024 * 10.0.pow(23)),
    ;
}

fun main() {

}