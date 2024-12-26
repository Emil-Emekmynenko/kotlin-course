package org.emil.kotlincourse.lesson32.Homework

import com.emil.org.emil.kotlincourse.lesson32.Homework.PhoneNumberFormatter
import com.emil.org.emil.kotlincourse.lesson32.calculateDiscountedPrice
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class PhoneNumberFormatterTest{

    @ParameterizedTest
    @MethodSource("providePhoneNumbers")
    fun numberValidation(
        expectedPhone: String,
        numberPhone: String,
    ) {
        val actual = PhoneNumberFormatter().formatPhoneNumber(numberPhone)
        assertEquals(expectedPhone, actual)
    }

    @ParameterizedTest
    @MethodSource("providePhoneNumbersNegative")
    fun numberValidationNegative(
        numberPhone: String
    ){
        assertThrows<IllegalArgumentException>("Невалидный номер") {
            PhoneNumberFormatter().formatPhoneNumber(numberPhone)
        }
    }


    companion object {
        @JvmStatic
        fun providePhoneNumbers() = listOf(
            Arguments.of("+7 (922) 941-11-11", "8 (922) 941-11-11"), //Обязательно запятую
            Arguments.of("+7 (922) 941-11-11", "79229411111"),
            Arguments.of("+7 (922) 941-11-11", "+7 922 941 11 11"),
            Arguments.of("+7 (922) 941-11-11", "9229411111"),
            Arguments.of("+7 (922) 941-11-11", "abc +7 922 941 11 11")
        )

        @JvmStatic
        fun providePhoneNumbersNegative() = listOf(
            Arguments.of("12345"), //Обязательно запятую
            Arguments.of("+1 (922) 941-11-11")
        )
    }
}
/*
- `8 (922) 941-11-11` -> `+7 (922) 941-11-11`
- `79229411111` -> `+7 (922) 941-11-11`
- `+7 922 941 11 11` -> `+7 (922) 941-11-11`
- `9229411111` -> `+7 (922) 941-11-11`
- `abc +7 922 941 11 11` -> `+7 (922) 941-11-11`
- `12345` -> `Exception` (невалидный номер)
- `+1 (922) 941-11-11` ->  `Exception` (невалидный номер)
 */