package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 3
Создайте директорию workspace/task3/structure.
Внутри директории structure создайте папку myDir с двумя вложенными
поддиректориями subDir1 и subDir2.
Проверьте, что myDir действительно содержит эти поддиректории.
 */

fun main() {
    val direction = File("workspace/task3/structure")
    direction.mkdirs()
    val direction1 = File(direction,"myDir")
    val direction2 = File(direction1,"subDir1")
    val direction3 = File(direction1,"subDir2")
    direction1.mkdir()
    direction2.mkdir()
    direction3.mkdir()

    if (direction2.exists() && direction3.exists()) println("Фаилы subDir1 и subDir2 существуют")
    else println("Фаилы не существуют")
}