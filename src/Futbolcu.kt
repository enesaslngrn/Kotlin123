

open class Futbolcu(isim:String, yas:Int, var pozisyon:String) {

    var yeniIsim : String? = isim
        get() = field

    var yeniYas : Int? = yas
        get() = field
        private set

    fun hangiPozisyon(){
        println("${yeniIsim} oyuncusu ${this.pozisyon} ' da oynuyor.")
    }
}