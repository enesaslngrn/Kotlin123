
fun main(){

    // Override methodu ve super anahtar kelimesi.

    val aslan = Aslan()
    aslan.kediOzellik()

    val cita = Cita()
    cita.kediOzellik()

    println(cita.hiz)
}


open class Kedigiller{

    open val hayvan : String? = null
    open val hiz : Int? = null
    open val renk : String? = null
    val boy = 1

    open fun kediOzellik(){
        println("Kedigillerden geliyorum yani üst sınıftan, $renk renkteki, $hayvan, $hiz hızında ve $boy boyunda...")
    }
}

class Aslan : Kedigiller(){

    override val hayvan = "Aslan" // Override etmek-> Üzerine yazmak, değiştirerek kullanmak.
    override val hiz = 100
    override val renk = "Turuncu"

    override fun kediOzellik() {
        super.kediOzellik()
        println("Aslandan geliyorum yani alt sınıftan, ${super.renk} renkteki, ${super.hayvan}, ${super.hiz} hızında ve $boy boyunda...")

        // Super anahtar kelimesi -> Miras alınan sınıftaki değişken ve method değerlerine referans verir.
    }
}

class Cita : Kedigiller(){

    override val hayvan = "Çita"
    override val hiz = 300
    override val renk = "Sarı-Siyah"

    override fun kediOzellik() {
        super.kediOzellik()
        println("Çitadan geliyorum yani alt sınıftan, $renk renkteki, $hayvan, $hiz hızında ve $boy boyunda...")

        // Super anahtar kelimesi -> Miras alınan sınıftaki değişken ve method değerlerine referans verir.
    }
}

