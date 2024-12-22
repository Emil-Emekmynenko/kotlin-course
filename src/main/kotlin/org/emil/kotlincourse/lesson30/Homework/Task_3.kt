package com.emil.org.emil.kotlincourse.lesson30.Homework

/*
Задание 3
Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения
и возвращает Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда.
Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.
 */

fun resultTest(arg: () -> Unit): StatusTests{
    return try{
        arg()
        StatusTests.FAILURE
    } catch(e: AssertionError) {
        StatusTests.PASS
    } catch (e: Exception) {
        StatusTests.BROKEN
    }
}

fun main() {
    println(resultTest { })
    println(resultTest { throw AssertionError() })
    println(resultTest { throw Exception() })
}