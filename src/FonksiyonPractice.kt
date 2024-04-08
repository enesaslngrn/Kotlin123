fun main(){
    // Practice 1

    println("Kahramanın adını girin:")
    val kahramanAdi = readlnOrNull() ?: "Batman"
    val yolArkadasi = gorevBildirimi(kahramanAdi)

    val kazanilanPuan = tapinakKesfi(kahramanAdi, yolArkadasi)
    println("Toplam kazanılan puan: $kazanilanPuan")

}

fun gorevBildirimi(kahramanAdi : String) : String{
    println("Merhaba $kahramanAdi! Görevin, eski bir tapınaktaki Bilgi Kristalini bulmak.")
    println("Yol arkadaşını belirle:")
    val yolArkadasi = readlnOrNull() ?: "Robin"
    println("$kahramanAdi ve $yolArkadasi göreve başlıyor...")

    return yolArkadasi
}

fun tapinakKesfi(kahramanAdi: String, yolArkadasi : String) : Int{
    println("$kahramanAdi ve $yolArkadasi tapınağa giriş yaptı...")
    val dusmanSayisi = 5
    println("İçeride $dusmanSayisi düşman ile karşılaşıldı.")
    val kazanilanPuan = saldirVeKazan(dusmanSayisi)
    return kazanilanPuan
}

fun saldirVeKazan(dusmanSayisi : Int) : Int{

    var puan = 0
    var mevcutDusman = dusmanSayisi

    while (mevcutDusman > 0){
        val dusmanGucu = (1..20).random()
        val kahramanGucu = (1..10).random()
        val yolArkadasiGucu = (1..10).random()

        println("$dusmanGucu,$kahramanGucu,$yolArkadasiGucu")

        if (kahramanGucu + yolArkadasiGucu > dusmanGucu){
            println("Düsmanı yendiniz ve 10 puan kazandınız")
            puan += 10
            mevcutDusman--
        }else{
            println("Düşmana hasar verdiniz ama henüz ölmedi!")
        }
    }

    if (mevcutDusman == 0){
        println("Tebrikler! Düşmanları yendiniz ve Bilgi Kristalini elde ettiniz!")
    }
    return puan
}