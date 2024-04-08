
fun main(){

    // Yaygın liste fonksiyonları

    val mevsimList = mutableListOf<String>()
    val ilkbahar = listOf("Mart","Nisan","Mayıs")
    val sonbahar = listOf("Eylül","Ekim","Kasım")
    val yaz = listOf("Haziran","Temmuz","Ağustos")
    val kis = listOf("Aralık","Ocak","Şubat")

    mevsimList.addAll(ilkbahar)
    mevsimList.addAll(sonbahar)
    mevsimList.addAll(yaz)
    mevsimList.addAll(kis)

    println(mevsimList)

    // Set

    mevsimList.set(0,"Yenimart")
    println(mevsimList)

    // Get

    println(mevsimList.get(3))
    println(mevsimList.indexOf("Haziran"))

    // Remove

    mevsimList.removeAt(2)
    println(mevsimList)
    mevsimList.removeAll(sonbahar)
    println(mevsimList)

    // Contains

    println(mevsimList.contains("Ocak"))
    println(mevsimList.containsAll(yaz))

    val sayiList = mutableListOf<Int>()
    val sayilar = listOf(6,7,8,1,2,3,5,4,9,10)
    sayiList.addAll(sayilar)
    println(sayiList)

    //sort

    sayiList.sort()
    println(sayiList)

    // Filter

    val filtreList = sayiList.filter {
        it > 5
    }
    println(filtreList)

    // Map

    val mapList = sayiList.map {
        it*2
    }
    println(mapList)

    val isimler = listOf("Ayşe","Fatma","Ali","Veli")
    val yaslar = listOf(30,25,40,50)

    //Zip fonksiyonu

    val isimYasCifti = isimler.zip(yaslar)
    println(isimYasCifti)

    val mevsimList2 = mutableListOf<List<String>>()

    val ilkbahar2 = listOf("Mart","Nisan","Mayıs")
    val sonbahar2 = listOf("Eylül","Ekim","Kasım")
    val yaz2 = listOf("Haziran","Temmuz","Ağustos")
    val kis2 = listOf("Aralık","Ocak","Şubat")

    mevsimList2.add(ilkbahar2)
    mevsimList2.add(sonbahar2)
    mevsimList2.add(yaz2)
    mevsimList2.add(kis2)

    println(mevsimList2)

    val denemeList = arrayListOf(2,4,6,8)
    val tekSayilar = listOf(1,3,5,7,9)
    denemeList.addAll(tekSayilar)
    println(denemeList)

    denemeList.sort()
    println(denemeList)

    // All
    val allTek = denemeList.all {
        it%2 != 0
    }

    println(allTek)

    // Sublist

    val altList = denemeList.subList(0,4)
    println(altList)
}