fun main(){

    // in anahtar kelimesi

    val sayi = 5
    var sonuc : String? = null

    when(sayi){

        in 1..5 ->{
            sonuc = "sayı 1 ile 5 arasında"
        }
        in 6..10->{
            sonuc = "sayı 6 ile 10 aralığında"
        }
        else ->{
            sonuc = "1-10 arasında değil"
        }
    }
    println(sonuc)

    val isimListesi = mutableListOf("Ahmet","Mehmet","Ali")

    for (item in isimListesi){
        println(item)
    }

    for (item in 1..5){
        println(item*2)
    }

}