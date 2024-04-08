
fun main(){

    // Lambda fonksiyonlar

    /*
    Normal vs Lambda

    1. Lambda fonksiyonları isimsizdir.
    2. Lambda fonksiyonlar bir değişkene atanabilir.

    En temel kullanım nedeni ->
     */

    lambdaFonksiyon("İsimsiz")
}

fun normalFonksiyon(parametre : String){
    println("Normal Yöntem")
}

val lambdaFonksiyon = {parametre : String -> println("Lambda yöntemi $parametre") }




