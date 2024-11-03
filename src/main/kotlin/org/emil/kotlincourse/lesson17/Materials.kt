package com.emil.org.emil.kotlincourse.lesson17

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class  ExtractFirst(): Materials() {
    fun extract(): String{
        val extracted = extractMaterial()
        if(extracted.isEmpty()){
            return ""
        }
        if(extracted.size == 1){
            return extracted[0]
        }
        for (i in 1 until extracted.size){ // ранжирование от 1 до последнего элемента
            addMaterial(extracted[i])
        }
        return extracted[0]
    }
}

class ExtractLast(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 0 until extracted.size - 1) {
            addMaterial(extracted[i])
        }
        return extracted.last()
    }
}
class ExtractMiddle(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        val middleIndex = extracted.size / 2
        for (i in extracted.indices) {
            if (i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}
fun main () {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    val extractFirst = ExtractFirst()
    ordinalNumbers.forEach{extractFirst.addMaterial(it)} // заполнили список нашей переменной
    println(extractFirst.extract())
    extractFirst.printContainer()
}

