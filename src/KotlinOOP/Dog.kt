package KotlinOOP

class Dog {

    var nickName = "Aw"
        get() {
            return field.lowercase().replaceFirstChar { it.uppercase() }
        }
    var age = 5
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight = 7
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}