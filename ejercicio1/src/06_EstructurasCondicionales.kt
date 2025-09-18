fun main(){

    println("introduce tu fecha de nacimiento formato dd/mm/aa")
    val fecha = readLine()
    println("La fecha introducida es: $fecha")

    val dia = fecha?.substring(0,fecha.indexOf("/", 0, true))?.toInt()
    println("Dia: $dia")

    val mes = (fecha?.substring(fecha.indexOf("/", 0, true)+1,
        fecha.lastIndexOf("/",fecha.length,true)))?.toInt()
    println("mes: $mes" )

    val annus =  fecha?.substring(fecha.lastIndexOf("/",fecha.length,true)+1,fecha.length)
    println("año: $annus")

    if(dia == 1  ){
        println("primer dia del mes")
    }
    else if(dia == 2){
        println("segundo dia del mes")
    }
    else{
        println("otro dia")
    }

    when (mes){
        1 -> {
            println("Enero")
        }
        2 -> {
            println("Febrero")
        }
        in 3..6 ->{
            print("Primavera")
        }
        else -> {
            println("mes erroneo")
        }
    }

}