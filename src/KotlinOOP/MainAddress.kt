package KotlinOOP

fun main() {
    val address1 = Address("Snz", "Zababahina", "64")
    val address2 = address1.copy()
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 === address2)
    println(address1 == address2)
}