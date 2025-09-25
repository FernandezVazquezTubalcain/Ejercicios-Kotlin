fun main(){

    var cadena : String
    println("Introduzca una cadena")
    cadena = readln()

    try{
        println("El numero de digitos de la cadena es: ${contarDigitos(cadena)}")
    }catch (e: IllegalArgumentException){
        println("Introduzca al menos un carácter")
    }finally {
        println("Ha terminado el proceso.")
    }

    println("5.3".toDoubleOrDefault(1.0))
    println("5.".toDoubleOrDefault(1.0))
    println(".3".toDoubleOrDefault(1.0))
    println("dos".toDoubleOrDefault(1.0))
}

fun contarDigitos(numeroUsuario : String?) : Int {

    if(numeroUsuario.isNullOrBlank()){
        throw IllegalArgumentException("La cadena introducida " +
                "por el usuario debe tener al menos un caracter")

    }
    return numeroUsuario.count(Char::isDigit)
}

fun String.toDoubleOrDefault(defaultValue: Double): Double {
    return try {
        toDouble()
    } catch (e: NumberFormatException) {
        defaultValue
    }
}
