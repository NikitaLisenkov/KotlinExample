package KotlinStatic

class Calc {

    companion object {
        val PI = 3.13
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}