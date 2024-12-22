package com.emil.org.emil.kotlincourse.lesson31.Homework

data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)
