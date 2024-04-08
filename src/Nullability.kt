
fun main(){

    // Elvis operatörü (?:)

    var renk : String? = null
    renk = "Mavi"
    println(renk ?: "Kırmızı")

    /*
    println("Sayı giriniz:")

    val sayi = readLine()?.toIntOrNull() ?: 10
    println("Sayı: $sayi")

     */

    val sayi2 : Int? = null

    val islem = sayi2?.plus(10) ?: 10
    println(islem * 2)


    val string = readLine() ?: ""
    println("String: $string")



}



























/*
    var denemeString : String
    denemeString = "Deneme"
    denemeString.length // Not initilialized.


    var string = "Merhaba"
    //string = null

    var nullString : String? = null

    var nullInt : Int?
    nullInt = null
    println(nullInt)

    println(nullInt * 10)


    // Null safe calls

    /*
    /*
    1. -> if-when (null != ==)
    2. -> ? : Nullable. null olabilirde olmayabilir de.
    3. -> !! -> Non - null assertion-> Kesin bir değere sahip. %100 eminin null olmayacağına.
     */
    /*
    println("Lütfen bir sayı giriniz:")
    val input = readLine()

    //val sayi = input.toInt()

     */

    val str : String? = "Merhaba"

    if(!str.isNullOrEmpty()){
        println(str.length)
    }else{
        println("Bu string = null")
    }


    var merhaba : String? = "Merhaba"
    merhaba = null
    println(merhaba?.get(0)) // Null pointer exception.
    var sayi : Int? = null
    sayi = sayi!! + 1
    println(sayi)

     */

 */

// Null operatörleri
/*
    println("Lütfen bir sayı girin:")

    var input = readLine()?.toDoubleOrNull()
    println("Sayı: $input")

    if (input != null){
        println("Sayı * 2 = ${input * 2}")
    }else{
        println("Geçersiz işlem-> lütfen bir sayı girin.")
    }

 */
/*
    val sayi : Int? = null

    //println(sayi!! + 1) Tehlike!

    println(sayi!!.plus(1))
    println(sayi.times(2))

 */
/*
    println("Lütfen bir metin giriniz:")
    val input : String? = readLine()

    if (input.isNullOrBlank()){
       println("Geçersiz işlem.  bir metin giriniz.")
    }else{
        println("Girilen metin $input")
    }

 */