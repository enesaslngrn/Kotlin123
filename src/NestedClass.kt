
fun main(){

    // Nested class -> inner , İçe içe sınıf yapısı.

   /*
   1. inner class, outer class'ın içindeki değişken ve methodlara erişebilir.
    */

    val ustSinif = UstSinifim()
    ustSinif.AltSinifim().altFonksiyon()


}

class UstSinifim{

    var ustSayi = 20

    fun ustFonksiyon(){
        println("Üst fonksiyondayım... $ustSayi")
    }

    inner class AltSinifim{
        var altSayi = 10

        fun altFonksiyon(){
            ustSayi += altSayi
            ustFonksiyon()
            println("Alt fonksiyon çalıştı ve bitti..")
        }
    }
}







