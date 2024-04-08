
fun main() {

    // Objects -> Nesneler -> Nesne yönelimli programlama

    val kullanici1 = Kullanici()
    val kullanici2 = Kullanici()

    kullanici1.kullaniciAdi = "Enes"
    kullanici2.kullaniciAdi = "Mehmet"

    var sayi = 5

    denemeSinif()

    arabaBul()

}

fun denemeSinif(){

    val baskaKullanici = Kullanici()
    baskaKullanici.kullaniciAdi = "Ali"
    println(baskaKullanici.kullaniciAdi)

    val yeniIsim = baskaKullanici.kullaniciAdiDegistir("Ahmet")
    println(yeniIsim)
}

class Kullanici{

    var kullaniciAdi : String? = null

    fun kullaniciAdiDegistir(isim : String) : String{

        return isim
    }
}

class Araba{

    var model = "Audi"

    fun araba(){
        model = "BMW"
        println("Yeni araba modeli $model")
    }
}

fun arabaBul(){

    val benimArabam = Araba()
    val yeniAraba = Araba()

    benimArabam.model = "Artık Audi değil! BMW olacak"
    println(benimArabam.model)

    yeniAraba.araba()
}

