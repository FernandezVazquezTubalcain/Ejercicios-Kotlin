fun main(){

    val edades = arrayOf<Int>(10,6,4,7,8,17,18,22,33,34,41,42)


    println("La edad media es: ")
    println(promedioEdades(edades))
    println(menorEdad(edades))
}

fun promedioEdades(edades: Array<Int>) : Double{
    var total : Int = 0

    for (num in edades){
        total+= num
    }

    return (total.toDouble()/edades.size)
}

fun mayorEdad(edades: Array<Int>) : Int{
    var mayor : Int = 0
    for (num in edades){
        if(num > mayor){
            mayor = num
        }
    }


    return mayor
}

fun menorEdad(edades: Array<Int>) : Int{
    return edades.minOrNull() ?:0
}