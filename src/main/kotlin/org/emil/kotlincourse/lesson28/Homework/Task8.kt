package com.emil.org.emil.kotlincourse.lesson28.Homework

import java.io.File

/*
Задача 8
Создайте файлы
workspace/task10/data/1/4/prod/data14.mysql
workspace/task10/data/2/3/prod/data23.mysql
workspace/task10/data/5/2/prod/data52.mysql
Создайте директорию workspace/task10/backup и
скопируйте туда файлы из workspace/task10/data сохраняя структуру директорий.
 Для копирования используй метод copyTo

 */

fun main() {
    val directory1 = File("workspace/task10/data")
    directory1.mkdirs()
    val directory2 = File("workspace/task10/backup")
    directory2.mkdirs()
    val file1 = "$directory1/1/4/prod/data14.mysql"
    val file2 = "$directory1/2/3/prod/data23.mysql"
    val file3 = "$directory1/5/2/prod/data52.mysql"

    createFile(file1)
    createFile(file2)
    createFile(file3)

    directory1.copyRecursively(directory2) //метод копирует все директории и файлы в нужную директорию

}

fun createFile(path: String){
    File(path).apply {
        parentFile.mkdirs()
        createNewFile()
    }
}