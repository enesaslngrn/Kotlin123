
fun main(){
    // Sık kullanılan String fonksiyonları

    val denemeString = "Deneme String"
    println(denemeString.length)

    println(denemeString.plus(" Deneme String 2"))
    println(denemeString.drop(3))
    println(denemeString.dropLast(2))

    println(denemeString.equals("Deneme String"))
    println(denemeString.equals(5))

    println(denemeString.indices)
    println(denemeString.lastIndex)
    println(denemeString.lastIndexOf('S'))

    println(denemeString.capitalize())
    println(denemeString.decapitalize())

    println(denemeString.uppercase())
    println(denemeString.lowercase())

    println(denemeString.get(0))
    println(denemeString.get(3))
    println(denemeString[0].lowercase())

    println(denemeString.substring(2,6))
    println(denemeString.filter { char -> char == 'e' })
    println(denemeString.filterNot { char -> char == 'e'  })

    println(denemeString.find { char -> char.isUpperCase() })

    println(denemeString.isEmpty())

}