package com.emil.org.emil.kotlincourse.lesson17.Homework

open class Furniture (
    val quantityFurniture : Int,
    val typeMaterial : String,
    val price : Double,
    val instruction: Boolean
) {
    fun printInstruction(instructionStr: String): String {
        return if (instruction) {
            "К комплекту прилагается инструкция $instructionStr"
        } else "Инструкция не предусмотрена"
    }
}


open class FurnitureForHome(
    quantityFurniture : Int,
    typeMaterial : String,
    price : Double,
    instruction: Boolean,
    val roomAccommodation: String // Комната размещения
) : Furniture(quantityFurniture, typeMaterial,price,instruction) {

    fun basicKit() : List<String> {
        return when (roomAccommodation) {
            "Kitchen" -> listOf("refrigerator", "stove", "table", "chair", "sink")
            "Living room" -> listOf("sofa", "wardrobe", "TV", "coffee table")
            "Bathroom" -> listOf("bath", "toilet", "sink", "shelving")
            else -> listOf("Выбери нужную комнату")
        }
    }
}

open class FurnitureForGarden(
    quantityFurniture : Int,
    typeMaterial : String,
    price : Double,
    instruction: Boolean,
    val distanceToGarden : Int
) : Furniture(quantityFurniture, typeMaterial,price,instruction) {

    fun priceDelivery(priceForKm: Double): Double{
        return distanceToGarden * priceForKm
    }
}

class ElectricalEngineering(
    quantityFurniture : Int,
    typeMaterial : String,
    price : Double,
    instruction: Boolean,
    roomAccommodation: String,
    val listElectricalAppliances: List<String>

) : FurnitureForHome(quantityFurniture, typeMaterial,price,instruction, roomAccommodation) {

    fun printListElectricalAppliances() {
        println(listElectricalAppliances)
    }
}


