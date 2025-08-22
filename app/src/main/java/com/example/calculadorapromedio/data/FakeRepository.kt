package com.example.calculadorapromedio.data

class FakeRepository {
    fun guardarPromedio(promedio:Double):String{
        //simula gurdar en base de datos
        return "promedio ${String.format("%.2f",promedio)} guardado exitosamente."
    }
}