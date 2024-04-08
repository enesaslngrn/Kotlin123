
fun main(){

    // Yaygın yüksek mertebe fonksiyonlar

    // forEach

    val list = listOf("a","b","c","d")

    list.forEach { harf -> println("Harf $harf") }

    list.forEach { harf ->
        println(harf)
    }



    //Filter

    val isimler = listOf("Enes","Ahmet","Mehmet","Ali")

    val filtreListe = isimler.filter { isim -> isim.length > 3 } // predicate -> ifade etmek
    println(filtreListe)

    isimler.filter {
        it.length > 4
    }.forEach {
        println("Merhaba $it")
    }

    // Map

    val mapList = isimler.map {
        it.length
    } // Transform -> Dönüşüm.

    println(mapList)

    val mapList2 = isimler.map { isim ->
        "Merhaba $isim"
    }
    println(mapList2)


    // SortedBy -> e' göre sırala

    val siraliListe = isimler.sortedBy {
        it.length
    }
    println(siraliListe)

    // MinBy-MaxBy

    val sayiListesi = listOf(1,2,3,4,5,6)

    val min = sayiListesi.minBy { sayi ->
        sayi
    }
    println(min)

    val max = isimler.maxBy {
        it.length
    }
    println(max)

}