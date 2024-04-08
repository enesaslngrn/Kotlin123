

fun main(){

    // Data class

    /*
    1. Dataları depolamak için elverişli.
    2. En az 1 parametre almak zorunda, primary constructor içerisinde.
    3. parametresi -> val-var. Property yani özellik önceden belirtilmeli.
     */

    val kullanici = BenimKullanicim("Enes","enes@hotmail.com",27)
    println(kullanici)

    val kullanici1 = BenimKullanicim("Ahmet","ahmet@gmail.com",30)
    val kullanici2 = BenimKullanicim("Elif","elif@gmail.com",25)

    // Equals()
    val isEqual = kullanici1.equals(kullanici2)
    println(isEqual)

    // toString()
    val toString = kullanici.toString()
    println(toString)

    // Copy()

    val kullanici3 = kullanici1.copy(email = "ahmet97@gmail.com")
    println(kullanici3)
}

data class BenimKullanicim(val isim : String, val email : String, val yas : Int){

    /*
    1. equals() -> Referanslar yerine data'nın eşitliğini kontrol eder.
    2. toString() -> Constructor içindeki değişken isimlerini print eder.
    3. Copy() -> Bazı değişiklikler yaparak data'yı kopyalama imkanı sunar.
     */

}