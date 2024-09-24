package com.nole.aaron.pc1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Ejercicio01Kotlin {
    @Test
    fun main() {
        // Prueba con palabras que son anagramas
        val palabra1 = "listen"
        val palabra2 = "silent"
        println("$palabra1 y $palabra2:")
        println(sonAnagramas(palabra1, palabra2))  // Debería imprimir true
    }
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Si las palabras no tienen la misma longitud, no pueden ser anagramas
        if (palabra1.length != palabra2.length) {
            return false
        }
        // Crear mapas para almacenar la frecuencia de caracteres de cada palabra
        val frecuencia1 = mutableMapOf<Char, Int>()
        val frecuencia2 = mutableMapOf<Char, Int>()
        // Contar la frecuencia de cada carácter en la primera palabra
        for (caracter in palabra1) {
            frecuencia1[caracter] = frecuencia1.getOrDefault(caracter, 0) + 1
        }
        // Contar la frecuencia de cada carácter en la segunda palabra
        for (caracter in palabra2) {
            frecuencia2[caracter] = frecuencia2.getOrDefault(caracter, 0) + 1
        }
        // Comparar los mapas de frecuencias. Si son iguales, las palabras son anagramas
        return frecuencia1 == frecuencia2
    }
}