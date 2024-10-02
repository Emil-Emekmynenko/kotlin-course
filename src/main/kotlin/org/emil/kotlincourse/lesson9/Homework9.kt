package com.emil.org.emil.kotlincourse.lesson9

fun main () {
    birthdaySasha(null,"98.10")
}

fun birthdaySasha (string: String?,date: String) {
    //На доске появилась таска
    val task : String = "Задача, поздравить Сашу С Днём рождения!"
    println(task)
    println()

    //Переменные для преобразования текста

    var number1: Int = 0
    val number2: Long = 10000000L
    val number3: Float = 1f
    val number4: Double = 100.01
    val number6: Boolean = true
    val number7: Char = '$'

    println("Но когда у него ДР?")
    println()
    val dateMonthBirthday = date.substring(3)
    val dateNumberBirthday = date
        .replace(date[0],'0')
        .replace(date[number3.toInt()],'2')
    if (dateMonthBirthday == "10"){
        if (dateNumberBirthday == "02.10")
            println("02.10 Сегодня у нашего Сашки ДР!")
    }else println("Обычный неприметный день")
    println()

    println("А что ему пожелать?")
    while (number1 < 100) {
        number1++
    }
    println("- Долгих лет жизни, лет до $number1")
    val amountInWallet = "$number2 $number7"
    println("- Чтобы сумма на счету была всегда не меньше $amountInWallet")

    val messageOfFate = when (number6) {
        false -> "- Будь трезв как стёклышко на свой ДР"
        true -> "- И всегда будь счастлив и любим"
    }
    println(messageOfFate)

println(string ?: "- И неисчерпаемой удачи с вероятностью $number4 % ")
}