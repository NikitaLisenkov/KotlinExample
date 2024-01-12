package kotl

import jav.Main

fun main() {
//    val square: (Int) -> Int = { it * it }
//    println(square(3))

//    val perimeter: (Int, Int) -> Int = {a, b -> (a + b) * 2}
//    println(perimeter(2, 3))

//    val sayHello: (String) -> Unit = { println("Привет: $it")}
//    sayHello("Nikita")

//    val sort: (Array<Int>) -> Array<Int> = { it.sortedArrayDescending() }
//    val sortedArray = sort(arrayOf(1,2,3,4,5))
//    for (i in sortedArray) {
//        println(i)
//    }


//    val listOfNumbers = mutableListOf<Int>()
//    for (i in 0..99) {
//        listOfNumbers.add(i)
//    }
//    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
//    for (i in listOfEvenNumbers) {
//        println(i)
//    }
//
//    val names = listOf("Nikita", "Andrei", "Artur", "Igor")
//    val namesA = names.filter { it.startsWith("A") }
//    for (name in namesA) {
//        println(name)
//    }

//    val numbers = (0..100).toList()
//    val numbersDoubled = numbers.map { it * 2 }
//    for (i in numbersDoubled) {
//        println(i)
//    }

//    val numbers = (0..100).toList()
//    val employees = numbers.map { "Employee №$it" }
//    for (i in employees) {
//        println(i)
//    }

//    val array = arrayOf(7,456,76,2,4,9)
//    val sortedArray = array.sorted()
//    for (i in sortedArray) {
//        println(i)
//    }


//    val initArray = mutableListOf<Int>()
//    for (i in 0 until 1000) {
//        initArray.add((0 until 1000).random())
//    }
//    val result = initArray
//        .filter { it % 5 == 0 || it % 3 == 0 }
//        .map { it * it }
//        .sortedDescending()
//        .map { "$it" }
//    for (i in result) {
//        println(i)
//    }


//    val array = (0..1000).toList()
//    val employees = array.map { "Employee №$it" }
//    val first30 = employees.dropLast(950)
//    for (i in first30) {
//        println(i)
//    }


//    val array = generateSequence {
//        (Math.random() * 100).toInt()
//    }
//    val evenList = array.take(10)
//    for (i in evenList) {
//        println(i)
//    }


//    val employeesList = generateSequence(1) { it + 1 }
//        .map { "Employee №$it" }
//        .take(100)
//    for (i in employeesList) {
//        println(i)
//    }


//    val listNames = mutableListOf<String>()
//    val listPhones = mutableListOf<Long>()
//    for (i in 0 until 1000) {
//        listNames.add("Имя$i")
//        listPhones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//    }
//    val users = listNames.zip(listPhones)
//    for (user in users) {
//        println("Name: ${user.first} Phone: ${user.second}")
//    }


//    val fullNames = mutableListOf<String>()
//    for (i in 0..1000) {
//        fullNames.add("Имя$i Фамилия$i")
//    }
//    val names = fullNames.map { it.substringBefore(" ") }
//    val lastNames = fullNames.map { it.substringAfter(" ") }
//    val users = names.zip(lastNames)
//    for (user in users) {
//        println("Имя: ${user.first} Фамилия: ${user.second}")
//    }


//    val revenueOfWeek = listOf(
//        listOf(8, 7, 4, 6, 3),
//        listOf(9, 5, 2, 7, 4),
//        listOf(7, 7, 4, 6, 8),
//        listOf(6, 7, 4, 6, 9)
//    )
//    val total = revenueOfWeek.flatMap { it }
//    val average = total.average()
//    println(average)


//    val data = mapOf(
//        "file1" to listOf(15, 20, 25, 30, 35),
//        "file2" to listOf(17, 20, 25, 30, 45),
//        "file3" to listOf(19, 20, 25, 30, 55)
//    )
//    val average = data.flatMap { it.value }.average()
//    println(average)

//    val data1 = mapOf(
//        "file1" to listOf(15, 20, 25, 30, 35),
//        "file2" to listOf(17, -20, 25, 30, 45),
//        "file3" to listOf(19, 20, 25, 30, 55)
//    )
//    val average1 = data1.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
//    println(average1)

}