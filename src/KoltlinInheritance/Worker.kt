package KoltlinInheritance

open class Worker(val name: String, val age: Int) {

    open fun work() {
        println("Работаю")
    }
}