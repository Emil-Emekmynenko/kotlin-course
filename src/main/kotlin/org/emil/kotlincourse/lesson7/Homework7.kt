package com.emil.org.emil.kotlincourse.lesson7

fun main (){
    directRange1()
    println()
    directRange2()
    println()
    reverseRange1()
    println()
    reverseRange2()
    println()
    rangeStep1()
    println()
    rangeStep2()
    println()
    rangeForUntil1()
    println()
    rangeForUntil2()
    println()
    cycleSquare1()
    println()
    cycleSquare2()
    println()
    rangeDoWhile1()
    println()
    rangeDoWhile2()
    println()
    rangeBreak1()
    println()
    rangeBreak2()
    println()
    rangeContinue1()
    println()
    rangeContinue2()
    println()
    cycleWithinCycle()
}

/*
1. Прямой Диапазон:

Напишите цикл for, который выводит числа от 1 до 5.
Напишите цикл for, который выводит четные числа от 1 до 10.

 */

fun directRange1 () {
    for (i in 1..5) {
        print(i)
        print(" ")
    }
}

fun directRange2 () {
    for (i in 1..10) {
        if (i % 2 == 0) {
            print(i)
            print(" ")
        }
    }
}
/*
2. Обратный Диапазон:

Создайте цикл for, который выводит числа от 5 до 1.
Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

 */

fun reverseRange1 () {
    val downTo = 5 downTo 1
    for (i in downTo) {
        print(i)
        print(" ")
    }
}

fun reverseRange2 () {
    val downTo = 10 downTo 1
    for (i in downTo) {
        print(i - 2)
        print(" ")
    }
}
/*
3. С Шагом (step):

Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

 */
fun rangeStep1 () {
    val range = 1..9
    for (i in range step 2) {
        print(i)
        print(" ")
    }
}

fun rangeStep2 () {
    val range = 1..20
    for (i in range step 3) {
        print(i)
        print(" ")
    }
}
/*
Использование До (until):

Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.

 */

fun rangeForUntil1 () {
    val range = 1 until 9
    for (i in range) {
        print(i)
        print(" ")
    }
}

fun rangeForUntil2 () {
    val range = 3 until 15
    for (i in range) {
        print(i)
        print(" ")
    }
}

/*
Цикл while:

Создайте цикл while, который выводит квадраты чисел от 1 до 5.
Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль

 */

fun cycleSquare1 () {
    var counter = 0
    while(counter++ <= 5) {
        print(counter * counter)
        print(" ")
    }
}

fun cycleSquare2 (){
    var counter = 10
    while(counter-- > 5) {
        print(counter)
        print(" ")
    }
}
/*
Цикл do...while:

Используйте цикл do...while, чтобы вывести числа от 5 до 1.
Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

 */

fun rangeDoWhile1 () {
    var number = 5
    do {
        print(number--)
        print(" ")
    } while (number >= 1)
}

fun rangeDoWhile2 () {
    var number = 5
    do {
        print(number++)
        print(" ")
    } while (number < 10)
}

/*
Использование break:
Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

 */

fun rangeBreak1 () {
    val counter = 1..10
    for (i in counter){
        print(i)
        print(" ")
        if (i == 6) break
    }
}

fun rangeBreak2 () {
    var counter = 1
    while (true) {
        if (counter == 10) break
        print(counter++)
        print(" ")
    }
}

/*
Использование continue:

В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

 */

fun rangeContinue1 () {
    val counter = 1..10
    for (i in counter){
        if (i % 2 == 0) continue
        print(i)
        print(" ")
    }
}

fun rangeContinue2 () {
    var counter = 1
    while (counter <= 10) {
        if (counter % 3 == 0) {
            counter++;continue
        }
        print(counter++)
        print(" ")
    }
}

/*
Задача на вложенный цикл

Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
В консоль вывести результат умножения переменных цикла.
Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом,
чтобы отделять значения в строку.
После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки.
Результат должен быть как на картинке.
 */

fun cycleWithinCycle () {
    val counter1 = 1..10
    val counter2 = 1..10
    for (i1 in counter1){
        for (i2 in counter2) {
            print(i1 * i2)
            print(" ")
        }
        println()
    }
}