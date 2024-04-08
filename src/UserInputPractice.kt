
fun main(){

    // Practice 1
    println("Lütfen adınızı giriniz:")
    val ad = readLine()
    println("Lütfen soyadınızı giriniz:")
    val soyad = readLine()
    println("Merhaba ben %s %s ve Kotlin ile programlama öğreniyorum!".format(ad,soyad))
    println("Merhaba ben ${ad + " " + soyad} ve Kotlin ile programlama öğreniyorum!")

    // Practice 2
    println("Doğum yılınızı giriniz:")
    val dogum = readLine()
    val yas = 2024 - dogum!!.toInt()
    println("Doğum yılınız $dogum ve $yas yaşındasınız!")

}