package com.emil.org.emil.kotlincourse.lesson15.Homework

fun main(){
    val party = Party("Kotel'niki", 69)
    party.details()

    val emotion = Emotion("Радость", 73)
    emotion.express()

    val moon = Moon
    moon.showPhase()

    val product = Product("banana",3.45, 77)
    println(product)

    val concert = Concert("Bi - 2", "Paris", 1000.0, 10000, 0)
    concert.informationOfConcert()
    concert.byTicket()
    concert.byTicket()

    val shelf = Shelf(75, mutableListOf("Биба", "Боба"))
    println(shelf.gettingListItems())

    val rack = Rack(mutableListOf(shelf), 7 )
    println(rack.removeShelf(0))

}