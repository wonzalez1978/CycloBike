package com.example.ciromine.ciclobike

import java.util.*

/**
 * Created by ciromine on 8/26/19.
 */
class SetupCiclovias {
    private val nombres = arrayOf(
        "Ciclovia 1",
        "Ciclovia 2",
        "Ciclovia 3",
        "Ciclovia 4",
        "Ciclovia 5",
        "Ciclovia 6",
        "Ciclovia 7",
        "Ciclovia 8",
        "Ciclovia 9",
        "Ciclovia 10"
    )
    private val comunas = arrayOf(
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia",
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia"
    )

    fun init(): ArrayList<Ciclovia> {
        val lista: MutableList<Ciclovia> = ArrayList()
        for (i in 0..lista.size) {
            val ciclovia = Ciclovia(nombres[i], comunas[i])
            lista.add(ciclovia)
        }
        return lista as ArrayList<Ciclovia>
    }
}