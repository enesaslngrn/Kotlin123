
fun main(){

    // Apply -> Uygulamak. -> Eğer bir nesnenin içindeki değişken methodlara çok fazla değişiklik uygulamak istersek.

    val matislem = MatIslem().apply { // nesne parametresi -> this
        topla()
        this.sayi1 = 10
        this.sayi2 = 20
        topla()
    }

    // Return yoktur. Bize dönüş olarak, sınıfımızın tipini ve idsini dönderir.

    println("Matislem çıktısı: $matislem")
}

class MatIslem{

    var sayi1 = 5
    var sayi2 = 10

    var islem : String? = null

    fun topla(){
        println("Toplama: ${sayi1+sayi2}")
    }
}