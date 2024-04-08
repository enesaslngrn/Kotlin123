
fun main(){
    // Encapsulation -> Zaten biliyoruz. Fakat prensip olarak görmedik. O yüzden direkt bu dersi izleyen birisi için tekrar edelim.

    /*
    Private, public, internal, protected varya, bunların hepsi encaplsulation konsepti işte.
    Yani bu prensibin olayı kapsam. O yüzden öncelikli erişim seviyeleri ve kapsam dersini izlemelisiniz. Burada yazılanları anlayabilmek için.
     */
}


open class Okul{

    val tip = "İlkokul"

    fun ogrenci(){
        println("$tip öğrencileri")
    }
}

class Sinif3A : Okul(){

    fun sinif3A(){
        println(tip)
        ogrenci()
    }
}


class Ogretmenler{

    fun ogretmen(){
        val okul = Okul()
        println(okul.tip)
        okul.ogrenci()
    }
}
