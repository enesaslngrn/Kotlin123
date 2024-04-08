

fun main(){

    // Run -> Belirtilen nesne üzerinden işlem bloğu oluşturur.

    val user = MyUser("Ahmet",30)

    val ahmet = user.run { // Nesne parametresi -> this

        println("İsim: ${this.isim}")
        println("Yaş: $yas")
        dogumGunu()

        yas + 10 // Run fonksiyonu işlem bloğunun en son satırını döndürür.
    }

    println("Ahmet 10 yıl sonra $ahmet yaşında olacak")


}

class MyUser(var isim : String, var yas : Int){

    fun dogumGunu(){
        yas++
        println("$isim merhaba, $yas yaşındasın.")
    }
}