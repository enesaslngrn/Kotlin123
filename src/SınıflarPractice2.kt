
fun main(){

    // Practice 2

    val pitStop = PitStop(5)

    pitStop.tekerlekDegisimi(4,3)

    println("Toplam pit stop süresi: ${pitStop.toplamSure} saniye")
}

class PitStop(private var ekipSayisi : Int){

    var toplamSure = 0

    var sure : Int = 0
        get() = field
        set(value) {
            toplamSure += value
        }

    init {
        ihtiyaclar()
        tekerlekDegisimi(4,ekipSayisi)
        benzinDegisimi(30)
    }

    fun tekerlekDegisimi(tekerlerSayisi : Int, ekipSayisi: Int) {
       println("$tekerlerSayisi adet ve tekerlek değişimi yapılıyor...")

        sure = if (ekipSayisi > 4){ // This bir üst seviyedeki parametreye referans veriridi.
            println("Ekip sayısı: ${this.ekipSayisi}")
            3 * tekerlerSayisi
        }else {
            4 * tekerlerSayisi
        }
    }

    private fun benzinDegisimi(benzinSeviyesi : Int) {
        println("Benzim dolumu yapılıyor... Benzin seviyesi: $benzinSeviyesi")

        if (benzinSeviyesi > 50){
            sure += 20
        }else{
            sure += 30
        }
    }

    private fun ihtiyaclar() {
        println("Pit stop ekibi hazır, ihtiyaçlar belirleniyor.. Ekip sayısı $ekipSayisi")
    }

}