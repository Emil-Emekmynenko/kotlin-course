package com.emil.org.emil.kotlincourse.lesson22.Homework.extentions

/*
Задача 5: Кодер-декодер строк
Реализуйте для класса String два метода расширения: encrypt и decrypt.
Метод encrypt должен сдвигать каждый символ исходной строки на заданное
число позиций вперед по таблице Unicode, а метод decrypt — на то же число позиций назад.
Оба метода принимают один параметр base типа Int, который определяет величину сдвига.
Протестируйте вашу реализацию, убедившись, что после шифрования и последующей
расшифровки строка возвращается к исходному состоянию.
Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера сдвига к char символу.

 */
/*
Задача 6: Собери пидмаркоз!

Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы
(но мы то знаем что слово только одно, но не будем его называть).
Напиши метод расширения строки, который будет принимать список имён
пользователей и выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним.
Если сможешь повторить оригинальный шаблон вывода ответов с помощью похожих ASCII символов,
будет очень круто.

 */

fun String.encrypt(base: Int): String {
    val char = this.toInt(16).toChar()
    val result = char + base
    return result.code.toString(16).padStart(4, '0')
}

fun String.decrypt(base: Int): String {
    val char = this.toInt(16).toChar()
    val result = char - base
    return result.code.toString(16).padStart(4, '0')
}

fun String.pidmarkoz(listName: List<String>) {
//    for ((j, i) in listName.withIndex()) {
//        if (i > this.length.toString()){
//            break} else println("$i\n ${this[j]}")
//    }
    var i = 0
    var j = 0
    while (i < this.length){
        println("${listName[i]}\n ${this[j]}")
        i++
        j++
    }

    println("Avocado1\n Какой $this? вы ебанулись?")
    println("комната\n мы гитлера собирали")
    println("Avocado1\n А почему первая буква ${this[0]}")
}