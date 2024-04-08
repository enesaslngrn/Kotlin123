fun main() {

    // Practice 3

    val sporcu = Sporcu("Ahmet",Madalya.ALTIN)
    sporcu.MadalyaAl().madalyaAl()
}

data class Sporcu(val isim : String, val madalya: Madalya){

    val olimpiyatlar = Olimpiyatlar()

    inner class MadalyaAl{
        fun madalyaAl(){
            val pozisyon = olimpiyatlar.pozisyonuAl(madalya)
            println(pozisyon)
            val alinanMadalya = olimpiyatlar.madalya(pozisyon)
            println(alinanMadalya)
        }
    }
}


enum class Madalya(val derece : Int){
    ALTIN(1),GUMUS(2),BRONZ(3),DERECESIZ(4)
}


class Olimpiyatlar{

    fun madalya(derece: Int) : Madalya{
        return when (derece){
            1-> Madalya.ALTIN
            2-> Madalya.GUMUS
            3-> Madalya.BRONZ
            else -> Madalya.DERECESIZ
        }
    }

    fun pozisyonuAl(madalya: Madalya) = madalya.derece // Shorthand return yapısı.
}
