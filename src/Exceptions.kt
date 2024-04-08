
fun main(){

    var test = "test"
    /*
    Bu mesela NumberFormatException hatası verecek.
    println(test.toInt())
     */

    /*Kodumuzun herhangi bir kısmının Exception hatası verme ihtimali varsa try-catch içinde onu gözlemleyebiliriz.*/


    try {
        println(test.toInt())
    }catch (e: Exception){
        println("Eğer exception varsa, bir sürü kırmızı hata kodu gelmesindense sadece bu yazdığım mesaj gelecek.")
    }

    try {
        println(test.toInt())
    }catch (e: Exception){
        println("An exception happened \n${e.localizedMessage}") // Böyle yaparak ise sadece ilgili exception'ın detayını göreceğiz. Yine kırmızı errorlarla boğulmadan.
    }

    try {
        println(test.toInt())
    }catch (e: Exception){
        e.printStackTrace() //Bunu koyarsak ise hem error'u göreceğiz hem de kısa exception mesajını.
        println("An exception happened \n${e.localizedMessage}")
    }

    // Finally -> Exception olsa da olmasa da çalıştırılacaktır.
    // Throw -> Kendi exceptionlarınızı yaratma yöntemi.

    try {
        println(test.toInt())
    }catch (e: Exception){
        println("An exception happened \n${e.localizedMessage}")
    }finally {
        println("The execution has completed.") // Exception olsa da olmasa da finally çalışacaktır. Koymak faydalı çünkü memory leaks ve junk birikimi felan gibi şeyleri engeller.
    }

    /* Throw ile kendi exception'ımızı yaratabiliriz. Throw dan sonraki kodlar çalışmayacağı için yoruma aldım.

    throw IllegalStateException("Kendi exception'ım")

     */

    println("Lütfen bir tamsayı giriniz:")
    val input = readLine()

    try {
        val number = input?.toInt()
        println("Girilen tamsayı: $number")
    } catch (e: Exception) {
        println("Hata: Geçersiz giriş \n${e.localizedMessage}")
    } finally {
        println("İşlem tamamlandı.")
    }

    throw IllegalStateException("Kendi exception'ım")

    println("Program devam ediyor mu?")








}