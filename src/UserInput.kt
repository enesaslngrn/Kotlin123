
fun main(){
/*
    // Kullanıcı Girdisi Alma

    println("Kullanıcı adınızı girin!")
    var kullaniciGirdisi = readLine()
    println("Girilen veri: $kullaniciGirdisi")

    kullaniciGirdisi += " Merhaba"
    println(kullaniciGirdisi)

 */

    println("----------------Lütfen bir sayı girin--------------")
    var sayiGirdisi = readLine()
    println("Girilen sayı: $sayiGirdisi")

    println(sayiGirdisi!!::class.java)

    var donusenSayi = sayiGirdisi.toDouble()
    println("Alınan sayı değeri: ${donusenSayi}")
    println(donusenSayi::class.java)

    donusenSayi *= 2
    println(donusenSayi.toLong() / 5)


}