
fun main(){
/*
    // İç içe if ve short-hand if

    val denemeListe = mutableListOf<Int>()
    val sayilar = listOf(1,3,7,9,10)
    denemeListe.addAll(sayilar)

    println(denemeListe.isEmpty())
    if (denemeListe.isEmpty()){
        println("Liste Boş!")
    }else{
        println("Liste dolu")
    }


    if (denemeListe.contains(5)){
        println("Evet")
    }else{
        println("Hayır")
        denemeListe.add(2,5)
        println(denemeListe)
    }

    val hepsiTekMi = denemeListe.all {
        it % 2 != 0
    }
    println(hepsiTekMi)

    if (hepsiTekMi){
        println("Liste tek: $denemeListe")
    }else{
        println("Değil")
    }

 */

    // İç içe if koşulu

/*
    println("Yemek sıcak mı soğuk mu? Sıcak -> y, Soğuk -> n")

    val yemek = readLine()

    if (yemek == "y"){
        println("Soğumasını bekleyecek misiniz? (evet yada hayır)")
        val bekle = readLine()

        if (bekle == "evet"){
            println("Yemeğin soğuması bekleniyor...")
        }else if (bekle == "hayır"){
            println("Hemen yiyeceğim!")
        }
    }else if(yemek == "n"){
        println("Isıtmak ister misiniz? (evet yada hayır)")
        val cevap = readLine()

        if (cevap == "evet"){
            println("Mikrodalga çalıştılıyor..")
        }else{
            println("Hemen yiyeceğim.")
        }
    }

 */


    // Shorthand if (kısayol ile if koşulu oluşturma)

    /*
    if (sayi == 5){
        println("")
    }else{
        println("")
    }

     */

    val sayi = 5

    val kisayolSayi = if (sayi == 5) "Sayı: 5" else "Değil"
    println(kisayolSayi)
/*
    var ciftMi = ""

    if (sayi % 2 == 0){
        ciftMi = "Sayı çift"
    }else{
        ciftMi = "Sayı tek"
    }

    println(ciftMi)

 */

    val ciftMi = if (sayi % 2 == 0) "Sayı cift" else "Sayı tek"
    println(ciftMi)
}

    /*
    /*
    val yas = 35

    if (yas > 30){
        println("30 yaşından büyüksünüz")
        println("30 yaşından büyüksünüz")
        println("30 yaşından büyüksünüz")
        println("30 yaşından büyüksünüz")
    }else{
        println("30 yaşından küçüksünüz.")
        println("30 yaşından küçüksünüz.")
        println("30 yaşından küçüksünüz.")
    }

    println("Hangi mevsimdeyiz?")

    val mevsim = readLine()

    if (mevsim == "ilkbahar"){
        println("Çiçekler açıyor...")
    }else{
        println("Keşke bahar olsa!")
    }

     */

    println("Lütfen bir sayi değeri giriniz:")

    val sayi = readLine()
    var sayiToInt = sayi!!.toInt()

    val urunFiyati = 100
    var urunAdet = 0

    if (sayiToInt < urunFiyati){
        println("Paranız yetersiz! ${urunFiyati-sayiToInt} kadar para lazım.")
    }else if (sayiToInt > urunFiyati){
        urunAdet = sayiToInt / urunFiyati
        println("$urunAdet tane ürün alabilirsiniz")
    }else if (sayiToInt == urunFiyati){
        println("Paranız tam yetiyor.")
    }else{
        println("Hatalı bir sayı girdiniz")
    }

    /*
    if (sayiToInt % 2 == 0){
        println("Girilen sayı çift -> $sayiToInt")
    }else{
        println("Çift değil!")
    }

     */


     */
