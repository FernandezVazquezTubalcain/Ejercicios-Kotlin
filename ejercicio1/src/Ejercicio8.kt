fun main() {

    val numeros: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    val pares: MutableList<Int> = filtar(numeros)
    println(pares)
}

fun filtar(numeros : List<Int>) : MutableList<Int>{
    val pares: MutableList<Int> = mutableListOf()

    for (num in numeros) {
        if (num % 2 == 0) {
            pares.add(num)
        }
    }
    return pares
}