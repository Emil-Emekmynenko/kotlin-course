package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 7
Создайте директорию workspace/task9/docs.
Проверь, есть ли файл с именем readme.md.
Если файла нет, создайте его и запишите текст "This is a README file."
 */

fun main() {
    val directory = File("workspace/task9/docs")
    val file = File(directory, "readme.md")
    directory.mkdirs()
    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл создан")
        file.createNewFile()
        file.writeText("This is a README file.")
    }
}