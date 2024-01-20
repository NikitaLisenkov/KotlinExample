package KotlinOOP

class Cat(val name: String, var age: Int, val weight: Int = 0) {

    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Кличка: $name, Возраст: $age, Вес: $weight")
    }
}