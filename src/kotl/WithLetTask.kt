package kotl

var listOfNumbers: MutableList<Int>? = mutableListOf()

fun main() {
    listOfNumbers?.let {
        with(listOfNumbers) {
            for (i in 0 until 1000) {
                it.add((Math.random() * 1000).toInt())
            }
            val result = it.filter { it % 2 == 0 }.take(100)
            for (i in result) {
                println(i)
            }
        }
    }


}