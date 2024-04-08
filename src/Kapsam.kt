
fun main(){

    // Kapsam(Scope)

    /*
    1. Erişilebilirlik, görünürlük durumu
    2. Bir fonksiyon içerisinde tanımlanan bir değişken veya nesneye yalnızca
    o fonksiyon içerisinden erişilebilir. Tabi bu default olarak böyle.
    3. Fonksiyon çalışır, değişken üretilir, fonksiyon içinde kullanılır, ve ardından yok edilir.
    4. Object oriented programming (OOP)
     */

    var deneme = 5
    deneme = 10

    if (deneme > 5){
        var x = 10
    }
    // x = 20 Hata!

    for (i in 1..5){
        var sayi = 0
        sayi += i
    }

    // println(sayi) Hata!


    var donenSayi = denemeFonksiyon()
    println(donenSayi)

}

fun denemeFonksiyon() : Int{

    // deneme = Hata!

    var deneme = 5 // Burada da deneme diye bir değişken yaratabilirim.

    var sayi = 10

    var isim = "Enes"
    baskaFonksiyon(isim)

    return sayi
}

fun baskaFonksiyon(isim : String){
    // isim Hata!

    println(isim)
}



