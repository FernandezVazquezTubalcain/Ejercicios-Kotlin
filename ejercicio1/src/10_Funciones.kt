fun main(){

    fun greetin(){
        println("Hola mundo!")
    }

    fun greetin2() : Unit{
        println("Hola mundo!")
    }

    fun suma (numero1 : Int, numero2 : Int) : Int {
        return numero1 + numero2
    }

    fun operar (x :Int, y : Int, z : Int) : Int = 2*x - y + z

    println(operar(2,4,7))
    println("operar(2,4,7): ${operar(2,4,7)}")

}