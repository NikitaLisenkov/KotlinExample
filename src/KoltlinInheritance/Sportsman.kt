package KoltlinInheritance

class Sportsman() {

    fun callVodonos(vodonos: Vodonos) {
        vodonos.giveMeWater()
    }

    fun callVodonos(giveMeWater: () -> Unit) {
        giveMeWater()
    }
}