
fun main(){

    // Abstraction (Soyutlama)
    //abstract anahtar kelimesi -> sınıftan nesne instantiate edilemez, sadece genişletilebilir.

    // Temel görevi kod tekrarını önlemek.

    /*
    1. Abstract sınıftan nesne üretilemez.
    2. Eğer 2 sınıf aynı özellikleri taşıyorsa, bir tane super class yaratıp 2'sininde ondan inherit etmesini sağlamak.
    3. Eğer bir sınıftan miras alınırsa, ve o sınıfta abstract method varsa override edilmek zorunda!
    4. Eğer bir sınıfta abstract yani soyut bir method var o sınıfta abstract olmaz zorunda.
    5. Fakat üst sınıf ve alt sınıf her ikiside abstract ise override edilmesine gerek yok.
     */

    // val selam = Selam() Hata!

    val selam : Selam = SelamVer()
    selam.selam()
    // selam.merhaba Hata! çünkü ben Selam'dan nesne yarattım.

    val yolcu = Yolcu("Enes")
    yolcu.ucusSaati(18)
    yolcu.peronNumarasi(2)

}
abstract class Selam{
    fun selam(){
        println("Selam!")
    }
}
class SelamVer : Selam(){
    fun merhaba(){
        println("Merhaba")
    }
}
class SelamGonder : Selam(){

}

/*
class SelamVer(){

    fun selam(){
        println("Selam!")
    }
}
class SelamGonder(){
    fun selam(){
        println("Selam!")
    }
}

 */

//*******************************

abstract class Ucak(sirket : String){ // içeride abstract method var o yüzden bu da abstract olmalı

    init {
        println("Şirket: $sirket")
    }

    fun peronNumarasi(peron : Int){
        println("Peron : $peron")
    }

    abstract fun ucusSaati(saat : Int) // Abstract methodda body olmaz.
}

class Yolcu(var isim : String) : Ucak("TürkHavaYolları"){ // Open olmak zorunda değil, abstract'ta olur.
    override fun ucusSaati(saat: Int) {
        println("$isim uçak saati -> $saat") // Bu methodu en son sil ve sınıfı abstract yap.
    }
}

//************************************
