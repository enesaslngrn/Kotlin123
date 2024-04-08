fun main(){
    // Overloading nedir? -> 2 farklı fonksiyon aynı isimde olabilir.

    /*
    1. Fonksiyonların parametre sayısı farklı olmalı.
    2. Parametre tipleri farklı olmalı.
     */

    println(deneme(5))
    println(deneme(2,3))
    val sonuc = deneme("Enes")
    println(sonuc)

    val sayiListesi = mutableListOf<Int>()

    for (i in 1..5){
        listeFonksiyonu(i,sayiListesi)
    }
    println(sayiListesi)

    val kisiListesi = listOf("Ahmet","Mehmet","Ali")
    listeFonksiyonu(kisiListesi)

}

fun deneme(sayi : Int) = sayi * 2

fun deneme(sayi1 : Int, sayi2 : Int) = sayi1 * sayi2

fun deneme(isim : String) = isim + "Merhaba"

fun listeFonksiyonu(sayi : Int, sayiListesi : MutableList<Int>){
    sayiListesi.add(sayi)
}

fun listeFonksiyonu(kisiler : Collection<String>){

    for (kisi in kisiler){
        println("Merhaba $kisi")
    }
}