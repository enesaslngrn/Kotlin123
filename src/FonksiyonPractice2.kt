fun main() {

    // Practice 2

    // Adım 1

    val sayilar = listOf(-7,-5,-3,-2,-1,2,3,5,7,11,14,16,18,20,22)

    // Adım 2

    val pozitifSayilar = sayilar.filter { it > 0 }
    println(pozitifSayilar)

    // Adım 3

    val asalSayilar = pozitifSayilar.filter { sayi ->

        var asalMi = true
        if (sayi == 1){
            asalMi = false
        }else{
            for (i in 2 until sayi){

                if (sayi % i == 0){
                    asalMi = false
                    break
                }
            }
        }
        asalMi
    }

    println(asalSayilar)

    // Adım 4

    val siraliSayilar = asalSayilar.sortedBy { it }
    println(siraliSayilar)

    // Adım 5

    val maxSayi = asalSayilar.maxBy { it }
    println("En büyük sayı: $maxSayi")

    // Adım 6

    // Transform -> Map

    val doubleListe = asalSayilar.map { sayi -> sayi.toDouble() }
    println(doubleListe)

}