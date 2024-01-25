package KoltlinInheritance

fun main() {
//    val sobaka = Dog(3f)
//    println(sobaka.habitat)


//    val employees = mutableListOf<Worker>()
//    employees.add(Seller("A", 22))
//    employees.add(Seller("B", 23))
//    employees.add(Seller("C", 24))
//    employees.add(Programmer("Artur", 25, "Kotlin"))
//    employees.add(Programmer("Nikita", 26, "Kotlin"))
//    employees.add(Director("John", 50))
//    for (employee in employees) {
//        employee.work()
//        if (employee is Programmer) {
//            employee.langProg
//        }
//        if (employee is Cleaner) {
//            employee.clean()
//        }
//    }
//    val cleaners = employees.filter { it is Cleaner }.map { it as Cleaner }
//    for (cleaner in cleaners) {
//        cleaner.clean()
//    }


//    val car = Car()
//    travel(object : Transport(name = "Автобус") {
//        override fun drive() {
//            println("Автобус едет....")
//        }
//    })


    val sportsman1 = Sportsman()
    sportsman1.callVodonos(object : Vodonos {
        override fun giveMeWater() {
            println("Thank you for the water!")
        }
    })
    val sportsman2 = Sportsman()
    sportsman2.callVodonos { println("Thank you for the water!") }
}


//fun travel(transport: Transport) {
//    transport.drive()
//}