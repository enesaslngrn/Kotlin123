
const val URL_NAME = "www.google.com"

fun main() {
    println("Merhaba Kotlin")
    println("Merhaba")

    deneme()

    //Değişkenler(Variables)
    println(10*5)
    var x = 5
    var y = 2

    println(x+y)

    var sayi = 4
    println(sayi*2)
    println(sayi*3)
    println(sayi+10)

    sayi = 5

    println(sayi*2)
    println(sayi/5)

    // underscore ve camelCase
    var deneme_kotlin = 5
    var denemeKotlin = 5

   /*
   VAR-> mutable yani değiştirilebilir
   val-> im-mutable yani değiştirilemez
    */

    val sabit = 5

    println(sabit*sayi)

    val yeniSabit = sabit + 5
    println(yeniSabit)

    //Constant-> const

    println(URL_NAME)

}

fun deneme(){
    println(URL_NAME)
    println("Deneme fonksiyonundan geldim")

}

