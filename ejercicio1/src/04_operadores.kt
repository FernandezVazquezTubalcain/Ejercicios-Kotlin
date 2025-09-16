fun main(){

    var a = 7
    var b = 2

    println("(a:$a + b:$b)= ${a + b}")
    println("(a + b)= ${a + b}")
    println("a($a - $b)= ${a - b}")
    println("($a / $b)= ${a / b}")
    println("($a * $b)= ${a * b}")
    println("($a % $b)= ${a % b}")

    val input = 5
    var result : Boolean
    val greaterThanZero = input > 0
    val isEven = input % 2 == 0

    println("greaterThanZero: $greaterThanZero")
    println("isEven: $isEven")

    result = greaterThanZero || isEven
    println("Es mayor que cero o par:$result")

    result = greaterThanZero && !isEven
    println("Es mayor que cero e impar:$result")

    a = 10
    b = 20

    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")


}