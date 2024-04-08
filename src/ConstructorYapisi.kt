
fun main(){

    // Constructor yapısı

    /*
    val spor = Spor()
    spor.yer = "Beton saha"

     */

    val ahmet = Spor("Basketbol","Basket sahası", 100)
    println(ahmet.spor)
    println(ahmet.yer)

    val mehmet = Spor("Voleybol","Voleybol sahası", 50)
    println(mehmet.spor)

    val elif = Meslek("Elif","Psikolog",26)
    println(elif.meslek)
    println(elif.yas)

    val enes = Meslek("Enes","Yazılımcı",28)
    println(enes.meslek)
    println(enes.yas)

}






