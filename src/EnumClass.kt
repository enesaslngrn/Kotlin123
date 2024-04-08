
fun main(){

    // Enum class -> Enumeration (Sayım, Sıralama)


    /*
    1. Önceden tanımlanmış saibt değerlerin bir koleksiyonunu temsil eder.
    2. data class gibi constructor içinde property belirtilmeli -> val var
     */

    val gun = HaftaGunu.PAZARTESI
    hangiGun(gun)
    println(gun.gunSirasi)

    println(HaftaGunu.SALI.name)
    println(HaftaGunu.PAZAR.ordinal)
}

enum class HaftaGunu(val gunSirasi : Int){
    PAZARTESI(1),SALI(2),CARSAMBA(3),PAZAR(7),

    /*
    initialize edebiliriz -> YAni değerlernini başlangıç noktasında belirleyebiliriz

    1. name()-> Hangi sabit olduğuun bize gösterir.
    2. ordinal() -> Bulunduğu sırayı gösterir (index-> 0'dan başlar)
     */
}

fun hangiGun(gun : HaftaGunu){
    when(gun){
        HaftaGunu.PAZAR -> println("Pazar günü")
        HaftaGunu.PAZARTESI -> println("Pazartesi günü")
        HaftaGunu.SALI -> println("Salı günü")
        else -> println("Böyle bir gün yok")
    }
}


