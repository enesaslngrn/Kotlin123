
fun main(){

    // Operatörler ve Booleans

    /*
    Aritmetik operatörler -> + - * /     %, ++, --, +=, -= ... /=
     */

    println(10%6)

    var arabaSayisi = 10

    ++arabaSayisi

    println(arabaSayisi)

    --arabaSayisi

    println(arabaSayisi)

    arabaSayisi += 5 // arabaSayisi = arabaSayisi + 5

    println(arabaSayisi)

    arabaSayisi /= 3

    println(arabaSayisi)


    // Booleans -> true ve false

    var denemeBoolean = true
    println(denemeBoolean::class.java)

    /*
    denemeBoolean = "true"
    denemeBoolean = 5

     */

    // Mantıksal operatörler

    /*
        &&, || ve !
     */

    val kofte = true
    val ekmek = false

    println(kofte && ekmek)
    println(kofte || ekmek)

    println("Köfte ekmek var mı?: ${kofte || ekmek}")

    val sicak = true
    val soguk = !sicak
    println(soguk)

    // Karşılaştırma operatörleri

    /*
            <,>,<=,>=, ==, !=
     */

    val ilkSayi = 5
    val ikinciSayi = 6

    println("$ilkSayi < $ikinciSayi sonucu: ${ilkSayi < ikinciSayi}")

    println(ilkSayi >= ikinciSayi)

    println(ilkSayi == ikinciSayi)

    println(ilkSayi != ikinciSayi)

}

























































    /*
    val isim = "Enes"
    val soyisim = "Aslangören"

    val isimSoyisim = isim + " " + soyisim
    println(isimSoyisim)

    val isimSoyisim2 = isim + "\t" + soyisim
    println(isimSoyisim2)

    val isimSoyisim3 = isim + "\n" + soyisim
    println(isimSoyisim3)

    var benimHayvanim = "Benim hayvanım bir "

    val benimKedim = benimHayvanim + "kedi"
    println(benimKedim)

    val benimKöpek = "Köpeğimin ismi 'Patron'"
    println(benimKöpek)

    val benimKus = "Kuşumun ismi \"Asil\""
    println(benimKus)

    var benimStringim : String
    benimStringim = "Metin yazıyorum."
    // Hata. benimStringim = 10

    var yeniString : String = "Metin"
    println(yeniString)

    // Referans parametresi $

    val arabaMarkasi = "Fiat"
    val arabaModeli = "Egea"
    val arabaYili = 2023

    println("Arabamın markası $arabaMarkasi")
    println("Arabamın modeli $arabaModeli ve $arabaYili yılında üretildi.")

    var ilkSayi = "20"
    var ikinciSayi = "24"

    println(ilkSayi+ikinciSayi)

    println("Şu anda ${ilkSayi+ikinciSayi} yılındayız.")

    var meyveSepeti : String
    val muz = 5
    val elma = 6
    meyveSepeti = "Meyve sepeti içinde toplam ${muz+elma} meyve var."
    println(meyveSepeti)


    // Character -> char
    val benimKarakter = 'A'

    val ilkHarf = 'M'
    val ikinciHarf = 'U'
    val ucuncuHarf = 'Z'

    //println(ilkHarf+ikinciHarf+ucuncuHarf)
    println("Harfleri birleştirince $ilkHarf$ikinciHarf$ucuncuHarf oluyor.")

     */
