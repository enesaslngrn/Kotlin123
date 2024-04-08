
fun main(){

    // Practice 1

    val araba = Arabam()

    araba.modifiyeEt()

    araba.marka = "Mercedes"
    araba.model = 2024
    araba.hiz += 100

    val pilot = araba.pilotIsminiAl()
    println("Pilot ismi : $pilot")

    val arabaOzellikleri = araba.listeyeEkle()
    println("Pilotumuzun ismi $pilot ve kullandığı araç -> $arabaOzellikleri")

}

// Adım 1

class Arabam{

    // Adım 2

    var marka = "Ferrari"
    var model = 2020
    var hiz = 280
    var renk = "Kırmızı"

    fun modifiyeEt(){
        println("Marka: $marka, model: $model, hiz: $hiz, renk : $renk")
    }

    fun pilotIsminiAl() : String{

        println("Lütfen pilotun ismini girin:")
        val input = readlnOrNull() ?: ""

        return input
    }

    fun listeyeEkle() : MutableList<Any>{
        var ozelliklerListesi = mutableListOf<Any>()
        ozelliklerListesi.add(marka)
        ozelliklerListesi.add(model)
        ozelliklerListesi.add(hiz)
        ozelliklerListesi.add(renk)

        return ozelliklerListesi

    }
}
