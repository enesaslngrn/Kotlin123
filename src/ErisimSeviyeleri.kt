
fun main(){

    // Erişim seviyeleri ( Visibilty modifiers )

    /*
    Default -> Public -> Her yerden erişilebilir
    Private -> (Özel) Ancak oluşturuldupu kapsamdan erişlilebilir.
    Protected -> (Korunan) -> Bulunduğu kapsam ve alt kapsamdan erişilir. Inheritence -> Kalıtım
    Internal -> Bulunduğu modül içinden erişilebilir. ( Kotlin )
     */

    val publicDegisken : Int = 5

    val publicNesne = PublicSinif()
    publicNesne.sayi1
    //publicNesne.sayi2 Hata!

    publicNesne.fonksiyon1()
    //publicNesne.fonksiyon2() Hata!

    val altSinif = AltSinif()
    altSinif.AnaSiniftanVeriAl()

    val internalSinif = InternalSinif()
    internalSinif.a
}

fun publicFonksiyon(){ // Public olarak geliyor

}

class PublicSinif{
    val sayi1 = 5
    // private
    private var sayi2 = 10

    fun fonksiyon1(){

    }

    private fun fonksiyon2(){

    }
}

class PublicSinif2{

    fun fonksiyon3(){
        val publicNesne2 = PublicSinif()
        // publicNesne2.fonksiyon2() Hata!
    }
}

open class AnaSinif{
    protected val sayi = 5
}

class AltSinif : AnaSinif(){
    fun AnaSiniftanVeriAl(){
        println("Sayi: $sayi")
    }
}

internal class InternalSinif{
    var a = 5
}