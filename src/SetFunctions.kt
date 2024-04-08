
fun main(){

    // Set fonksiyonları

    /*
    Set ve liste diğer fark -> Listelerde sıralama önemliyken, set'te sıralama önem arz etmez.
     */
/*
    val sayilarList = listOf(1,2,3,4,5,6,7,8,9,10)
    var toplam = 0
    println("Toplam: $toplam")

    // ForEach
    /*
    sayilarList.forEach {
        println("Sayı: $it")
    }

     */

    sayilarList.forEach {
        toplam += it
        println("Toplam: $toplam")
    }
    println("Son Toplam: $toplam")

 */

    val sayilarHashSet = hashSetOf(10,20,30,40,50,60)
    var toplam = 0
    println("Toplam: $toplam")

    sayilarHashSet.forEach {
        println("Sayı: $it")
    }

    sayilarHashSet.forEach {
        toplam += it
        println("Toplam: $toplam")
    }

    val meyveler = listOf("elma","armut","portakal","üzüm")

    meyveler.forEach {
        println("'$it' kelimesinin uzunluğu ${it.length}")
    }

}
