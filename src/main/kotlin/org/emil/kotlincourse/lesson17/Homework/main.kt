package com.emil.org.emil.kotlincourse.lesson17.Homework

import com.emil.org.emil.kotlincourse.lesson17.ExtractFirst

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    val newMaterials = listOf(
        "1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15",
        "16", "17", "18", "19", "20"
    )

    val addFirstMaterial = AddFirstMaterial()
    addFirstMaterial.addFirst("new material")
    addFirstMaterial.printContainer()

    val alternatingMaterials = AddingOneByOne()
    ordinalNumbers.forEach { alternatingMaterials.addMaterial(it) }
    alternatingMaterials.addAlternating(newMaterials)
    alternatingMaterials.printContainer()

    val alphabeticalMaterials = AlphabeticalSorting()
    ordinalNumbers.forEach { alphabeticalMaterials.addMaterial(it) }
    alphabeticalMaterials.addInAlphabeticalOrder("apple")
    alphabeticalMaterials.addInAlphabeticalOrder("banana")
    alphabeticalMaterials.printContainer()

    val keyValueMaterials = AddMap()
    val materialsMap = mapOf("key1" to "value1", "key2" to "value2")
    keyValueMaterials.addKeyValueMaterials(materialsMap)
    keyValueMaterials.printContainer()

}