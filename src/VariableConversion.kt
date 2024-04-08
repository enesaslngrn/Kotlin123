
fun main(){

    // Değişken tip dönüşmleri

    val intSayi = 5
    println(intSayi.toDouble()::class.java)

    val longSayi = 1000L
    val intSayi2 = longSayi.toInt()
    println(intSayi2::class.java)


    val denemeString = "5"

    val stringToInt = denemeString.toInt()
    println(stringToInt::class.java)

    println(stringToInt * 2)

    println(stringToInt.toDouble())

    val denemeString2 = "3"
    println(denemeString2.toDouble())

    val denemeBoolean = true
    println(denemeBoolean.toString()::class.java)


}