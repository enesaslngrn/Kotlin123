

fun main(){

    // this anahtar kelimesi -> Bu

    val araba = SporAraba(50)
    println(araba.hiz)
    araba.arabaFonksiyonu(100)
    println(araba.hiz)
}
/*
class SporAraba{

    var hiz = 0
    fun arabaFonksiyonu(hiz : Int){
        println("Fonksiyon içindeki hiz: $hiz")
        this.hiz = hiz
    }
}

 */

class SporAraba(var hiz : Int){
    fun arabaFonksiyonu(hiz : Int){
        println("Fonksiyon içindeki hiz: $hiz")
        this.hiz += hiz 
    }
}