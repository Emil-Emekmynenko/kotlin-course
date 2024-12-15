package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 5
Создайте файл workspace/task5/config/config.txt
запишите в него список параметров (в формате ключ=значение),
а затем прочитайте файл и выведите только значения.
 */

fun main() {
    // Создание директории для файла
    val directory = "workspace/task5/config"
    val configDir = File(directory)
    configDir.mkdirs()

    // Создание файла config.txt
    val configFilePath = File(directory, "config.txt")

    // Запись списка параметров в файл
    val configData = """
        username=admin
        password=1234
        timeout=30
        max_connections=100
        enable_logging=true
    """.trimIndent()

    configFilePath.writeText(configData)
    println("Config file written successfully.")

    // Чтение файла и вывод только значений
    val values = configFilePath.readLines()
        .mapNotNull { line ->
            val parts = line.split("=")
            if (parts.size == 2) parts[1] else null
        }
    values.forEach { println(it) }
}