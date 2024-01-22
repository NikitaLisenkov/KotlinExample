package KoltlinInheritance

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Жру")
    }

    open fun run() {
        println("Бегу")
    }
}