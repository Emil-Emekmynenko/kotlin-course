package com.emil.org.emil.kotlincourse.lesson14

fun main() {
    averageTestTime(mapOf("1" to 25, "2" to 35, "3" to 65))

    dictionaryWithWeatherData(mapOf("дождь" to "23", "снег" to "24"))

    dictionaryWithWeatherData2(mutableMapOf())

    dictionaryWithWeatherData3(mapOf("1" to true, "2" to false, "3" to true))

    bugTrackingDictionary(mutableMapOf("bug1" to "false", "bug2" to "false", "bug3" to "passed"))

    dictionaryWithTestResults(mapOf("http//1" to 200, "http//2" to 404, "http//3" to 500))

    serviceData(mapOf("1" to 10, "2" to 15, "3" to 65, "4" to 45))

    testResultDictionary(
        mapOf(
            "endpoint1" to "false",
            "endpoint2" to "false",
            "endpoint4" to "passed"
        )
    )

    testEnvironmentConfiguration(
        mapOf(
            "endpoint1" to "false",
            "browserType" to "false",
            "endpoint4" to "passed"
        )
    )

    newDictionary(
        mapOf(
            "1" to 25,
            "2" to 35,
            "3" to 65
        )
    )

    testingSettingsForMobile(
        mapOf(
            "Simens" to "Green",
            "Meizu" to "Black",
            "Samsung" to "Pink"
        )
    )

    testingErrors(
        mapOf(
            200 to "http//1",
            404 to "http//2",
            500 to "http//3"
        )
    )

    testResultDictionary2(
        mapOf(
            "Test1_1.0" to "Passed",
            "Test2_1.1" to "Failed",
            "Test3_1.0" to "Skipped",
            "Test4_2.0" to "Passed",
            "Test5_1.1" to "Failed"
        )
    )
    hasFailedTests(
        mapOf(
            "ModuleA" to "Passed",
            "ModuleB" to "Failed",
            "ModuleC" to "Passed",
            "ModuleD" to "Skipped"
        )
    )

    additionalSettings(
        mutableMapOf(
            "browserType" to "Chrome",
            "timeout" to "30",
            "headless" to "true"
        )
    )

    mergeBugReports(
        mapOf(
            "ModuleA" to "Passed",
            "ModuleB" to "Failed",
            "ModuleC" to "Passed",
            "ModuleD" to "Skipped"
        ),
        mapOf(
            "browserType" to "Chrome",
            "timeout" to "30",
            "headless" to "true"
        )
    )
    clearTestRunData(mutableMapOf(
        "ModuleA" to "Passed",
        "ModuleB" to "Failed",
        "ModuleC" to "Passed",
        "ModuleD" to "Skipped"))

    excludeSkippedTests(mapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped",
        "Test4" to "Passed",
        "Test5" to "Skipped"
    ))

    removeDeprecatedConfigurations(mutableMapOf(
        "timeout" to "30",
        "retryCount" to "3",
        "oldConfig" to "deprecated1",
        "oldConfig" to "deprecated2",
        "logLevel" to "DEBUG"
    ))

    generateTestReport(mapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped",
        "Test4" to "Passed",
        "Test5" to "Failed"
    ))

    archiveTestResults(mutableMapOf(
        "Test1" to "Passed",
        "Test2" to "Failed",
        "Test3" to "Skipped",
        "Test4" to "Passed",
        "Test5" to "Failed"
    ))

    transformTestResults(mapOf(
        "Test1" to 120,
        "Test2" to 150,
        "Test3" to 90,
        "Test4" to 200
    ))

    increasePerformanceScores(mutableMapOf(
        "Version 1.0" to 85.0,
        "Version 1.1" to 90.0,
        "Version 1.2" to 78.5,
        "Version 2.0" to 92.0
    ))

    allTestsPassed(mapOf(
        "Test1" to true,
        "Test2" to true,
        "Test3" to false,
        "Test4" to true
    ))

    anyTestsPassed(mapOf(
        "Test1" to true,
        "Test2" to true,
        "Test3" to false,
        "Test4" to true
    ))

    filterFailedOptionalTests(mapOf(
        "optionalFeatureTest1" to true,
        "optionalFeatureTest2" to false,
        "mandatoryFeatureTest1" to false,
        "optionalFeatureTest3" to false,
        "anotherTest" to true
    ))

}

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.

fun averageTestTime(map: Map<String, Int>) {
    val result = map.values.average().toInt()
    println(result)
}
//Имеется словарь с метаданными автоматизированных тестов,
// где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.

fun dictionaryWithWeatherData(map: Map<String, String>) {
    val result = map.keys
    println(result)
}

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

fun dictionaryWithWeatherData2(map: MutableMap<String, Int>) {
    map["снег"] = 5
    println(map)
}

//Посчитайте количество успешных тестов в словаре с результатами.

fun dictionaryWithWeatherData3(map: Map<String, Boolean>) {
    val result = map.count { it.value }
    println(result)
}

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

fun bugTrackingDictionary(map: MutableMap<String, String>) {
    map.remove("bug3")
    println(map)
}

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.

fun dictionaryWithTestResults(map: Map<String, Int>) {
    for ((url, code) in map) {
        println("$url, $code")
    }
}

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

fun serviceData(map: Map<String, Int>) {
    val result = map.values.filter { it > 15 }
    println(result)
}

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

fun testResultDictionary(map: Map<String, String>) {
    val result = map.getOrElse("endpoint3") { "Похоже endpoint не был протестирован" }
    println(result)
}


//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
// получите значение для "browserType". Ответ не может быть null.

fun testEnvironmentConfiguration(map: Map<String?, String>) {
    val result =
        map.getOrElse("browserType") { throw IllegalArgumentException("Значение для browserType не может быть null") }
    println(result)
}

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

fun newDictionary(map: Map<String, Int>) {
    val newDictionary = map.mapValues { it.value + 1 }
    println(newDictionary)
}

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
// получите настройки для конкретной модели или верните настройки по умолчанию.

fun testingSettingsForMobile(map: Map<String, String>) {
    val result = map.getOrDefault("Samsung") { "Из говна и палок" }
    println(result)
}

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

fun testingErrors(map: Map<Int, String>) {
    val result = map.containsKey(200)
    println(result)
}

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.

fun testResultDictionary2(map: Map<String, String>) {
    val result = map.filterKeys { it.contains("1.1") }
    println(result)
}

//У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

fun hasFailedTests(testResults: Map<String, String>) {

    println(testResults.values.any { it == "Failed" })
}

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

fun additionalSettings(map: MutableMap<String, String>) {
    val additionalSettings = mapOf(
        "baseUrl" to "https://example.com",
        "retryCount" to "3",
        "logLevel" to "DEBUG"
    )
    map.putAll(additionalSettings)
    println(map)
}

//Объедините два неизменяемых словаря с данными о багах.

fun mergeBugReports(bugReports1: Map<String, String>, bugReports2: Map<String, String>) {
    println(bugReports1 + bugReports2)
}

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

fun clearTestRunData(testRunData: MutableMap<String, String>) {
    println( testRunData.clear())
}

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

fun excludeSkippedTests(testResults: Map<String, String>){
    println(testResults.filterNot { it.value == "Skipped"})
}

//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.

fun removeDeprecatedConfigurations(configurations: MutableMap<String, String>) {
    configurations.remove("oldConfig")
}

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

fun generateTestReport(testResults: Map<String, String>){
    val result= testResults.map { (testId, result) -> "$testId: $result" }
    println(result)
}

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

fun archiveTestResults(testResults: MutableMap<String, String>){
    println(testResults.toMap())
}

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод,
// например getNameById(id: String))

fun getNameById(id: String): String {
    val testNames = mapOf(
        "Test1" to "Login Test",
        "Test2" to "Signup Test",
        "Test3" to "Profile Update Test",
        "Test4" to "Password Reset Test"
    )
    return testNames[id] ?: "Unknown Test"
}

fun transformTestResults(testResults: Map<String, Int>){
    println(testResults.mapKeys { (id) -> getNameById(id) })
}

//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
// чтобы учесть новые условия тестирования.

fun increasePerformanceScores(scores: MutableMap<String, Double>){
    // Увеличиваем каждую оценку на 10%
println(scores.mapValues {it.value * 1.10 })
}

//Проверьте, пуст ли словарь с ошибками компиляции тестов.

fun isErrorDictionaryEmpty(errorDictionary: Map<String, String>): Boolean {
    return errorDictionary.isEmpty()
}

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

fun isLoadTestResultsEmpty(loadTestResults: Map<String, Double>): Boolean {
    return loadTestResults.isNotEmpty()
}

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

fun allTestsPassed(testResults: Map<String, Boolean>) {
    println(testResults.values.all { it })
}

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

fun anyTestsPassed(testResults: Map<String, Boolean>) {
    println(testResults.values.any { it })
}

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.

fun filterFailedOptionalTests(testResults: Map<String, Boolean>){
    println(testResults.filterKeys { it.contains("optional")}.filterValues { !it })
}