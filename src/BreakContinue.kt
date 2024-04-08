

fun main(){

    // Break ve Continue
/*


    for (i in tekSayiListesi){
        if (i % 2 == 0){
            break // İstenilmeyen koşul olursa. Programı sonlandır.
        }
        println("Sayı: $i")
    }

 */
    var tekSayiListesi = listOf(1,3,5,6,7,9)
    for (i in tekSayiListesi){
        if (i % 2 == 0){
            println("Sayı çift: $i")
            continue // Tek bir değer için döngüyü durdurmaz. İstediğimiz aksiyonu gerçekleştirip devam eder.
        }
        println("Sayı: $i")
    }

    val erkekIsimler = mutableListOf<String>()

    for (i in 1..4){
        println("Bir erkek ismi giriniz:")
        val isim = readLine()?: ""
        if (isim == "ayşe"){
            println("Kadın ismi girdiniz!")
            break
        }
        erkekIsimler.add(isim)
        println("İsim: $isim")
    }



}