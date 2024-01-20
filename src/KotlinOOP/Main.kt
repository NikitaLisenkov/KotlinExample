package KotlinOOP

fun main() {
//    val user = User()
//    user.name = null
//    user.age = -26
//    println("Имя: ${user.name} Возраст: ${user.age}")

//    val russia = Country(name = "ZZZZZ", 3456)
//    println(russia.name)
//    println(russia.population)


//    val book = Book("1984", 1984, 700)
//    println(book.price)


//    val cat = Cat("Pusik", 12, 5)
//    cat.printInfo()
//    println(cat.isOld)
//    cat.age = 10
//    println(cat.isOld)


    val proger = Employee("Nikita", "AndroidDev", 1997)
    proger.printInfo()
}

fun Employee.printInfo() {
    println("Имя: $name, Должность: $posiiton, Год устройства: $startYear, Стаж: $experience")
}
