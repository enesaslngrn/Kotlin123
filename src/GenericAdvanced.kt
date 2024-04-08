
fun main(){

    //Manuel Generic -> Nesne üretirken tip belirleme.

    // T : type (Belirsiz, sonradan belirnecek.)

    /*
    val stringNesne = GenericDeneme<String>()
    stringNesne.denemeFonksiyon("Enes")

     */

    val intNesne = GenericDeneme<Int>()
    intNesne.denemeFonksiyon(5)
    //println(intNesne.sayiGoster(10))

    val cokluNesne = CokluGeneric<Int,Double,Long>()
    cokluNesne.cokluGenericFonksiyon(1,1.0)

}

class GenericDeneme<T>{

    fun denemeFonksiyon(parametre : T){
        println("Merhaba : $parametre")
    }
/*
    fun sayiGoster(sayi : T) : Int{
        return sayi
    }

 */
}

class CokluGeneric<T,Y,U>{
    fun cokluGenericFonksiyon(parametre1 : T, parametre2: Y){
        println("İlk parametre : $parametre1 | İkinci parametre : $parametre2")
    }

    val deneme : U
        get() {
            TODO()
        }
}


