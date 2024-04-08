fun main(){

    // For döngüleri
/*
    val denemeListe = mutableListOf<Int>()
    val sayiListe = listOf(1,2,3,4,5)

    //denemeListe.addAll(sayiListe)

    println("For döngüsü burada başlıyor..")
    for (item in sayiListe){
        denemeListe.add(item)
        println(denemeListe)
    }
    println("for döngüsü bitti")
    println(denemeListe)

 */

    /*
    val yeniListe = listOf("a","b","c","d")

    // indices.

    for (i in yeniListe){ // i -> item veya index
        println(i)
    }

    for (i in yeniListe.indices){
        println(yeniListe.get(i))
    }

     */

    /*
    // Aralık-> Range kullanarak for döngüsü

    var toplam = 0

    for (i in 1..10){
        toplam += i
        println("Toplam: $toplam")
    }
    println("Son Toplam: $toplam")

    for (i in 1..10 step 2){// Step -> Basamak atlama!
        println(i)
    }

    for (i in 10 downTo 1){ // DownTo -> Aşağı yönlü döngü
        println(i)
    }

     */

    /*
    // Map ile for kullanımı

    val map = mapOf("bir" to 1,"iki" to 2,"üç" to 3)

    for ((key,value) in map){
        println("Key: $key, Value: $value")
    }

    for (key in map.keys){
        println("Key: $key")
    }
    for (value in map.values){
        println("Values: $value")
    }

    // When ile for döngüsü

    val ulkeler = listOf("Türkiye","Almanya","Fransa","Italya","Japonya")

    for (ulke in ulkeler){
        val kita = when(ulke){
            "Türkiye"-> "Asya"
            "Almanya", "Fransa", "Italya" -> "Avrupa"
            "Japonya" -> "Asya"
            else -> "Bilinmiyor"
        }

        println("$ulke -> $kita içerisinde")
    }

     */

    // iç içe for döngüsü

    /*
    val meyveler = mutableListOf<String>()

    val meyveTurleri = listOf("Elma","Armut","Çilek")
    val meyveRenkleri = listOf("Kırmızı","Yeşil","Sarı")

    for (tur in meyveTurleri){
        for (renk in meyveRenkleri){
            meyveler.add("$renk $tur") // aksiyon
        }
    }
    println(meyveler)


     */

    val liste = mutableListOf<Int>()

    for (i in 1..3){
        println("Şuan ki i değeri -> $i")
        for (j in 1..3){
            println("Şuan ki j değeri -> $j")
            liste.add(i*j)
            println("Eklenen değer ${i*j}")
        }
    }

    println(liste)















}