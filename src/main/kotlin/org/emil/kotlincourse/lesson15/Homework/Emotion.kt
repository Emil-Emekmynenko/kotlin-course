package com.emil.org.emil.kotlincourse.lesson15.Homework

/*
Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
У него должно быть свойство type (String) и intensity (Int).
Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
 */

class Emotion(
    var type: String,
    var intensity: Int
) {
    fun express(){
            val result = when(intensity){
                in 1..29 -> "Серьёзный смайлик"
                in 30..70 -> "Грустный смайлик"
                in 71..100 -> "Плачущий смайлик"
               else -> "Обратись к психологу"
            }
        println("Эмоция: $type. Интенсивность: $intensity")
    }
}