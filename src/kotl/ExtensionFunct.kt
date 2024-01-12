package kotl

fun main() {
    println(5.isSimpleNumber())
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isSimpleNumber(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}
