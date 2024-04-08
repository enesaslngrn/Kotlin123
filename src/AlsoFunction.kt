
var i = 5
fun main(){

    //Also -> Ayrıca -> Ufak değişiklikler yada bilgi verilmesi gerektiğinde kullanılır.

    val havalimani = Havalimani()

    val sondurum = havalimani.apply {

        println("Uçuş rötar yaptı...")
        this.ucusSaati = 20
        ucusBilgileri()
    }.also { // also-> nesne parametresi it
        println("Rötar sebebiyle uçak 3 nolu kapıya taşındı...")
        it.kapiNo = 3
    }

    println(sondurum.kapiNo)

    println("Also olmadan sonuç: ${karesiniAl()}")
}

fun karesiniAl() : Int = (i*i).also { // it-> (i*i)

    println("Sayının karesinin 1 fazlası : ${it + 1}") // Bu kod satırını kaldırsakta. Ana olay bozulmamalı.
}


class Havalimani{

    var ucusSaati = 18
    var kapiNo = 2
    var koltukNo = "20D"

    fun ucusBilgileri(){
        println("$ucusSaati | $kapiNo | $koltukNo")
    }
}