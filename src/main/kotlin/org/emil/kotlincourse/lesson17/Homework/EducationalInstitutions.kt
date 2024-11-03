package com.emil.org.emil.kotlincourse.lesson17.Homework

open class EducationalInstitutions(
    val numberStudents : Int,
    val listDestinations : MutableList<String>,
    val tuitionFees : Double

) {
    fun totalCost() : Double {
        return numberStudents * tuitionFees
    }
}

open class School(
    numberStudents : Int,
    listDestinations : MutableList<String>,
    tuitionFees : Double,
    val howMuchToRentCurtains: Double

): EducationalInstitutions(numberStudents,listDestinations,tuitionFees) {
    fun priceCurtains() : Double {
        return numberStudents * howMuchToRentCurtains
    }
}

open class DrivingSchool(
    numberStudents : Int,
    listDestinations : MutableList<String>,
    tuitionFees : Double,
    val trainingTimeInMonth : Int
) : EducationalInstitutions(numberStudents, listDestinations, tuitionFees) {

    fun quantityDestinations(): Int{
        return listDestinations.size
    }
}

class MotorcycleSchool(
    numberStudents : Int,
    listDestinations : MutableList<String>,
    tuitionFees : Double,
    trainingTimeInMonth : Int,
    val motorcyclePark : Map<String, Int> // Модель - Номер

): DrivingSchool(numberStudents, listDestinations, tuitionFees, trainingTimeInMonth = 4) {

    fun choosingMotorcycle(serialNumberMotorcycle : String): String {
        return "Выбран мотоцикл ${motorcyclePark[serialNumberMotorcycle]}"
    }

}

class TruckSchool(
    numberStudents: Int,
    listDestinations: MutableList<String>,
    tuitionFees: Double,
    trainingTimeInMonth: Int,
    val tuckPark: Map<String, Int>, // Модель - Номер
    val availabilityCategoryB : Boolean

) : DrivingSchool(numberStudents, listDestinations, tuitionFees, trainingTimeInMonth = 4) {

    fun choosingMotorcycle(serialNumberMotorcycle: String): String {
        return "Выбран мотоцикл ${tuckPark[serialNumberMotorcycle]}"
    }

}



