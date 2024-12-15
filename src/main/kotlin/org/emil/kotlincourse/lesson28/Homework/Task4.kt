package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 4
Создайте директорию workspace/task4/temp.
Внутри директории temp создайте несколько вложенных файлов и директорий.
Удалите директорию workspace/task4 со всем содержимым
 */

fun main() {
    val direction = File("workspace/task4/temp")
    direction.mkdirs()

    val file1 = File(direction,"file1.txt")
    val file2 = File(direction,"file2.txt")
    val direction1 = File(direction,"biba")
    val direction2 = File(direction,"boba")

    file1.createNewFile()
    file2.createNewFile()
    direction1.mkdir()
    direction2.mkdir()

    val parentDirection = File("workspace/task4/")

    if (parentDirection.deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }
}