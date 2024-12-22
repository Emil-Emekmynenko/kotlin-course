package com.emil.org.emil.kotlincourse.lesson30.Homework

import kotlin.math.pow

/*
Задание 4
Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать планету и возвращать
булево значение. Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по
какому-либо признаку (расстояние или вес). Вернуть нужно первый элемент из отфильтрованного списка или выкинуть
исключение если список пустой.
 */

fun firstElementPlanet(filter: (PlanetsOfSolarSystem) -> Boolean ): PlanetsOfSolarSystem {
    return PlanetsOfSolarSystem.entries.firstOrNull(filter)
        ?: throw NoSuchElementException("Нет нужных планет")
}

fun main() {
    println(firstElementPlanet{it.weightPlanetInTon > 2 * 10.0.pow(21)})
    println(firstElementPlanet{it.distanceToSunInAU == 1.5})
}