package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

fun main() {

    // Задаём начальную точку отсчёта
    val directory = File("workspace")
    // Создаём поток из директорий
    val directories = directory.walk().filter { it.isDirectory }.map { it.absolutePath }
    // Создаём поток из файлов
    val files = directory.walk().filter { it.isFile }.map { it.absoluteFile }

    println("Выводим путь директорий")
    directories.forEach { println(it) }
    println("Выводим путь файлов:")
    files.forEach { println(it) }

}

