fun main(){

    var opcion : Int = 0

    do{
        println("1-Calcula los numeros primos")
        println("2-Calcula los numeros primos gemelos")
        println("3-Salir")
        println("Introduzca la opción:")
        opcion = readlnOrNull()?.toInt() ?: 3
        when(opcion){
            1-> calculaPrimos()
            2-> calculaPrimosGemelos()
        }

    }while(opcion != 3)
}

fun calculaPrimosGemelos(){
    println("Introduzca hasta que numero se deben calcular los primos gemelos:")

    var cantidad : Int
    var primo1 :Int = 1;
    cantidad = readlnOrNull()?.toInt() ?: 0
    println("Los numeros primos gemelos hasta el $cantidad son:")
    for(num in 0..cantidad){
        if(esPrimo(num) && num == (primo1+2)){
            println("num: $num primo1: $primo1" )
            primo1 = num
        }else if(esPrimo(num)) {
            primo1 = num
        }
    }
}

fun calculaPrimos(){
    println("Introduzca hasta que numero se deben calcular los primos:")
    var cantidad : Int
    cantidad = readlnOrNull()?.toInt() ?: 0
    println("Los numeros primos hasta el $cantidad son:")
    for(num in 0..cantidad){
        if(esPrimo(num)) println(num)
    }
}
fun esPrimo(numero : Int): Boolean
{
    var primo = true

    if(numero <=0){
        primo = false
    }else if( numero>2){
        for(contador in 2 .. (numero/2)){
            if(numero%contador ==0 ){
                primo = false
                break;
            }
        }
    }

    return primo
}


