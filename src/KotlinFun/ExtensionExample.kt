package KotlinFun

fun main() {
    val ob = mutableMapOf<String, String>()
    with(ob) {

        this.keys
        this.values
    }
}

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}

//fun myWith(string: String, operation: String.() -> Unit) {
//    string.operation()
//}
//
//fun myWith(obj: Any, operation: Any.() -> Unit) {
//    obj.operation()
//}