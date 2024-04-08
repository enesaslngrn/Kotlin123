/*
import kotlin.random.Random
fun main() {

    // Practice 1

    println("Kahraman adı:")
    val kahramanAdi = readlnOrNull() ?: "Enes"

    val kahraman = Kahraman(kahramanAdi,1,100, mutableListOf()).let {
        val random = Random.nextInt(100)
        if (kahramanAdi.startsWith("E")){
            println("${it.ad} lanetlendi!")
            it.copy(saglik = random)
        }else{
            it.copy(saglik = 100)
        }
    }.also {
        println(it)
        println("${it.ad} maceraya hazır!")
    }

    with(kahraman){
        val dusmanSaglik = 20
        val savasSonucu = Random.nextBoolean()

        if (savasSonucu){
            println("${this.ad} düşmanı yendi! Kazanılan sağlık: $dusmanSaglik")
            this.saglik += dusmanSaglik
            this.seviye += 1
            println("Seviye atladık!")
        }else{
            println("${this.ad} düşmana yenildi! Kaybedilen sağlık: 5")
            this.saglik -= 5
        }
        println("Yeni sağlık : ${this.saglik}")
        println(kahraman)
    }

    val yeniKahraman = kahraman.run {
        println("${this.ad} yeni bir tapınak keşfetti!")
        val deneyim = Random.nextInt(100)
        println("Kazanılan deneyim: $deneyim")
        if (deneyim > 20){
            println("Seviye atladık!")
            this.seviye+= 1
        }else{
            println("Yeterli deneyim alınamadı")
            this
        }
    }
    println(yeniKahraman)

    kahraman.apply {
        this.envanter.apply {
            add("Excalibur")
            add("Zırh")
            add("İksir")
        }
    }.also {
        println("Macera bitti!")
        println("Envanter: ${it.envanter}")

        val saglikIf = it.takeIf { it.saglik > 50 }
        if (saglikIf == null){
            println("Baya dayak yemişiz!")
        }else{
            println("Burnum bile kanamadı! : $saglikIf")
        }

        val loot = it.takeUnless { it.envanter.contains("Excalibur") } // true -> null, false-> Kahraman?

        if (loot == null){
            println("Vay canına Excalibur silahını elde ettik!")
        }else{
            println("Güzel hazine elde edemedik!")
        }
    }

}

data class Kahraman(val ad : String, var seviye : Int, var saglik : Int, var envanter : MutableList<String>)


 */

