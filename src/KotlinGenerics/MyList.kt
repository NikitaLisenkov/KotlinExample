package KotlinGenerics

interface MyList<T> {
     fun getItem(index: Int): T
     fun addItem(string: T)
     fun removeItem(element: T)
     fun removeAtIndex(index: Int)
     fun sizeArray(): Int
}