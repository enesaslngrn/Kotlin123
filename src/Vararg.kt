fun main() {

    // Vararg nedir? -> Variable # of arguments -> Var - arg

    /*
    1. Bir parametrenin 1 den fazla argüman alabilme durumu.
    2. Vararg ile belirtilen bir parametre yalnızca belirtildiği tipte veri alabilir.
     */

    merhaba("Enes")
    merhabalar("Enes","Elif","Mehmet","Ahmet")

    val toplam = toplamaYap(1,2,3,4,5,6,7,8,9,10)
    println(toplam)
}

fun merhaba(isim : String){
    println("Merhaba $isim")
}

fun merhabalar(vararg isimler : String){

    for (isim in isimler){
        println("Merhaba $isim")
    }
}

fun toplamaYap(vararg sayilar : Int) : Int{

    var toplam = 0

    for (sayi in sayilar){
        toplam += sayi
    }

    return toplam
}