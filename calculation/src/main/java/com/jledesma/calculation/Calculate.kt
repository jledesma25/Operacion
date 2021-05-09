package com.jledesma.calculation

class Calculate {

    companion object{

        fun mas(numero1:Int,numero2:Int):Int{
            return numero1 + numero2
        }

        fun menos(numero1:Int,numero2:Int):Int{
            return numero1 - numero2
        }

        fun por(numero1:Int,numero2:Int):Int{
            return numero1 * numero2
        }

        fun entre(numero1:Int,numero2:Int):Int{
            return if(numero2 == 0){
                0
            }else{
                numero1 / numero2
            }
        }
    }
}