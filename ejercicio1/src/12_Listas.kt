fun main(){

    val alumnos : List<String> = listOf("Oliver","Marco","Alex","Ekaterina",
        "Guillermo","Hugo","Jaime","Alex","Aitor","Dario")

    alumnos.size
    println(alumnos.get(3))
    println(alumnos.first())
    println(alumnos.last())
    println(alumnos.indexOf("Alex"))
    println(alumnos.lastIndexOf("Alex"))

    val colores : MutableList<String> = mutableListOf("Rojo","Amarillo","Azul")

    colores.add("Verde")
    colores.add("Morado")

    println(colores)

    colores.sort()
    println(colores)

    colores.sortDescending()
    println(colores)

    println( colores.none()) //Nos devuelve un true si está vacía la lista
    println(colores.firstOrNull()) //Nos devolverá el primer campo, y si no hay, un null.
    println(colores.elementAtOrNull(10)) //El elemento del índice 2, si no hay, devolverá un null
    println(colores.lastOrNull()) //Último valor de la lista o null

    for(color in colores){
        println(color)
    }

    for((indice,item) in colores.withIndex()){
        println("Indice: $indice Item: $item")
    }

    val colores2 : MutableList<String> = mutableListOf()

    colores.forEach(){
        colores2.add("$it")
    }

    println("Colores2")
    for((indice,item) in colores2.withIndex()){
        println("Indice: $indice Item: $item")
    }


}