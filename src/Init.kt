
fun main(){

    // init -> initialization (Başlatmak) -> Eğer bir sınıfın içinde bu blok varsa, önce burası çalıştırılır.

    val mesaj = Mesaj()

    val insan1 = Insan("Enes", 27)
    insan1.kimsin("Ahmet", 25)
}

class Mesaj{

    var mesaj = "Mesaj"

    init {
        println("Sana bir mesaj var : $mesaj")
    }
}

class Insan(var isim : String, var yas : Int){

    init {
        kimsin(isim,yas)
    }

    fun kimsin(yeniIsim: String, yeniYas: Int) {
        this.isim = yeniIsim
        this.yas = yeniYas

        println("$isim | $yas")
    }
}


