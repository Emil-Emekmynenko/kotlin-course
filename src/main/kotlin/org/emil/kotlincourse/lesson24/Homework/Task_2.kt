package com.emil.org.emil.kotlincourse.lesson24.Homework

fun main() {

    try {
        examplesOfErrors()
    }
    catch (e: NullPointerException){
        println("NullPointerException")
    }
    catch (e: ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundsException")
    }
    catch (e: ClassCastException){
        println("ClassCastException")
    }
    catch (e: NumberFormatException){
        println("NumberFormatException")
    }
    catch (e: IllegalArgumentException){
        println("IllegalArgumentException")
    }
    catch (e: IllegalStateException){
        println("IllegalStateException")
    }
    catch (e: OutOfMemoryError){
        println("OutOfMemoryError")
    }
    catch (e: StackOverflowError){
        println("StackOverflowError")
    }
    finally {
        println("finally block")
    }
}