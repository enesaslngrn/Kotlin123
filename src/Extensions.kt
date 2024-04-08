import util.*

fun main() {

    // Extension -> Eklentiler. Kotlinde bulunan bir konsept.

    /*
    Temel amaç -> Meccut bir sınıfın üzerine yeni fonksiyonel özellikler eklememizi sağlayan bir konsept.
    Kodumuz daha okunabilir, esnek, modüler.

    1. Gömülü sınıflarda kullanılabilir -> String, List, Double...
    2. Kendi oluşturduğumuz sınıflar üzerindede eklenti yapılabilir.
    3. Eklenti yapılan sınıfın orijinal hali değişmez.
    4. Initialization yapamayız. Başlangıç değeri olamaz.
    5. Yerel bir kapsam içinde oluşturamayız.
     */

    var denemeString = "Enes"
    denemeString.eklentim(denemeString)
    println(denemeString.tersCevir())

    var sayi = 5
    println(sayi.faktoriyel())

    val listem = listOf(1,2,3,4,5,6,7,8,9,10)
    println(listem.topla())

    val ahmet = BenimKisi("Ahmet",30)
    println(ahmet.yaslandir())

    val yasliAhmet = ahmet.yaslandir()
    println("${yasliAhmet.isim} artık ${yasliAhmet.yas} yaşında.")

    val isim = "Enes"
    println(isim.boyGoster)

    val metin = "Merhaba Kotlin!"
    println(metin.length)
    println(metin.karakterSayisi)

    val ogrenci = Ogrenci(16)
    println(ogrenci.boy)
}

// Fonksiyonlar ile ve değişken ile 2'ye ayırıp inceleyebiliriz.

// String manipulasyonu

fun String.eklentim(parametre : String){
    println(parametre)
}

// Kendi sınıfımız

// Değişkenler ile devam ediyoryz...

val String.boyGoster : Int
    get() = 182

val String.karakterSayisi : Int
    get() = this.length

class Ogrenci(var yas : Int)

val Ogrenci.boy : Int
    get(){
        return if (yas > 18) 180 else 160
    }












