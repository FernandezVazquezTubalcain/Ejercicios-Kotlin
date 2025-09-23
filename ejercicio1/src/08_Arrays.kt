fun main(){

    //valores prestablacidos
    val data = arrayOf<Double>(1.3,1.7,2.1)

    for(i in 0..2)
        println(data[i])

    val enteros = Array<Int>(10){ i -> i+1 }

    for(i in 0..9)
        println(enteros[i])

    val numbersIt = Array<Int>(10){ it+1 }
    for(i in 0..9)
        println(numbersIt[i])

    val planets = arrayOfNulls<String>(7)
        planets[0]= "mercurio"
        planets[1]= "venus"
        planets[2]= "tierra"
        planets[3]= "marte"
        planets[4]= "jupiter"
    for (i in planets.indices){
        println("${planets[i]} está en la posición ${i +1}")
    }

    for(i in 0 until planets.size){
        println("${planets[i]} está en la posición ${i +1}")
    }

    for(i in 0 .. planets.size-1){
        println("${planets[i]} está en la posición ${i +1}")
    }

    println("Imprimo los valores de los planetas")
    for(i in planets){
        println(i)
    }

    planets.forEachIndexed { index, value ->
        println("$value está en la posición ${index+1}")
    }

    val matriz = arrayOf(
        arrayOf<Int>(1,2,3),
        arrayOf<Int>(4,5,6),
        arrayOf<Int>(7,8,9)
    )

    for(i in 0 until matriz.size){
        for(j in 0 until matriz[i].size){
            print("El elemento ${matriz[i][j]} está en la posición i:$i j:$j")
            println()
        }
    }

}