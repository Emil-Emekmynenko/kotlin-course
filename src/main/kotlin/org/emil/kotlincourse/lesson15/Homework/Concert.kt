package com.emil.org.emil.kotlincourse.lesson15.Homework

/*
Мероприятие: Концерт Создайте класс, который будет представлять концерт.
У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
Также приватное поле “проданные билеты”. Добавьте метод,
который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.
 */

class Concert(
    var nameGroup: String,
    var place: String,
    var price: Double,
    var hallCapacity: Int,
    private var ticketsSold: Int

) {
    fun informationOfConcert() {
        println("Хедлайнер концерта группа $nameGroup.\n" +
                "Место проведения $place.\n"+
                "Стоимость билета $price.\n"+
                "Вместимость зала $hallCapacity."
        )
    }
    fun byTicket(){
        println(if (ticketsSold < hallCapacity) {
            ++ticketsSold
        } else "Билеты раскуплены"
        )
    }
}