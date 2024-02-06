package KotlinStatic

import kotlin.random.Random

class MyRandom {

    companion object {
        fun randomInt() = (1..11).random()
        fun randomBoolean(): Boolean = (0..1).random() > 0
        fun randomDaysOfWeek() = DaysOfWeek.values().random()
    }
}


fun main() {
    println(MyRandom.randomInt())
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDaysOfWeek())
}