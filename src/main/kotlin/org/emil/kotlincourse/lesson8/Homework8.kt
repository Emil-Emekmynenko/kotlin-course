package com.emil.org.emil.kotlincourse.lesson8

fun main () {
    funnyText("Удача")
    logDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    dataEncryption("4539 1488 0343 6467")
    emailFormatting("username@example.com")
    nameExtraction("C:/Пользователи/Документы/report.txt")
    creatingAbbreviation("Объектно-ориентированное программирование")
    creatingWord("петя,вася,женя")
    println(encrypt("бублик+"))
}

/*
Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
делая текст более ироничным или забавным.
Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
Правила Проверки и Преобразования:

Если фраза содержит слово "невозможно":
Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
Если фраза начинается с "Я не уверен":
Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
Если фраза содержит слово "катастрофа":
Преобразование: Замените "катастрофа" на "интересное событие".
Если фраза заканчивается на "без проблем":
Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
Если фраза содержит только одно слово:
Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

Примеры Тестовых Фраз:
"Это невозможно выполнить за один день"
"Я не уверен в успехе этого проекта"
"Произошла катастрофа на сервере"
"Этот код работает без проблем"
"Удача"

 */

fun funnyText (inputString: String): String {
    return when {
        inputString.contains("невозможно",true)
            -> println(inputString.replace("невозможно","совершенно точно возможно, просто требует времени")).toString()
        inputString.startsWith("Я не уверен",true)
            -> println("$inputString, но моя интуиция говорит об обратном ").toString()
        inputString.contains("катастрофа",true)
            -> println(inputString.replace("катастрофа","интересное событие")).toString()
        inputString.endsWith("без проблем",true)
            -> println(inputString.replace("без проблем","с парой интересных вызовов на пути")).toString()
        !inputString.contains(" ",true)->
            println("Иногда, $inputString, но не всегда ").toString()
        else -> println(inputString).toString()
    }
}

/*
Задание 1: Извлечение Даты из Строки Лога.
Используй indexOf или split для получения правой части сообщения.
Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
 */

fun logDate (string: String){
    val date = string.split(" -> ")

    println(date[1].substring(0,10))
    println(date[1].substring(11,19))
}

/*
Задание 2: Маскирование Личных Данных
Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
Замаскируйте все цифры, кроме последних четырех, символами "*".
 */

fun dataEncryption (string: String){
    val numberCard = string.substring(15, 19)
    println("**** **** **** $numberCard")
}

/*
Задание 3: Форматирование Адреса Электронной Почты. Используй replace
Описание: У вас есть электронный адрес "username@example.com".
Преобразуйте его в строку "username [at] example [dot] com".
 */

fun emailFormatting (string: String) {
    val formattingNumber1 = string.replace("."," [dot] ")
    println(formattingNumber1.replace("@"," [at] "))
}

/*
Задание 4: Извлечение Имени Файла из Пути
Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt".
Извлеките название файла с расширением.
 */

fun nameExtraction (string: String) {
    val pathTransformation = string.split("/")
    println(pathTransformation.last())
}

/*
Задание 5: Создание Аббревиатуры из Фразы.
Используй split с набором символов для разделения.
Используй for для перебора слов. Используй var переменную для накопления первых букв.
Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
Создайте аббревиатуру из начальных букв слов (например, "ООП").
 */

fun creatingAbbreviation (string: String) {
    val phraseConversion = string.split(' ','-','/','.',',')
    var abbreviation = ""
    for (i in phraseConversion) {
        if (i.isNotEmpty())
        abbreviation += i[0]
    }
    println(abbreviation.uppercase())
}

/*
Написать метод, который преобразует строку из нескольких слов в строку,
где каждое слово начинается с заглавной буквы, а все остальные - строчные.
(можно использовать такой же подход как в задании 5,
но накапливать не первые буквы, а целиком слова,
составленные из первой буквы с uppercase и оставшейся части слова)
 */

fun creatingWord (string: String) {
    var result = ""
    val phraseConversion = string.split(' ','-','/','.',',')
    for (i in phraseConversion) {
        val uppercaseOne = i.replace(i[0],i[0].uppercaseChar())
        result += "$uppercaseOne "
    }
    println(result)
}

/*
Написать шифратор/дешифратор для строки.
Шифровка производится путём замены двух соседних букв между собой: Kotlin шифруется в oKltni.
Дешифровка выполняется аналогично. Если длина строки - нечётная,
в конец добавляется символ пробела до начала шифрования.
Таким образом все шифрованные сообщения будут с чётной длинной.
Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.
*/

fun encrypt(string: String): String {
    var newString = string
    if (newString.length % 2 != 0) {
        newString += " "
    }
    return decrypt(newString)
}

fun decrypt(string: String) : String {
    var result = ""
    for (i in string.indices step 2) {
        result += string[i + 1]
        result += string[i]
    }
    return result
}