
fun main(){

    val market = Market()

    println(market.meyve)
    market.satinAl()
    market.fiyatBul(5)
    var sayi : Int = 5
    var isim : String? = null
}

// Sınıflar 2 ana komponent barındırır.

/*
 1. Değişkenler -> Variables
 2. Methodlar -> Fonksiyonlar

 Sınıf->Obje -> Özellik
 */
class Market{

    var meyve = "Elma" // Top-level

    fun satinAl(){
        meyve = "Armut"
        println("Meyve = $meyve")

        var sayi = 0
    }

    fun fiyatBul(fiyat : Int){
        println("Meyve fiyatı $fiyat")
    }

    // satinAl() Hata!
}