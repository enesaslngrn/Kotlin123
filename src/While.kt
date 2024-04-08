fun main(){

    // While döngüsü

    /*
    var sayac = 0

    while (sayac <= 10){
        println(sayac)
        sayac++
    }

    var cumle = "MerhabaKotlin"
    var index = 0

    while (index < cumle.length){
        println(cumle.get(index))
        index++
    }

     */

    // random() fonksiyonu

    /*
    val randomSayilar = mutableListOf<Int>()

    var toplam = 0

    while (toplam < 1000){
        val rastgeleSayi = (1..100).random()
        println("Rastgele sayı: $rastgeleSayi")
        randomSayilar.add(rastgeleSayi)
        toplam += rastgeleSayi
        println("Toplam: $toplam")
    }

    // While-for döngüsü iç içe while ve for
    val renkListe = listOf("Kırmızı","Mavi","Sarı","Mor","Yeşil")
    var listeIndex = 0

    while (listeIndex < renkListe.size){
        val renk = renkListe.get(listeIndex)
        println(renk)

        var harfIndex = 0

        for (harf in renk){
            println("Renk: $renk, Harf: ${renk.get(harfIndex)}")
            harfIndex++
        }
        listeIndex++
    }

     */

    // Map ile while döngüsü+

    /*
    val meyveler = mapOf(
        "elma" to 5,
        "armut" to 2,
        "muz" to 3
    )

    var i = 0
    val anahtar = meyveler.keys.toList()
    val deger = meyveler.values.toList()

    while (i < meyveler.size){
        val meyve = anahtar.get(i)
        val kg = deger.get(i)
        println("$meyve: $kg kg")
        i++
    }

     */

    // iç içe while döngüsü


    var i = 1

    while (i <= 5) {
        var j = 1
        while (j <= i) {
            print("$j ")
            j++
        }
        println()
        i++
    }



    /*
    var i = 10

    do {
        println("Sayı: $i")
        i++
    }while (i <= 5)

     */


}