
fun main(){


   // Yüksek mertebe fonksiyonlar (Higher order functions)

    /*
    -> Bir başka fonksiyonu içerisine parametre olarak alabilen fonksiyonlar.
     */

    val isimler = listOf("Ahmet","Mehmet","Ali")

    val lambdaFonksiyon = {isim : String -> println("Selam $isim")} // Unit -> Bu fonksiyon bir değer döndürmüyor.
    selamVer(isimler,lambdaFonksiyon)

    val lambdaFonksiyon2 = {isim : String -> "$isim selamınızı aldı!"}
    selamAl(isimler,lambdaFonksiyon2)
}

fun selamVer(isimler : List<String>, parametreFonksiyon : (String) -> Unit){

    for (isim in isimler){
        parametreFonksiyon(isim)
    }
}

fun selamAl(isimler : List<String>, parametreFonksiyon : (String) -> String){

    for (isim in isimler){
        val selamMesaji = parametreFonksiyon(isim)
        println(selamMesaji)
    }
}






