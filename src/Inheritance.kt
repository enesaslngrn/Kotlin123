
fun main() {

    // Inheritance (Kalıtım)

    val cocuk = Cocuklar()
    cocuk.kalitim()

    //***********************************

    val menajer = FutbolMenajeri("Ronaldo")

    menajer.ilk11()
    menajer.hangiPozisyon()

    println(menajer.yeniIsim)

}

open class Aile{

    val gozRengi = "Mavi"
    val tenRengi = "Siyah"

    fun kalitim(){
        println("$gozRengi ve $tenRengi")
    }
}

class Cocuklar : Aile(){

    val x = 5
}






