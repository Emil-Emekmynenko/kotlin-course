package com.emil.org.emil.kotlincourse.lesson17.Homework

open class GeometricShapes(
    val color: String, // Цвет
    val quantity: Int, // Количество
    val lineWidth: Double, // Толшина линии
) {
    fun changeLineWidth(): Double { // Изменение толщины линии
        return lineWidth * 0.6
    }
}

open class Polygon(
    color: String,
    quantity: Int,
    lineWidth: Double,
    val numberCorners: Int
) : GeometricShapes(color, quantity, lineWidth) {

    fun sumCorners(): Int { // Сумма углов многоугольника
        return 180 * (numberCorners - 2)
    }
}

class Circle(
    color: String,
    quantity: Int,
    lineWidth: Double,
    val radius : Double
) : GeometricShapes(color, quantity, lineWidth) {

    fun areaCircle(): Double { // Площадь круга
        return radius * radius * 3.14
    }
}

class Triangle(
    color: String,
    quantity: Int,
    lineWidth: Double,
    numberCorners: Int,
    val hypotenuse : Int,
    val legA : Int,
    val legB : Int

) : Polygon(color,quantity,lineWidth,numberCorners) {

    fun perimeterTriangle(): Int{
        return hypotenuse + legB + legA
    }
}

class Quadrangle(
    color: String,
    quantity: Int,
    lineWidth: Double,
    numberCorners: Int,
    val square: Boolean

) : Polygon(color,quantity,lineWidth,numberCorners) {

    fun printSquare(){
        if (square){
            println("Это квадрат")
        } else println("Это какой-то многоугольник")
    }
}





