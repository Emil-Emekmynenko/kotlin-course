package com.emil.org.emil.kotlincourse.lesson19.Homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    //// потому что в классе ChildrenClass создана новая переменная с именем privateVal
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    ////потому что это защищённая переменная и может использоваться только в классе BaseClass и наследниках,
    //// но не в main
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    ///Потому что класс к которому присвоена функция protected
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    /// Потому что класс к которому присвоена функция private и она может использоваться только в этом классе
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass

    fun setPrivateField1(value: String){
        privateField = value
    }
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    //// потому что этот аргумент есть в классе потомке
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    ////потому что этот метод публичный в классе потомке

    // проверь, что выводится на печать при вызове функции printText()
    //// "Печать из класса BaseClass"
    // и объясни, почему не происходит переопределение метода privatePrint()
    ////потому что он приватный и может использоваться только в том классе, в котором он создан
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    fun printGetAll(){
        println(getAll())
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }
    fun setProtectedField1(value: String){
        protectedField = value
    }
}

fun main(){
    val childrenClass = ChildrenClass(
        privateVal = "",
        protectedVal = "",
        publicVal = ""
    )

    childrenClass.publicField = "Антонио Бандерос"
    childrenClass.setProtectedField1("Изменил ProtectedField")
    childrenClass.setPrivateField1("Изменил PrivateField")
    childrenClass.printText()
    childrenClass.printGetAll()

}
