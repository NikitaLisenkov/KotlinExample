package kotl

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

    fun printInfo(data: Map<String, List<Int>>) {
        val correctData = data.filter { it.value.all { it >= 0 } }

        val averageOfWeek = correctData.flatMap { it.value }.average()
        println("Средняя выручка за неделю: $averageOfWeek")

        val listOfSum = correctData.map { it.value.sum() }
        val max = listOfSum.max()
        val min = listOfSum.min()

        val averageOfMonth = listOfSum.average()
        val maxMonth = correctData.filter { it.value.sum() == max }.keys
        val minMonth = correctData.filter { it.value.sum() == min }.keys
        println("Средняя выручка за месяц: $averageOfMonth")
        println("Максимальная выручка за месяц: $max")
        println("Была в следующих месяцах: ")
        for (month in maxMonth) {
            println("$month ")
        }
        println("Минимальная выручка за месяц: $min")
        println("Была в следующих месяцах: ")
        for (month in minMonth) {
            println("$month ")
        }
        val errorData = data.filter { it.value.any { it < 0 } }
        val errorMonth = errorData.keys
        println("Ошибки произошли в следующих месяцах: ")
        for (month in errorMonth) {
            println("$month ")
        }
    }






