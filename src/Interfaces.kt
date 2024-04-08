
fun main(){

    // Arayüzler(Interfaces) -> Bir sınıf ile birlikte kullanıldığında kuvvetlidir.

    /*
    1. ARayüzlerden direkt olarak nesne yaratılamaz.
    2. Arayüzler içerisinde değişkenler initialize edilemez.
    3. Fonksiyonları sadece ismini yazıp body açmadan bırakabiliriz.
    4. Eğer interface herhangi bir sınıfa miras veriyorsa, miras alan sınıf içerideki değişken ve methodları implement etmek zorunda.
    5. Eğer method initialize edildiyse, o zaman bu gereklilik kalkıyor.
    6. Sınıflar birden çok arayüz miras alabilir.
     */

    val user = User()
    println(user.isim)
    println(user.meslek)
    user.bilgiEkle(27)
}

interface Veritabani {

    val isim : String

    fun bilgiGoster()
    fun bilgiGonder() : String

    fun bilgiEkle(yas : Int){
        println("$isim kişisi $yas yaşında.")
    }
}

class User : Veritabani,Veritabani2{
    override val isim = "Enes"

    override fun bilgiGoster() {

    }

    override fun bilgiGonder(): String {
        return "Bilgi gönderiliyor.."
    }

    override fun bilgiEkle(yas: Int) {
        super.bilgiEkle(yas)
    }

    override val meslek: String
        get() = "Yazılımcı"

}

interface Veritabani2{

    val meslek : String
}
