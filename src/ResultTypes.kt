
fun main(){

    // Sonuç tipleri

    // Byte<Short<Int<Long<Float<Double

    val x : Byte = 2
    val y : Int = 3

    val sonucTipi = x+y
    println(sonucTipi)
    println(sonucTipi::class.java)

    val a : Int = 9
    val b : Long = 3
    val sonucTipi2 = a/b
    println(sonucTipi2::class.java)

    val int1 = 10
    val int2 = 3
    val sonucTipi3 = int1/int2
    println(sonucTipi3)

    val intSayi = 10
    val doubleSayi = 3.0
    val sonucTipi4 = intSayi/doubleSayi
    println(sonucTipi4)
    println(sonucTipi4::class.java)

    val floatSayi = 2.0f
    val sonucTipi5 = doubleSayi/floatSayi

    println(sonucTipi5)
    println(sonucTipi5::class.java)

}