import kotlin.random.Random


lateinit var merhaba : String
fun main(){

  // Lateinit ve Lazy

    /*
    Lateinit -> Bir değişkeni sonradan initialize etmeye yarar.
    Late -> Daha sonra, init-> başlatmak
    *** Initialize edilmesi kesinlikle zorunlu! -> Exception
    Sadece var anahtar kelimesi ile oluştururlar.
     */

    /*
    Lazy -> Yalnızca gerektiğinde init etmeye yarar.
    Temel amacı-> Hafıza yönetimi, tüketimini azaltmak.
     */


    val lazyDegisken : String by lazy {
        "Gerektiğinde initialize edildim..."
    }

    val x = Random.nextInt(10)
    println(x)
    if (x > 5){
        println(lazyDegisken)
    }

    val downloadManager by lazy {
        indirmeFonksiyonu()
    }

    val butonClicked = true

    if (butonClicked){
        println(downloadManager)
    }
}

fun indirmeFonksiyonu() : List<String>{
    val indirilenler = mutableListOf<String>()
    println("Direkt indirme yapmak istemiyoruz....")

    indirilenler.add("1")
    indirilenler.add("2")
    return indirilenler
}



