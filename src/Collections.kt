
fun main(){

    // Koleksiyonlar

    val dersListesi = listOf("Matematik","Fizik","Kimya")
    println(dersListesi)

    // Generic nedir?

    //val dersListesi2 = listOf<String>("Matematik","Fizik","Kimya",5,true,5.0f)

    val dersListesi3 = listOf<Any>("Matematik","Fizik","Kimya",5,true,5.0f)
    println(dersListesi3)
    
    println(dersListesi3[0])
    println(dersListesi3.get(0))
    println(dersListesi3.size)

    val dersListesi4 = listOf<Int>()
    println(dersListesi4)

    //dersListesi4.addFirst(1) // read-only collection

    //mutablelistof

    val denemeMutableList = mutableListOf<Int>()

    denemeMutableList.add(0,10)
    denemeMutableList.add(1,20)
    println(denemeMutableList)

    denemeMutableList[0] = 100

    println(denemeMutableList)

    //denemeMutableList.add(2,"Enes")

    // Array ve ArrayList (Diziler)

    /*
    Dizilerle listelerin farkı

    1-> Arrayler mutabledır. Fakat listelerde immutable seçeneği var.
    2-> Arraylerin boyuyu sabit. Arrayler daha iyi performans, listeler daha esnek.

     */

    val denemeArray = arrayOf("Enes","Elif","Mehmet")
    println(denemeArray::class.java)

    println(denemeArray[0])
    denemeArray[0] = "Emir"
    println(denemeArray[0])

    println(denemeArray)

    println(denemeArray[2])

    //denemeArray.add veya denemeArray.remove

    val denemeArray2 = arrayOf<Int>()
    //denemeArray2[0] = 1 Hata! -> içeride veri yok bound hatası.

    // ArrayList

    val renkler = arrayListOf<String>("mavi","yeşil","sarı")
    println(renkler)

    renkler.add(3,"kırmızı")
    println(renkler)
    println(renkler.size)

}
