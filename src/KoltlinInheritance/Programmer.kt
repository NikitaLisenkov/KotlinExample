package KoltlinInheritance

class Programmer(name: String, age: Int, val langProg: String) : Worker(name, age), Cleaner {

    override fun work() {
        println("Пишу код на $langProg")
    }

    override fun clean() {
        println("Программист делает уборку")
    }
}