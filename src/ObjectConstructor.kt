fun main() {

    /*
    "Object"
    Instance oluşturmadan, direkt olarak object içindeki veriye erişebiliyoruz.

    Singleton -> Bir sınıftan yalnızca bir instance oluşturabilmek.

    Object -> Javada static
     */

    Arabalar().arabaRenk = "Sarı" // Kendi başına bi işe yaramaz.
    println(Arabalar().arabaRenk) // Nesne oluşturmadan değişim yapamıyorum. Daha doğrusu yapıyorum ama bir nesneye atamadığım için bir anlamı olmuyor.

    val araba = Arabalar() // önce nesne oluşturup ardından devam etmem gerek
    araba.arabaRenk = "Yeşil"
    println(araba.arabaRenk)   // her nesne kendi property'sine sahip.
    val araba2 = Arabalar()
    println(araba2.arabaRenk) // Bunun için geçerli değil. Hala Kırmızı
    araba2.arabaRenk = "Mor"
    println(araba2.arabaRenk) // Artık burası içinde değişti.




    // MyObject() -> Hata, çünkü objectler içine parametre alamaz. paranteze gerek yok.

    println(MyObject.sayi1)
    println(MyObject.sayi2)

    MyObject.carpim(2,3)

    MyObject.sayi1 = 100
    println(MyObject.sayi1)

    baskaFonksiyon()

}

object MyObject{

    var sayi1 : Int = 5
    var sayi2 : Int = 10

    fun carpim(x : Int, y : Int) = x * y

}

class Arabalar{
    var arabaRenk = "Kırmızı"
}

fun baskaFonksiyon(){
    println("Baska fonksiyonda görülen sayi: ${MyObject.sayi1}")
}


