class Manager {

    private val calisanlar = mutableListOf<Personel>()

    fun calisanEkle(personel: Personel){
        calisanlar.add(personel)
    }

    fun calisanlariGoster(){
        for (personel in calisanlar){
            personel.personeliGoster()
        }
    }

    fun calisanlariYonet(){

        calisanlar.forEach {
            if (it.maas != null){
                if (it.maas!! < 15000){
                    maasArttir(it)
                }
            }
        }
    }

    private fun maasArttir(personel: Personel) {
        if (personel.maas != null){
            personel.maas = personel.maas!!.times(1.1)
        }
    }
}