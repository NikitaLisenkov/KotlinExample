package kotl

fun main() {
//    println(sum(1, 2, 4, 65, 7))
//    println(crop("qwerty"))
//    val result = sum(1, 2, 3, 4, 5, 7, 8)
//    println("Сумма: $result")
//    printInfo(patronymic = "Ivanovich", lastname = "Ivanov", name = "Ivan")
//    println(volume(10, 5, 7))
//    println(sum("10", "wef5gsdre"))
}


//    val a: String? = null
//    val b: String? = "235324"
//    val c: String? = ""
//    val result = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
//    println(result)

//    var money = 700;
//    val food = if (money > 500) {
//        money -= 500
//        "Pizza"
//    } else if (money > 300) {
//        money -= 300
//        "IIIABA"
//    } else {
//        money -= 100
//        "Dowik"
//    }
//    println("Вы можете позволить себе купить следующий продукт: $food, у вас осталось: $money рублей")


//    val indexOfMonth = 3
//    val season = when (indexOfMonth) {
//        12, 1, 2 -> {
//            "Зима"
//        }
//
//        in 3..5 -> {
//            "Весна"
//        }
//
//        in 6..8 -> {
//            "Лето"
//        }
//
//        in 9..11 -> {
//            "Осень"
//        }
//
//        else -> {
//            "Error"
//        }
//    }
//    println(season)


//    val temp = 80
//    val state = when {
//        temp < 0 -> {
//            "Твердое"
//        }
//
//        temp in 0..100 -> {
//            "Жидкое"
//        }
//
//        else -> {
//            "Газообразное"
//        }
//    }
//    print(state)


//    val time = 12
//    val goodWeather = false
//    val result = when {
//        time in 6..22 && goodWeather -> {
//            "Гулять"
//        }
//        time in 6..22 && !goodWeather -> {
//            "Читать книгу"
//        } else -> {
//            "Спать"
//        }
//    }
//    println(result)


//    val listOfNumbers: MutableList<Int> = ArrayList()
//    listOfNumbers.add(5)
//    println(listOfNumbers[0])


//    val array = arrayOfNulls<Int?>(101)
//    for (i in array.indices) {
//        array[i] = i
//    }
//    for (i in array) {
//        println(i)
//    }
//    for (i in 100 downTo 0 step 2) {
//        println(i)
//    }


//    val array = arrayOfNulls<Int?>(101)
//    for (i in 200..300) {
//        array[i] = i
//    }
//    for ((index, i) in array.withIndex()) {
//        array[index] = i?.times(2)
//    }
//    for (i in array) {
//        println(i)
//    }


//    val array = arrayOfNulls<Int?>(301)
//    for ((index, i) in (300..600).withIndex()) {
//        array[index] = i
//    }
//    for (i in array.size - 1 downTo 0 step 5) {
//        println(array[i])
//    }


//fun max(a: Int, b: Int) = if (a > b) a else b
//fun crop(str: String) = str.substring(0, Math.min(5, str.length))
//fun sum(vararg numbers: Int): Int = numbers.sum()


//fun printInfo(lastname: String = "", name: String = "", patronymic: String = "") {
//    if (lastname.isNotEmpty()) {
//        println("Фамилия: $lastname")
//    }
//    if (name.isNotEmpty()) {
//        println("Имя: $name")
//    }
//    if (patronymic.isNotEmpty()) {
//        println("Отчество: $patronymic")
//    }
//}


//fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c


//fun sum(a: String, b: String): Int {
//    return try {
//        val numA = a.toInt()
//        val numB = b.toInt()
//        numA + numB
//    } catch (e: Exception) {
//        0
//    }
//}









