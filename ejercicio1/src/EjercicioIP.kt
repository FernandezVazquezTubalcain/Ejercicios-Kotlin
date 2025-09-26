import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main(){

    var ip :String = ""
    //val octetos = ip.split(".").toTypedArray()
    var octeto1 : Int = 0
    var octeto2 : Int = 0
    var octeto3 : Int = 0
    var octeto4 : Int = 0

    println("introduzca una IP:")
    ip = readln()

    try{
        octeto1 = extraerOcteto(ip)
        ip = cortarCadena(ip)
        octeto2 = extraerOcteto(ip)
        ip = cortarCadena(ip)
        octeto3 = extraerOcteto(ip)
        ip = cortarCadena(ip)
        octeto4 = ip.toInt()

    }catch (e: StringIndexOutOfBoundsException){
        println("La ip introducida no es valida")
        exitProcess(-1)
    }catch (e1: NumberFormatException){
        println("La ip introducida no es valida")
        exitProcess(-1)
    }

    println("Octeto 1: $octeto1")
    println("Octeto 2: $octeto2")
    println("Octeto 3: $octeto3")
    println("Octeto 4: $octeto4")
    println ("Clase: ${validarIP(octeto1,octeto2,octeto3,octeto4)}")
}


fun cortarCadena(ip :String) :String{
    return ip.substring(ip.indexOf(".", 0, true)+1, ip.length)
}

fun extraerOcteto(ip : String) : Int{
    var octeto : Int
    octeto = ip.substring(0,ip.indexOf(".", 0, true)).toInt()
    return octeto
}

fun validarIP(octeto1 : Int, octeto2 : Int, octeto3 : Int, octeto4 : Int ) : String{
    var clase : String = ""

    when (octeto1) {
        10 -> {
            clase = "A"
        }

        172 -> {
            clase = "B"
        }

        192 -> {
            clase = "C"
        }
    }

    return clase
}