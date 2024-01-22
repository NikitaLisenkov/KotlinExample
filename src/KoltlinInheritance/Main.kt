package KoltlinInheritance

fun main() {
//    val sobaka = Dog(3f)
//    println(sobaka.habitat)


    val listOfEmployees = mutableListOf<Worker>()
    listOfEmployees.add(Worker("A", 22))
    listOfEmployees.add(Worker("B", 23))
    listOfEmployees.add(Worker("C", 24))
    listOfEmployees.add(Programmer("Artur", 25, "Kotlin"))
    listOfEmployees.add(Programmer("Nikita", 26, "Kotlin"))
    for (employee in listOfEmployees) {
        employee.work()
    }
}