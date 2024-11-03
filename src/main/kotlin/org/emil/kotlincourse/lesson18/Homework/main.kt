package com.emil.org.emil.kotlincourse.lesson18.Homework

fun main() {
    println("----Животные----")
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

    println("----Фигуры----")
    val shapes: List<Shape> = listOf(Circle(5.0), Square(4.0), Triangle(3.0, 6.0))
    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }

    println("----Принтеры----")
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val text = "Это тест принтера"

    println("Laser Printer Output:")
    laserPrinter.print(text)

    println("\nInkjet Printer Output:")
    inkjetPrinter.print(text)

}


fun printColored(text: String, color: String, background: String){
    println("$color$background$text${Colors.RESET}")
}