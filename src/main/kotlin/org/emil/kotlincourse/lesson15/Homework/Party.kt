package com.emil.org.emil.kotlincourse.lesson15.Homework

/*
Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
У него должны быть свойства location (String) и attendees (Int).
Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
 */

class Party(
    var location: String,
    var attendees: Int
) {
    fun details() {
        println("Место проведения вечеринки $location, на ней будет $attendees человек")
    }
}