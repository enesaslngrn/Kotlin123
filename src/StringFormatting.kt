
fun main(){

    // String formatting

    /*
    Placeholder-> yer tutucu
    %s -> Stringler
    %d -> Integer
    %f -> Float
     */

    val formatString = "Benim adım %s ve ben %d yaşındayım."
    val formatlananString = formatString.format("Enes", 26)
    println(formatlananString)
    println(formatlananString::class.java)

    val helloString = "%S,%S".format("Hello","World!")
    println(helloString)

    val pi = 3.14659
    val piFormat = "pi = %.2f".format(pi)
    val piFormat2 = String.format("%.5f",pi)
    println(piFormat)
    println(piFormat2)
    println(piFormat2::class.java)


}