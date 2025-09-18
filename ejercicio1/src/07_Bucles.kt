fun main(){

    var i = 10
    while(i > 0){
        println("Voy a aprobar: $i")
        i--;
    }

    var num1 =1
    for(num in 1..10){
        println("Voy a aprobar mucho: $num")
    }

    println("$num1")

    for(num in 10 downTo 0 step 2)
        println("Voy a aprobar mucho: $num")

    var letra  : Char = 'a'
    for(char in 'a'..'f') println(char)
    for(char in 'f' downTo 'a' ) println(char)
    for(char in 'a' until 'f') println(char)
    println("De la f a la a:")
    for(char in 'f' downTo 'b') println(char)

    for (c in "Michael"){
        println(c)
    }

    buclePrincipal@ for( num in 1..10){
        for(num2 in 10 downTo 1){
            println("num: $num num2:$num2")
            if(num2 == num1){
                break@buclePrincipal
            }
        }
    }

}