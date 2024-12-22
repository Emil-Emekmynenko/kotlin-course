package com.emil.org.emil.kotlincourse.lesson31.Homework

import com.emil.org.emil.kotlincourse.lesson31.Address
import com.emil.org.emil.kotlincourse.lesson31.University
import com.google.gson.GsonBuilder
import java.io.File

/*
- Создай дата класс сотрудника компании Employee, содержащий:
имя
статус трудоустройства (булево)
дата рождения (строка)
должность CharacterTypes (enum из прошлого урока)
список подчинённых с типом Emploee

- Создай небольшую иерархию из сотрудников где во главе CTO.
Это значит что в объект сотрудника с должностью CTO в поле списка подчинённых должны попасть пара тим лидов,
в списке подчинённых которых есть разработчики, дизайнеры и тестировщики. Чтобы было немного но и была вложенность.

- Сериализуй CTO в текст с настройкой prettyPrinting и текст запиши в файл в корне проекта.

- Прочитай текст из файла, десериализуй его в объект класса Employee и распечатай в консоль.

 */

fun main() {

    val backendDev = Employee(
        name = "Charlie",
        isEmployed = true,
        birthDate = "1995-11-20",
        position = CharacterTypes.BACKEND_DEV
    )

    val qa = Employee(
        name = "David",
        isEmployed = true,
        birthDate = "1993-03-12",
        position = CharacterTypes.QA
    )

    val uxUi = Employee(
        name = "Frank",
        isEmployed = true,
        birthDate = "1998-07-19",
        position = CharacterTypes.UX_UI
    )

    val gameDev = Employee(
        name = "Grace",
        isEmployed = true,
        birthDate = "1991-06-22",
        position = CharacterTypes.GAME_DEV
    )

    val teamLead1 = Employee(
        name = "Bob",
        isEmployed = true,
        birthDate = "1990-08-15",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(uxUi,qa,backendDev)
    )

    val teamLead2 = Employee(
        name = "Ron",
        isEmployed = true,
        birthDate = "2000-07-12",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(gameDev,qa,backendDev)
    )

    val cto = Employee(
        name = "Alice",
        isEmployed = true,
        birthDate = "1980-05-10",
        position = CharacterTypes.CTO,
        subordinates = listOf(teamLead1, teamLead2)
    )

    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)
    println(json)
    val file = File("src/main/kotlin/org/emil/kotlincourse/lesson31/Homework/json/homework.json")
    file.apply {
        parentFile.mkdirs()
        writeText(json)
    }
    val readJson = file.readText()
    val revertJson = gson.fromJson(readJson, Employee::class.java)
    println(revertJson)
}