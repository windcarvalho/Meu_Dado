package com.example.outsidedado
import android.util.Log
import com.example.meudado.Dado
class VampiroDoDado {
    lateinit var d:Dado
    constructor(){
        d = Dado()
        Log.d ("teste", d.valor.toString())
    }
}