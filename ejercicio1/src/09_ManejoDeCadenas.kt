fun main(){

    val name = "Jesus Fernandez"

    println(name)
    println("name[6]: ${name[6]}")
    println(name.get(6))

    for(char in name){
        print(char)
    }
    println()

    for(index in name.indices){
        println(name[index])
    }

    println(name.length)

    val a = "José" + " Monteria"
    val b = "Cantidad de ahorros: " + 536.4
    val c = "Resultado: " + (2 + 4)

    println(a)
    println(b)
    println(c)

    var d = "Texto explicativo "
    d += "Hola!"

    println(d)
    val welcomeText =
            "|¡Bienvenido a la guía de Kotlin! " +
            "|En esta serie de tutoriales aprenderás" +
            "|los conceptos básicos sobre el lenguaje" +
            "|y las herramientas necesarias para probarlo".trimMargin()

    val welcomeText2 = """
            |¡Bienvenido a la guía de Kotlin!
            |En esta serie de tutoriales aprenderás
            |los conceptos básicos sobre el lenguaje
            |y las herramientas necesarias para probarlo
        """.trimMargin()

    println(welcomeText2)

    println(welcomeText)



}