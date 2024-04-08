
fun main(){

    // Map hashmap

    val urun = mutableListOf("Kitap","Defter","Kalem","Boya")
    val fiyat = listOf(10,20,30,40)

    var index = 0

    urun.forEach {
        println("$it fiyatı= ${fiyat[index]}")
        index += 1
    }

    // Zip fonksiyonu

    val kirtasiye = urun.zip(fiyat)
    println(kirtasiye)

    //Key-value Yani Anahtar-değer ilişkisi

    /*
    val kirtasiyeMap = mapOf<String,Int>("Kitap" to 10, "Defter" to 20,"Kalem" to 30, "Boya" to 40)
    println(kirtasiyeMap)

     */

    // Map -> immutable , hashmap ->mutable


    val kirtasiyeMap = hashMapOf<String,Int>()
    kirtasiyeMap.put("Kalem",10) // ADD ile değil PUT ile ekleme yapılıyor.
    kirtasiyeMap.put("Defter", 20)
    kirtasiyeMap.put("Kitap",30)
    kirtasiyeMap.put("Boya",40)
    println(kirtasiyeMap)

    println(kirtasiyeMap.keys)
    println(kirtasiyeMap.values)
    println(kirtasiyeMap.get("Kalem"))

    val sayiMap = hashMapOf(1 to "bir",2 to "iki", 3 to "üç")
    println("Sayı: ${sayiMap[1]}")

    println(sayiMap.keys)
    println(sayiMap.values)


}