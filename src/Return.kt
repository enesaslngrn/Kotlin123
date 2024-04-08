import kotlin.math.sqrt

fun main(){

    // Return -> Döndürmek

    val sonuc = carpma(5,2)

    println(sonuc + 2)

    val alan = 50.0
    val yaricap = yaricapBul(alan)

    println("Alanı $alan olan çemberin yarıçapı = $yaricap")

    val cevre = cevreHesapla(yaricap)
    println("Çemberin çevresi: $cevre")

    val carpmaSonuc = carpma2(5,2)
    println("Çarpma2 sonuç : $carpmaSonuc")

    val birlesenString = stringBirlestir("Merhaba ","Kotlin ","Çok Eğlenceli")
    println(birlesenString)
}

fun carpma(sayi1 : Int, sayi2 : Int) : Int{

    return sayi1*sayi2
}

fun yaricapBul(alan : Double) : Double{
    val pi = 3.14
    return sqrt(alan / pi)
}

fun cevreHesapla(yaricap : Double) : Double{
    val pi = 3.14
    return 2 * pi * yaricap
}

// Return short-hand. Daha kısa yazım.

fun carpma2(sayi1 : Int, sayi2 : Int) : Int = sayi1*sayi2


fun stringBirlestir(a : String, b : String, c : String) : String = a + b + c