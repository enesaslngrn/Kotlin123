fun main(){

    // Practice 2

    val rezervasyonlar = mutableMapOf<String,String>("Ahmet" to "Masa 1", "Mehmet" to "Masa 2", "Veli" to "Masa 3")

    val yeniRezervasyonlar = mapOf("Elif" to "Masa 4", "Emir" to "Masa 4", "Ahmet" to "Masa 5")

    rezervasyonlar.putAll(yeniRezervasyonlar)

    println(rezervasyonlar)

    rezervasyonlar.put("Mustafa", "Masa 6")
    rezervasyonlar.put("Ayşe", "Masa 7")

    rezervasyonlar.remove("Emir")

    println(rezervasyonlar)

    // Filter

    val rezerveMasa = rezervasyonlar.filterValues {
        it == "Masa 2"
    }
    println(rezerveMasa)

    println("Tüm rezervasyonlar:")

    // ForEach

    rezervasyonlar.forEach {
        println("${it.key} kişisi ${it.value}'da oturuyor.")
    }



}