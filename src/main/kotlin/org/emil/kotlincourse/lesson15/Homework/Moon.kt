package com.emil.org.emil.kotlincourse.lesson15.Homework

/*
Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
Добавьте свойства isVisible (Boolean), чтобы отображать,
видна ли Луна в данный момент, и phase (String),
чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
Добавьте метод showPhase(), который выводит текущую фазу Луны.
 */

object Moon{
    var isVisible : Boolean = true
    var phase: String = "Full moon"
    fun showPhase(){
        println(
            when {
                isVisible -> "Луна в фазе $phase"
                else -> "Луна не видна"
            }
        )
    }
}