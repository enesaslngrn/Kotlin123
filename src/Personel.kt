

class Personel(yeniIsim: String, yeniYas: Int, yeniMaas: Double, yeniDepartman: String) {

    var isim : String? = yeniIsim
    var yas : Int? = yeniYas
    var maas : Double? = yeniMaas
    var departman : String? = yeniDepartman

    fun personeliGoster(){
        println("$isim |$yas |$maas | $departman")
    }
}