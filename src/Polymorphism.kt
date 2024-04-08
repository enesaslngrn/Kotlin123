

fun main(){

    // Polymorphism -> Çok biçimlilik. -> Aynı isimde farklı parametrelere veya amaçlara sahip methodlar oluşturabilme.

    /*
    1. Overriding methodu aslında bir polymorphism örneğidir. -> Dinamik polymorphism
    2. Overriding ve inheritance olmadan aynı isimde fonksiyonlar yaratma. -> Statik polymorphism
     */

    val baba = Baba()
    baba.selam("Selam veriyor...")

    val cocuk = Cocuk()
    cocuk.selam("Selam veriyor...")

    val islem = Islemler()
    islem.toplama(3,4)
}

open class Baba{
    open fun selam(mesaj : String){
        println("Baba : $mesaj")
    }
}

class Cocuk : Baba(){
    override fun selam(mesaj: String) {
        println("Cocuk : $mesaj")
    }
}

class Islemler{

    fun toplama(x : Int, y: Int) : Int = x+y
    fun toplama(x : Int) : Int = x + 5
    fun toplama(x : Double, y : Double, z : Double) : Double = x+y+z

    fun toplama(){
        println("Toplama işlemi 4 temel matematik işleminden biridir...")
    }
}

