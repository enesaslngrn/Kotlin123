
fun main(){

    // Practice 2

    val daire = Daire(5.0,"Kırmızı","Benim Dairem")

    println("Daire adı: ${daire.ad}")
    println("Daire Alanı: ${daire.alanHesapla()}")
    println("Daire Çevresi: ${daire.cevreHesapla()}")
    println("Daire rengi: ${daire.renkAl()}")
}


abstract class Sekilim{

    abstract fun alanHesapla() : Double

    abstract fun cevreHesapla() : Double
}

interface SekilOzellikleri{

    val ad : String
    fun renkAl() : String
}

class Daire(val yaricap : Double, val renk : String, override val ad : String) : Sekilim(),SekilOzellikleri{
    override fun alanHesapla(): Double {
        return Math.PI *yaricap * yaricap
    }

    override fun cevreHesapla(): Double {
        return 2 * Math.PI * yaricap
    }

    override fun renkAl(): String {
        return renk
    }
}