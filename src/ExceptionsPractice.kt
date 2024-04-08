import kotlin.random.Random


fun main() {

    // Practice 1

    println("Hoş geldin! Buradan kurtulmak için doğru kararlar vermen gerek!")

    try {

        var anahtar = false

        while (!anahtar){

            println("Nereye bakmak istersin?\n" +
                    "1. Kutu - 2. Tablo - 3. Masa'nın altı\n" +
                    "Eğer tam sayı değeri girmezseniz sistem sizi yok edecek.")

            val lokasyon = readLine()?.toInt()

            when(lokasyon){
                1-> {
                    println("Tebrikler!, anahtarı buldunuz")
                    anahtar = true
                }
                2,3-> {
                    println("Burası boş!")
                }
                else -> {
                    println("Geçersiz bir seçim yaptınız.")
                }
            }
        }

        println("Harika! Fakat kapıda aynı zamanda şifre var.")
        val sifre = Random.nextInt(1000,9999)
        println("Kapının şifresi : $sifre")

        var hak = 3

        while (hak > 0){
            println("Şifreyi girmek için $hak hakkınız var...\n" +
                    "Eğer yanlış bir tuşa basarsanız sistem sizi yok edecek!")

            val tahmin = readLine()?.toInt()

            if (tahmin == sifre){
                println("Doğru şifreyi girdiniz! Kapı açıldı")
                break
            }else if(hak > 1){
                println("Yanlış şifre! ${hak - 1} hakkınız kaldı.")
            }else{
                throw Exception("Haklarınız bitti! Yanlış şifre girdiniz.")
            }
            hak--
        }

        println("Tebrikler, Kaçış odasından başarıyla kaçtın!")



    }catch (e : Exception){
        e.printStackTrace()
        println("Sistem sizi yok etti!: ${e.localizedMessage}")
    }finally {
        println("Oyun bitti!")
    }
}
