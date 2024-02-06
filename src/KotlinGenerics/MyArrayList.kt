package KotlinGenerics

import java.util.Arrays

class MyArrayList<T> : MyList<T> {

    var array = arrayOfNulls<Any>(10)
    var size = 0

    companion object {
        fun <E> myListOf(vararg elements: E): MyArrayList<E> {
            val list = MyArrayList<E>()
            for (element in elements) {
                list.addItem(element)
            }
            return list
        }
    }

    override fun getItem(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun addItem(string: T) {
        if (size >= array.size) {
            array = Arrays.copyOf(array, array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun removeItem(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAtIndex(index)
                return
            }
        }
    }

    override fun removeAtIndex(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun sizeArray(): Int {
        return size
    }
}


fun main() {
//    val list: MyList<String> = MyArrayList.myListOf()
//    for (i in 0..100) {
//        list.addItem("$i")
//    }
//    for (i in 0..90) {
//        list.removeAtIndex(0)
//    }
//    for (i in 0 until list.sizeArray()) {
//        println(list.getItem(i))
//    }

    val dog = Dog()
    dog.printA()
}