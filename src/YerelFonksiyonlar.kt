
fun main(){

    // Yerel fonksiyonlar (Çok tercih edilmiyor) -> Fonksiyon içinde fonksiyon.
    /*
    1. -> Eğer tepe fonksiyonun içinde başka fonksiyonel bir işlem yapılması gerekliyse, ama o fonksiyonel işleme
    tepe fonksiyon dışından erişilmesi istenmiyorsa kullanılır.
     */

    tepeFonksiyonu()
    //altFonksiyonu()

}

fun tepeFonksiyonu(){
    var x = 5

    fun altFonksiyon() : Int{
        x = 10
        var y = 1

        return y
    }
    // y = 10 Hata!

    val altFonksiyonSonuc = altFonksiyon()
    println(altFonksiyonSonuc)
}

