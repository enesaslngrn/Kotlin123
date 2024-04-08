import kotlin.random.Random


fun main() {

    // TakeIf ve TakeUnless -> Take(Almak),
    // Takeif -> Eğer öyle ise true dön ve ilgili aksiyonu al
    // Take unless  -> Öyle olmadığı durumda false dön, ve ilgili aksiyonu al.
    // **** null dönüşü yaparlar.

    // Takeif

    val kisi1 = Kisiler("Ali",25)

    val sonucIf = kisi1.takeIf { it.yas > 26 && it.isim.startsWith("A") } // True olduğu için aksiyon alındı.
    println("Takeif sonucu: $sonucIf")

    // Takeunless

    val kisi2 = Kisiler("Elif",30)

    val sonucUnless = kisi2.takeUnless { it.yas > 18 || it.isim.length > 5 } // False dönecek -> aksiyon alındı
    println("Take unless sonucu: $sonucUnless")

    for (i in 1..10){
        val sayi = Random.nextInt(50)

        val egerCiftIse = sayi.takeIf { it % 2 == 0 }
        val egerCiftDegilse = sayi.takeUnless { it % 2 == 0 } // true ise yani çift ise null dönücek
        println("Sayı: $sayi")
        println("Sayı çift mi null mı? : $egerCiftIse")
        println("Sayı tek mi null mı? : $egerCiftDegilse")
    }

}

data class Kisiler(val isim : String, val yas : Int)




