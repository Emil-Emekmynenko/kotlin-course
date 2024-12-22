package org.emil.kotlincourse.lesson31

import com.emil.org.emil.kotlincourse.lesson31.Calculator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun plus(){
        val calc = Calculator()
        val actual = calc.plus(3,5)
        Assertions.assertEquals(8,actual,"Должно быть 8")
    }
}