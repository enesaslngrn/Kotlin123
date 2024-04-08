
fun main(){

    // With -> Nesneyi, ve ilgili değişken ve methodlarını birlikte kullanabilmeyi mümkün kılar.

    with(Kisi("Enes",27)){

        var hediye = "Atkı"
        this.hediye = "Kazak"
        dogumGunu()
        println("Doğum günün kutlu olsun, işte hediyen: ${this.hediye}, $hediye")
    }
}

class Kisi(var isim : String, var yas : Int){

    var hediye : String? = null
    fun dogumGunu(){
        yas++
        println("$isim merhaba, $yas yaşındasın.")
    }
}
