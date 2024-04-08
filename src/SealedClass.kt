
fun main(){
    // Sealed class -> Mühürlü sınıf.

    /*
    1. Sealed class'tan direkt nesne yaratamayız.
    2. Sealed class'lar, kısıtlı bir kalıtım hiyerarşisi oluşturmak için kullanılır.
    Alt sınıflar, sealed class'ın içinde tanımlanır ve bu alt sınıflar, sealed class'ın türünü genişletir.
    Ancak, sealed class'ın dışında başka alt sınıflar tanımlanamaz.

    4. when ile kullanıldığında çok güçlü ve yararlı oluyorlar.
     */

    val sekil = Sekil.Bos
    println("Alan -> ${alanHesapla(sekil)}")

}
// Hepsi aynı dosya altında yazılmalı!
sealed class Sekil {
    object Bos : Sekil() // Object yani basitçe bir singleton.
    data class Dikdortgen(val kisaKenar : Int, val uzunKenar : Int) : Sekil() // Mesela bir data class örneği
    class Cember(val yaricap : Int) : Sekil() // Ve normal class.

    // Sonradan buraya bir tane daha class eklemek istesem:
    //data class Kare(val kenar : Int) : Sekil()
}

/* Böylede yazabiliriz.
sealed class Sekil
object Bos : Sekil()
data class Dikdortgen(val kisaKenar : Int, val uzunKenar : Int) : Sekil()
class Cember(val yaricap : Int) : Sekil()
 */

fun alanHesapla(sekil: Sekil) : Int = when(sekil){
    is Sekil.Bos -> 0
    is Sekil.Dikdortgen -> sekil.kisaKenar * sekil.uzunKenar
    is Sekil.Cember -> 3 * sekil.yaricap * sekil.yaricap // when hatası gitti.

    // Neden sealed kullanmalıyız. Open olsa ne değişecek?

    else -> 0
}

