
fun main() {

    // Get and Set -> Boiler-plate code-> Gereksiz kod.

    /*
    Get-> Almak, Set-> Belirlemek
     */

    val arabam = BenimArabam()
    println(arabam.hiz)
    println("Setten önce başka hız değişkeni: ${arabam.baskaHiz}")

    arabam.hiz = 200
    println(arabam.hiz)
    println("Setten sonra başka hız değişkeni: ${arabam.baskaHiz}")

    val person = Person()
    println(person.name)
    person.name = "Elif"
    println("Setten sonra name değişkeni: ${person.name}")

}

class BenimArabam{

    var baskaHiz = 0

    var hiz : Int
        get() = 100
        set(value) {
            baskaHiz = value
        }
}

class Person{

    var name : String = "Enes"
        get() = field
        set(value) {
            field = value
        }
}




