
fun main(){

    val sayiMap = hashMapOf(1 to "bir", 2 to "iki", 3 to "üç", 4 to "dört")

    // Remove

    sayiMap.remove(2)
    println(sayiMap)
    sayiMap.remove(3,"üç")
    println(sayiMap)

    // Contains

    println("Anahtar var mı ? -> ${sayiMap.containsKey(4)}")
    println("Değer var mı ? -> ${sayiMap.containsValue("üç")}")

    // Clear()

    //
    println(sayiMap)

    // Replace
    sayiMap.replace(4,"yeni-dört")
    println(sayiMap)

    //sayiMap.clear()

    val altMap = mapOf(10 to "on", 20 to "yirmi", 30 to "otuz")
    sayiMap.putAll(altMap)
    println(sayiMap)

}