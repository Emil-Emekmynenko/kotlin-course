package com.emil.org.emil.kotlincourse.lesson29.Homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {
    println("------Задача №1------")
    /*
    Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
     */
    val dataNow = LocalDate.now()
    println(dataNow)


    println("------Задача №2------")
    /*
    Создай дату своего дня рождения.
     */
    val myBirthday = LocalDate.of(1993, 7 , 20)
    println(myBirthday)

    println("------Задача №3------")
    /*
    Создай период между датой своего рождения и текущей датой.
    Выведи на печать количество лет из этого периода.
     */

    val period = Period.between(myBirthday, dataNow)
    println(period.years)

    println("------Задача №4------")
    /*
    Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
    содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
    В форматированном значении нужно выводить часы, минуты, секунды и таймзону,
    если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь.
    Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
     */
    formatter(LocalDateTime.of(1993,7,20,10,10,12))
    formatTemporalISO(LocalDateTime.of(1993,7,20,10,10,12))

    println("------Задача №5------")
    /*
    Создай объекты дат и / или времени которые
    мы изучили и по очереди передай их в метод созданный выше.
    Не используй в них метод now()
     */

    val birthdayMyDog = LocalDate.of(2024, 5,24)
    val timeBirthdayMyDog = LocalTime.of(23,42,32,24,)
    formatter(birthdayMyDog)
    formatTemporalISO(timeBirthdayMyDog)

    println("------Задача №6------")

    /*
    Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и печатает строку,
    определяющую, к какому поколению принадлежит человек: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
    и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
    Если дата рождения не попадает ни в один из этих диапазонов,
    функция должна возвращать "Не определено".
    Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate).
    Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.
     */
    val dateIdentify1 = LocalDate.of(1949,4,3)
    val dateIdentify2 = LocalDate.of(1964,12,31)
    val dateIdentify3 = LocalDate.of(1997,1,1)
    val dateIdentify4 = LocalDate.now()

    println(identifyGeneration(dateIdentify1))
    println(identifyGeneration(dateIdentify2))
    println(identifyGeneration(dateIdentify3))
    println(identifyGeneration(dateIdentify4))


    println("------Задача №7------")
    /*
    Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
    Создай форматтер, который форматирует дату в месяц и день.
    Выведи первую отформатированную дату, прибавив к ней 10 дней.
    Выведи вторую отформатированную дату, прибавив к ней 10 дней.
    Найди отличия)))
     */

    val date1 = LocalDate.of(2023,2,25)
    val date2 = LocalDate.of(2024,2,25)

    val formatter = DateTimeFormatter.ofPattern("'день' dd 'месяц' MM")
    val resultDate1 = date1.plusDays(10)
    val resultDate2 = date2.plusDays(10)
    println(resultDate1.format(formatter))
    println(resultDate2.format(formatter))


}
fun formatter(arg: Temporal) {
    when (arg) {
        is Instant -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss 'UTC'")
            formatter.withZone(ZoneOffset.UTC)
            println(formatter.format(arg))
        }

        is LocalDate -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            println(arg.format(formatter))
        }

        is LocalTime -> {
            val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
            println(arg.format(formatter))
        }

        is LocalDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            println(arg.format(formatter))
        }

        is ZonedDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")
            println(arg.format(formatter))
        }

        is OffsetDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX")
            arg.format(formatter)
        }

        else -> println("Неизвестный тип времени")
    }
}

fun formatTemporalISO(arg: Temporal) {
    when (arg) {
        is LocalDateTime -> println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(arg))
        is ZonedDateTime -> println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(arg))
        is OffsetDateTime -> println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(arg))
        is LocalDate -> println(DateTimeFormatter.ISO_LOCAL_DATE.format(arg))
        is LocalTime -> println(DateTimeFormatter.ISO_LOCAL_TIME.format(arg))
        is Instant -> println(DateTimeFormatter.ISO_INSTANT.format(arg))
        else -> println("Неизвестный тип времени")
    }
}

//1946 по 1964
private val startOfBoomerEra = LocalDate.of(1945,12,31)
private val endOfBoomerEra = LocalDate.of(1965, 1,1)
//1997 по 2012
private val startOfZoomerEra = LocalDate.of(1996,12,13)
private val endOfZoomerEra = LocalDate.of(2013,1,1)

fun identifyGeneration(arg: LocalDate): String{
    return if(arg.isAfter(startOfBoomerEra) && arg.isBefore(endOfBoomerEra)) {
        "Бумер"
    } else if (arg.isAfter(startOfZoomerEra) && arg.isBefore(endOfZoomerEra)) {
        "Зумер"
    } else "Не определено"
}
