
var sayi : Int? = null
fun main(){

    // Let

    val hayvanlar = listOf("kedi","köpek","aslan","kaplan","at")

    val x = hayvanlar.map { it.length } // Değişkene atamak gerekti.
        .filter { it > 4 }
        .let {listem ->
            println(listem)
            println(listem.size)
            listem
        }

    // Daha önemli kullanım: Null olmayan değerleri filtreleyebilmek.

    if (sayi != null){ // check edildi, null değil, Hataya sebep verebilir. Çünkü global bir değişken üzerinde işlem yapmaya çalışıyoruö.
        val sayi2 = sayi!! * 5
    }

    sayi?.let {
        val sayi2 = it * 5
        sayi2
    }

    val isim = readLine()

    isim?.let {

    }
}