package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

fun main() {
/*
Задача 1
Создайте текстовый файл workspace/task1/example.txt
запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
*/
    val file = File("workspace/task1/example.txt") //Создаём путь до фаила

    file.apply {
        parentFile.mkdirs() //Создаём директории до этого фаила
        createNewFile() //Создаём сам фаил
        if (file.exists()) println("Фаил существует") else println("Фаила не существует")
    }

}