
fun main(){

 // Practice 1

    val manager = Manager()
    var i = 0
    while (i < 3){
        println("Lütfen personel bilgilerini giriniz:")
        println("isim:")
        val isim = readLine() ?: ""
        println("yaş:")
        val yas = readLine()?.toIntOrNull() ?: 0
        println("maaş:")
        val maas = readLine()?.toDoubleOrNull() ?: 0.0
        println("departman:")
        val departman = readLine() ?: ""

        val personel = Personel(isim,yas,maas,departman)
        manager.calisanEkle(personel)

        i++
    }

    val personel1 = Personel("Elif",30,12000.0,"Psikoloji")
    val personel2 = Personel("Ahmet", 25,10000.0,"Fizik")
    val personel3 = Personel("Mehmet",20,20000.0,"İnsan Kaynakları")

    manager.calisanEkle(personel1)
    manager.calisanEkle(personel2)
    manager.calisanEkle(personel3)

    println("Girilen personel bilgileri:")
    manager.calisanlariGoster()

    manager.calisanlariYonet()

    println("Maaşlar arttı!")
    manager.calisanlariGoster()


}