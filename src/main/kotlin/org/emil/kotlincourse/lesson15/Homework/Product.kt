package com.emil.org.emil.kotlincourse.lesson15.Homework
/*
Покупка: Продукт Создайте дата класс для продукта,
который будет представлять продукт в магазине.
У него должны быть свойства “название”, “цена”, “количество”.
 */

data class Product(val name : String, val price: Double, val count : Int )
