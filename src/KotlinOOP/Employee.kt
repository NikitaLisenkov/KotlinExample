package KotlinOOP

import java.time.LocalDateTime

class Employee(val name: String, val posiiton: String, val startYear: Int) {

    fun work() {
        println("Работаю")
    }

    val experience: Int
        get() = LocalDateTime.now().year - startYear
}