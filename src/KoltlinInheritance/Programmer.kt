package KoltlinInheritance

class Programmer(name: String, age: Int, val langProg: String) : Worker(name, age) {

    override fun work() {
        println("Пишу код на $langProg")
    }
}