package KotlinFun

var name: String? = "deryedrydry"

fun main() {
    name?.let {
        if (it.length > 5) {
            println("setrdsg")
        }
    }

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0..1000) {
            this.add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }
}


