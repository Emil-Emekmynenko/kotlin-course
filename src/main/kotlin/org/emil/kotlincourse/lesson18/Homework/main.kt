package com.emil.org.emil.kotlincourse.lesson18.Homework

fun main() {
    println("----Животные----")
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound(sound = "Meow")
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
    val cart = ShoppingCart()

    // Добавление товаров разными способами
    cart.addToCart("3") // Добавляем 1 товар
    cart.addToCart("2", 3) // Добавляем 3 товара с ID 2
//    cart.addToCart(mapOf(3 to 2, 4 to 1)) // Добавляем товары из словаря
//    cart.addToCart(listOf(1, 2, 5)) // Добавляем товары из списка

    // Вывод содержимого корзины
    println(cart)

    val logger = Logger()

    // Логирование сообщений разными способами
    logger.log("This is an info message.")
    logger.log("WARNING", "This is a warning message.")
    logger.log("ERROR", "This is an error message.")
    logger.log(listOf("Message 1", "Message 2", "Message 3"))
}


fun printColored(text: String, color: String, background: String){
    println("$color$background$text${Colors.RESET}")
}