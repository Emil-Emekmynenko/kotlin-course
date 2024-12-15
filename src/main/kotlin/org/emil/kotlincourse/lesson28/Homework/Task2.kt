package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 2
    Создайте директорию workspace/task2/testDir
    проверьте, является ли она директорией, и выведите её абсолютный путь.
 */


fun main() {
    val file = File("workspace/task2/testDir")
    file.apply {
        mkdirs()
        if (file.isDirectory) println("Является директорией") else println("Не является директорией")
        println(absoluteFile)
    }
}