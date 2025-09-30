fun main(){

    val mapa : Map<String, String?>  = mapOf(
        "nombre" to "Jesus",
        "apellidos" to "Fernandez",
        "localidad" to "Novallas",
        "edad" to "128",
        "direccion" to null
    )

    println("$mapa")

    println("${mapa.size}")
    println("${mapa.entries}")
    println("${mapa.values}")
    println("${mapa["nombre"]}")
    println(mapa.getOrDefault("direccion","sin bautizar"))

    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "Cien años de soledad" to 1991
    )

    booksMap.put("La máquina del tiempo", 1890) //añado nueva clave valor
    booksMap["La máquina del tiempo"] = 1895 //modifico el valor anterior

    println(booksMap)

    booksMap.remove("Sinsajo")
    println(booksMap)

    println(booksMap.remove("Cien años de soledad", 2015)) // false
    println(booksMap)

    val operationsMap = mapOf(
        "Suma" to '+',
        "Resta" to '-',
        "Multiplicación" to 'x',
        "División" to '÷'
    )

    for ((operation, symbol) in operationsMap) {
        println("$operation -> $symbol")
    }

    operationsMap.forEach { (k, v) -> println("$k -> $v") }


}