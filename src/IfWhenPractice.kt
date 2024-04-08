
fun main(){

    // Practice 1

    println("Hangi işlemi yapmak istersiniz? +,-,*,/")
    val aksiyon = when(readLine()) {
        "+" -> "toplama"
        "-" -> "çıkarma"
        "*" -> "çarpma"
        "/" -> "bölme"
        else -> "Geçersiz değer"
    }

    println(aksiyon)


    println("İlk sayıyı girin:")
    val sayi1 = readLine()?.toIntOrNull() ?: 0

    println("İkinci sayıyı girin:")
    val sayi2 = readLine()?.toIntOrNull() ?: 0

    when (aksiyon){
        "toplama" ->{
            if (sayi1+sayi2 > 10){
                println("Toplam 10'dan büyük: ${sayi1+sayi2}")
            }else{
                println("Toplam 10'dan küçük: ${sayi1+sayi2}")
            }
        }
        "çıkarma" ->{
            if (sayi1-sayi2 < 0){
                println("Sonuç negatif: ${sayi1-sayi2}")
            }else{
                println("Sonuç pozitif: ${sayi1-sayi2}")
            }
        }
        "çarpma" ->{
            if (sayi1*sayi2 > 100){
                println("Çarpma sonucu: ${sayi1*sayi2}")
            }else if(sayi1*sayi2 == 100){
                println("Çarpma sonucu tam 100: ${sayi1*sayi2}")
            }else{
                println("Çarpma sonucu: ${sayi1*sayi2}")
            }
        }
        "bölme" ->{
            if (sayi2 != 0){
                println("Sonuç: ${sayi1.toDouble() / sayi2}")
            }else{
                println("Bir sayıyı 0'a bölemezsiniz!")
            }
        }
        else -> "Geçersiz işlem!"
    }

}