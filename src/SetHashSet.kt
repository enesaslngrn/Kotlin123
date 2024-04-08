

fun main(){

    // Set ve HashSet

    /*
    Liste ve Array'den farkı -> Set ve HashSet : Her element unique, yani 2 adet bulunamaz.
     */

    // Set

    val denemeArray = arrayOf(1,2,3,3,4,4,5)
    println(denemeArray[2])
    println(denemeArray[3])
    println(denemeArray.size)

    val denemeSet = setOf(1,2,3,3,4,4,5)
    println(denemeSet)
    println(denemeSet.size)

    //denemeSet.add veya denemeSet.remove Hata!

    // Set ve HashSet fark! -> Set: Immutable, HashSet: Mutable

    // HashSet

    val sayilar = hashSetOf<Int>()
    sayilar.addAll(setOf(1,3,5,5,7,9,9))
    println(sayilar)

    val isimler = hashSetOf<String>()
    val isimSet = setOf("Ahmet","Mehmet","Murat","Murat")
    isimler.addAll(isimSet)
    println(isimler)
    println(isimler.size)


}