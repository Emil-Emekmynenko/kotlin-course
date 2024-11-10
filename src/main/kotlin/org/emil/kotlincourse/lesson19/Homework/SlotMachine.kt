package com.emil.org.emil.kotlincourse.lesson19.Homework

import kotlin.math.pow

class SlotMachine(
    val color: String, //цвет
    val model: String, //модель
    private var state: Boolean, //включен
    private var osSystem: Boolean, //ОС загружена
    val listAvailableGame: List<String>, //список доступных игр
    val gameConsole: Boolean, //наличие джойстика
    private var balanceProceeds: Double, //баланс вырученных средств
    private var owner: String, //владелец
    private var supportPhone: String, // телефон поддержки.

) {
    fun isOn(){} //включить
    fun isOff(){} //выключить
    private fun loadOs(){} //загрузить ОС
    private fun completeOs(){} //завершить работу ОС
    fun showListGames(){} //показать список игр
    fun isOnGame(){} //включить игру
    fun payGamingSession(){} //оплатить игровой сеанс
    fun openSafeIssueCash(){} //открыть сейф и выдать наличные
    private fun payWinnings(){} //выплатить выигрыш
}
