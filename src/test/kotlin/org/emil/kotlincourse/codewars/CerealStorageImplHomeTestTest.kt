package org.emil.kotlincourse.codewars

import com.emil.org.emil.kotlincourse.codewars.Cereal
import com.emil.org.emil.kotlincourse.codewars.CerealStorageImplHomeTest
import com.emil.org.emil.kotlincourse.lesson31.Homework.CerealStorageImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CerealStorageImplHomeTestTest{
    private val storage = CerealStorageImplHomeTest(10.0f, 100.0f)

    //Тест для containerCapacity
    @Test
    fun `ошибка если containerCapacity отрицательное значение`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-1.0f, 100.0f)
        }
    }

    //Тест для storageCapacity
    @Test
    fun `ошибка если storageCapacity меньше чем containerCapacity`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(10.0f, 9.0f)
        }
    }

    // Тест для addCereal
    @Test
    fun `ошибка если перадано отрицательное значение в amount`(){
        assertThrows(IllegalArgumentException::class.java){
            storage.addCereal(Cereal.PEAS,-10.0f)
        }
    }

    @Test
    fun `addCereal ошибка если нельзя разместить ещё один контейнер`(){
        repeat(10){storage.addCereal(Cereal.MILLET,10.0f)}
        assertThrows(IllegalStateException::class.java){storage.addCereal(Cereal.PEAS,10.0f)}
    }

    // Тест для getCereal
    @Test
    fun `getCereal ошибка если перадано отрицательное значение в amount`(){
        assertThrows(IllegalArgumentException::class.java){
            storage.getCereal(Cereal.PEAS,-10.0f)
        }
    }

    // Тест для getCereal
    @Test
    fun `возвращает false если контейнер не пустой`(){
        storage.addCereal(Cereal.RICE,10.0f)
        assertFalse(storage.removeContainer(Cereal.RICE))
    }

    @Test
    fun `возвращает true если контейнер пустой`(){
        storage.addCereal(Cereal.RICE,10.0f)
        storage.getCereal(Cereal.RICE,10.0f)
        assertFalse(storage.removeContainer(Cereal.RICE))
    }
}