package KotlinStatic

object Database {

    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

//    companion object {
//        var db: Database? = null
//        fun getInstance(): Database? {
//            if (db == null) {
//                db = Database()
//            }
//            return db
//        }
//    }
//    companion object {
//        var db: Database? = null
//        fun getInstance(): Database {
//            db?.let {
//                return it
//            }
//            val instance = Database()
//            db = instance
//            return instance
//        }
//    }
}



fun main() {
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")
    for (str in db.data) {
        println(str)
    }
}