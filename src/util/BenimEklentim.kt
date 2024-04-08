package util

fun String.tersCevir() : String{ // Utility
    return this.reversed()
}

// Int manipulasyonu

fun Int.faktoriyel() : Long{
    if (this < 1)
        return 1

    var sonuc : Long = 1

    for (i in 2..this){
        sonuc *= i
    }
    return sonuc
}

// Liste manipulasyonu

fun List<Int>.topla() : Int{
    var toplam = 0

    for (i in this){
        toplam += i
    }
    return toplam
}

class BenimKisi(val isim : String, val yas : Int)

fun BenimKisi.yaslandir() : BenimKisi{
    return BenimKisi(this.isim,this.yas +1)
}