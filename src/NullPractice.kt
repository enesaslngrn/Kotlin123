
fun main(){

    // Practice 1

    println("Hoş geldiniz! Bugün bir uzay mekiği simülasyonu yapıyoruz. Geminin adını ve oda sayısını belirleyeceğiz")
    println("Geminin adı-> Oda sayısına göre belirlenecek...")

    var odaSayisi : Int? = null

    // Kullanıcı geçerli giriş yapana kadar. Adım 1

    while (odaSayisi == null || odaSayisi <= 0){
        println("Lütfen gemide kaç oda olduğunu belirtin.")
        val input = readLine()
        odaSayisi = input?.toIntOrNull()

        if (odaSayisi == null || odaSayisi <= 0){
            println("Hata! Geçersiz giriş yaptınız. Lütfen oda sayısını doğru girin!")
        }
    }

    // Adım 2

    val gemiIsmi = when (odaSayisi){

        null -> "Bilinmeyen Macera"
        in 1..5 -> "Sessiz Gece"
        in 6..10 -> "Sonsuz Yolculuk"
        in 11..20 -> "Yıldız Gezgini"
        else -> "Galaksi Yutucu"
    }

    // Adım 3
    println("Geminizin adı: $gemiIsmi ve Oda sayısı: $odaSayisi")
    println("Bu gemiye iyi bir isim buldunuz. İyi yolculuklar!")



}