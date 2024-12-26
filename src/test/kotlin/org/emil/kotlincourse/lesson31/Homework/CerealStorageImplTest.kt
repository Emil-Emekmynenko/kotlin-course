package org.emil.kotlincourse.lesson31.Homework

import com.emil.org.emil.kotlincourse.lesson31.Homework.Cereal
import com.emil.org.emil.kotlincourse.lesson31.Homework.CerealStorageImpl
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CerealStorageImplTest{
    private val storage = CerealStorageImpl(10.0f, 100.0f)

    // val containerCapacity
    @Test
    fun `containerCapacity should throw if negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-1.0f, 100.0f)
        }
    }

    // val val storageCapacity
    @Test
    fun `storageCapacity should throw if less than containerCapacity`() {
        assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(10.0f, 5.0f)
        }
    }

    // fun addCereal()
    @Test
    fun `addCereal should throw if amount is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            storage.addCereal(Cereal.RICE, -5.0f)
        }
    }

    @Test
    fun `addCereal should throw if storage is full`() {
        repeat(10) { storage.addCereal(Cereal.RICE, 10.0f) }
        assertThrows(IllegalStateException::class.java) {
            storage.addCereal(Cereal.BUCKWHEAT, 10.0f)
        }
    }

    // getCereal
    @Test
    fun `getCereal should throw if amount is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            storage.getCereal(Cereal.RICE, -10.0f)
        }
    }

    @Test
    fun `getCereal should return available amount if less than requested`() {
        storage.addCereal(Cereal.BUCKWHEAT, 5.0f)
        val obtained = storage.getCereal(Cereal.BUCKWHEAT, 10.0f)
        assertEquals(5.0f, obtained, 0.01f)
    }


    // fun removeContainer()
    @Test
    fun `removeContainer should return false if container is not empty`() {
        storage.addCereal(Cereal.RICE, 5.0f)
        assertFalse(storage.removeContainer(Cereal.RICE))
    }


    // fun getAmount()
    @Test
    fun `getAmount should return the correct amount`() {
        storage.addCereal(Cereal.RICE, 7.0f)
        assertEquals(7.0f, storage.getAmount(Cereal.RICE), 0.01f)
    }


    // fun getSpace()
    @Test
    fun `getSpace should return correct remaining space`() {
        storage.addCereal(Cereal.RICE, 6.0f)
        assertEquals(4.0f, storage.getSpace(Cereal.RICE), 0.01f)
    }


    // fun toString()
    @Test
    fun `toString should return correct string representation`() {
        storage.addCereal(Cereal.BUCKWHEAT, 5.0f)
        val expected = "CerealStorage(containerCapacity=10.0, storageCapacity=100.0, storage={BUCKWHEAT=5.0})"
        assertEquals(expected, storage.toString())
    }
}