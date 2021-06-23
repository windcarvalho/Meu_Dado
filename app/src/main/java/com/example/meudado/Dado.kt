package com.example.meudado


class Dado()  {
   var valor: Int = 0
       get() = field + 4 //opcional
       set(value) {
         field = value + 8
       }
}