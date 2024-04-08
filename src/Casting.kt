
fun main(){

    // Casting (as) -> Bir tipteki değişkeni farklı bir tipe dönüştürebilmek. Any ile kullanışlı

    // is -> İlgili değişken ilgili tipte mi kontrol eder.

    val sayi : Int = 5

    if (sayi is Int){
        println("Sayı int: $sayi")
    }

    // as -> Safe casting -> toInt, toString
    // ClassCastException

    val mixedList : List<Any> = listOf("Merhaba",10,true)

    val anyDegisken = mixedList[0] // Şu anda tipi any
    val strDegisken = mixedList[0] as String

    val intDegisken = mixedList[1] as Int
    intDegisken * 5

    val castingSonuc = casting("bir")
    //val donusum = castingSonuc as Int
    val donusum = if (castingSonuc is Int) castingSonuc else "Değer int değil! Dönüşüm yapılamaz"
    println(donusum)

}

fun casting(deger : String) : Any{
    return when(deger){
        "bir" -> 1
        "iki" -> "iki"
        "üç" -> 3.0
        "4" -> true
        else -> false
    }
}
