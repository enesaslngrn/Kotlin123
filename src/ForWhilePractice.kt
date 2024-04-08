
fun main() {

    // Practice 2

    val urunler = mutableMapOf(
        "Elma" to 2,
        "Muz" to 3,
        "Ekmek" to 1,
        "Süt" to 5,
        "Peynir" to 4
    )

    // Kullanıcı girdisi
    println("Market alışverişi için ne kadar paranız var?:")
    var para = readLine()?.toIntOrNull() ?: 0

    if (para > 100){
        println("Vay canına, bu ne zenginlik!")
    }else{
        println("Hoş geldiniz, çok paranız yok ama olsun...")
    }

    // Alışveriş yapma döngüsü
    while (para > 0){
        println("Ürünler:")
        urunler.forEach { (urun,fiyat) ->
            println("$urun - ${fiyat} Tl")
        }
        println("Almak istediğiniz ürünü girin veya çıkmak için 'q' ya basın: ")
        val secim = readLine() ?: ""

        if (secim == "q"){
            println("Kalan bakiyeniz: $para")
            break
        }

        val urunFiyat = urunler[secim]
        if (urunFiyat == null){
            println("Geçersiz ürün. Lütfen tekrar deneyin!")
            continue
        }

        if (para >= urunFiyat){
            println("$secim satın alındı. ${urunFiyat}TL")
            para -= urunFiyat
            println("Kalan paranız: $para TL")
        }else{
            println("Paranız yetersiz. Daha ucuz bir ürün seçin.")
        }
    }

    println("Teşekkür ederiz. Yine bekleriz!")

}
