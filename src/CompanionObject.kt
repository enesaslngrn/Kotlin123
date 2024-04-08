
fun main() {

    // Companion object

    /*
    Meyveler.meyveListe
    Meyveler.meyveleriGoster()

     */

    /*
    Object vs companion object
    1. Class içerisinde tanımlanırlar
    2. Sınıfta tanımlansa dahi hala bir object olduğu için instance olmasına gerek.
     */

    Yemek.sandvic
    Yemek.sandvicMiktar()

    val nesne = Yemek()
    nesne.yemekYe()

    /*
    nesne.sandvic
    nesne.sandvicMiktar() Hata verir! çünkü object içindeki öğelere nesne oluşturup ulaşmaya çalıştık.

     */
}

class Yemek{

    companion object{
        var sandvic = "Sandvic"

        fun sandvicMiktar(){
            val random = (1..30).random()
            println("$random miktarda $sandvic var")
        }
    }

    fun yemekYe(){
        sandvic = "TAvuklu sandvic"
        sandvicMiktar()
    }
}



