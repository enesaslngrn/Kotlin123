
fun main(){

    // When -> Koşul fazla ise when, 1 ve 2 tane ise if kullanıyoruz.

    /*
    println("Hangi hayvanı beslemek istersiniz?")

    val hayvan = readLine()

    when (hayvan){

        "kedi" -> {
            println("Kedi besleniyor..")
            println("Kedi besleniyor..")
        }

        "köpek" -> {
            println("Köpek besleniyor...")
        }

        else -> {
            println("Hayvan yok.")
        }
    }

    var ses : String? = null

    when(hayvan) {
        "kedi" -> {
            ses = "miyav"
        }
        "köpek" -> {
            ses = "havhav"
        }
        "kuş" -> {
            ses = "cikcik"
        }
    }

    println("$hayvan isimli hayvanın çıakrdığı ses -> $ses")


     */
/*
    println("Kaçıncı aydansınız?")

    val ay = readLine()?.toIntOrNull()

    println(ay)

    when(ay){

        1 -> {
            println("Ocak")
        }
        2-> {
            println("şubat")
        }
        3-> println("mart")

        else -> println("Ay bulunamadı..")

    }

 */

    println("işlem yapılacak ilk sayı:")
    val sayi1 = readLine()?.toIntOrNull() ?: 0

    println("işlem yapılacak ikinci sayı:")
    val sayi2 = readLine()?.toIntOrNull() ?: 0

    println("Hangi işlemi yapmak isternsiniz? (+,-,*,/)")
    val islem = readLine()

    when(islem){
        "+" -> println("$sayi1 + $sayi2 = ${sayi1 + sayi2}")
        "/" -> {
            if (sayi2 != 0){
                println("$sayi1 / $sayi2 = ${sayi1.toDouble() / sayi2}")
            }else{
                println("Bir sayıyı 0'a bölemezsiniz!")
            }
        }


    }

}