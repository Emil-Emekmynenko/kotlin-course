package org.emil.kotlincourse.lesson32

import com.emil.org.emil.kotlincourse.lesson32.textPhone
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Classes_practicaKtTest{

    @ParameterizedTest
    @MethodSource("providePhoneNumbers")
    fun `проверка конвертируемости номера`(
        originalNumber: String,
        expectedNumber: String
    ){
        val actual = textPhone(originalNumber)
        assertEquals(expectedNumber,actual)
    }

    //Тесты для ParameterizedTest

//    @Test
//    fun `конвертирует номер в +7`(){
//        val actual = textPhone("89237677772")
//        assertEquals("+7 (923) 767-77-72", actual)
//    }
//
//    @Test
//    fun `очищает лишние символы`(){
//        val actual = textPhone("8(923)7677772 Вася")
//        assertEquals("+7 (923) 767-77-72", actual)
//    }
//
//    @Test
//    fun `без маски +`(){
//        val actual = textPhone("79237677772")
//        assertEquals("+7 (923) 767-77-72", actual)
//    }

    companion object {
        @JvmStatic
        fun providePhoneNumbers() = listOf(
            Arguments.of("89237677772", "+7 (923) 767-77-72"), //Обязательно запятую
            Arguments.of("8(923)7677772 Вася", "+7 (923) 767-77-72"),
            Arguments.of("79237677772", "+7 (923) 767-77-72")
        )
    }
}