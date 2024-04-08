
fun main(){

    // Practice 1

    val zoo = HayvanatBahcesi()

    val kaplan = Kaplan("Cesur")
    val inek = Inek("Sarıkız")

    zoo.hayvanEkle(kaplan)
    zoo.hayvanEkle(inek)

    zoo.yemVer(kaplan)
    zoo.yemVer(inek)

    kaplan.sesCikar()
    inek.sesCikar()
}

open class Hayvan(val ad : String){

    open fun sesCikar(){
        println("$ad ses çıkarıyor...")
    }

}

sealed class Yiyecek {
    class Et(val tur : String) : Yiyecek()
    class Bitki(val tur : String) : Yiyecek()
}

class HayvanatBahcesi{

    private val hayvanlar = mutableListOf<Hayvan>()

    internal fun hayvanEkle(hayvan: Hayvan){
        hayvanlar.add(hayvan)
    }

    internal fun yemVer(hayvan: Hayvan){
        when(hayvan){
            is Kaplan -> hayvan.yiyecekVer(Yiyecek.Et("Et"))
            is Inek -> hayvan.yiyecekVer(Yiyecek.Bitki("Ot"))
        }
    }
}

class Kaplan(ad : String) : Hayvan(ad){
    override fun sesCikar() {
        super.sesCikar()
        println("$ad kükrüyor...")
    }

    fun yiyecekVer(yiyecek: Yiyecek.Et){
        println("$ad | ${yiyecek.tur} yiyor...")
    }
}

class Inek(ad : String) : Hayvan(ad){
    override fun sesCikar() {
        super.sesCikar()
        println("$ad mö diyor...")
    }

    fun yiyecekVer(yiyecek: Yiyecek.Bitki){
        println("$ad | ${yiyecek.tur} yiyor...")
    }
}