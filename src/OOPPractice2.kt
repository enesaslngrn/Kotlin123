import kotlin.random.Random


fun main() {
    // Practice 2

    val yarismaci1 = Yarismaci()
    yarismaci1.isim = "Ahmet"
    val yarismaci2 = Yarismaci()
    yarismaci2.isim = "Ayşe"

    for (i in 1..5){
        println("Soru $i:")
        val soru = Soru()
        println(soru.soruMetni)

        val cevap1 = yarismaci1.cevapAl()
        val cevap2 = yarismaci2.cevapAl()

        if (cevap1 == soru.cevap){
            yarismaci1.puanArttir()
        }

        if (cevap2 == soru.cevap){
            yarismaci2.puanArttir()
        }
    }

    println("\n Yarışma Bitti")
    println("${yarismaci1.isim}: ${yarismaci1.puan} puan")
    println("${yarismaci2.isim}: ${yarismaci2.puan} puan")

    if (yarismaci1.puan > yarismaci2.puan){
        println("${yarismaci1.isim} kazandı!")
    }else if(yarismaci2.puan > yarismaci1.puan){
        println("${yarismaci2.isim} kazandı!")
    }else{
        println("Berabere")
    }

}

// Adım 1
class Yarismaci{

    var isim : String = ""
    var puan = 0

    fun cevapAl() : Int{
        println("$isim, cevabınızı girin:")
        val input = readLine()?.toIntOrNull() ?: 0
        return input
    }

    fun puanArttir(){
        puan += 10
        println("$isim, doğru cevap verdiniz! Puan 10 arttı. Toplam puanınız: $puan")
    }
}

// Adım 2
class Soru{

    val sayi1 = Random.nextInt(10,100)
    val sayi2 = Random.nextInt(10,100)
    val soruMetni = "$sayi1 + $sayi2 = ?"
    val cevap = sayi1 + sayi2

}
