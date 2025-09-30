import kotlin.math.PI

fun main() {

    open class Padre
    class Hijo : Padre()

    open class Ancestro(val propiedad : Boolean)
    class Descendiente(propiedad : Boolean) : Ancestro(propiedad)

    open class Weapon(val damage: Int, val speed : Int){

    }

    class Bow : Weapon{
        constructor(damage : Int, speed : Int, procedencia : String) : super (damage,speed)
    }

    var arco = Bow(12, 16, "Tarazona")
    var metralleta = Weapon(18,130)

    println("Arco: Daño " + arco.damage.toString())
    println("Metralleta: Daño " + metralleta.damage.toString())

    open class Caracter(nombre : String){
        open fun morir() = println("morir")
    }

    class mago (nombre : String) : Caracter(nombre){
        override fun morir() {
           println("El mago muere")
        }
    }

    val caracter1 = Caracter("C1")
    val caracter2 = mago("C2")

    caracter1.morir()
    caracter2.morir()

    abstract class Figura(val numeroLados : Int){
        abstract var area :Float
        abstract fun calcularArea() : Float
    }

    class Circulo(val radio: Float)
        : Figura(0){
        override var area: Float = calcularArea()

        override fun calcularArea() : Float {
           return (2* PI*radio*radio).toFloat()
        }
    }

    class Rectangulo(val base: Float, val altura: Float)
        : Figura(4){
        override var area: Float = calcularArea()

        override fun calcularArea() : Float {
            return (base*altura).toFloat()
        }
    }

    class Triangulo(val base: Float, val altura: Float)
        : Figura(3){
        override var area: Float = calcularArea()

        override fun calcularArea() : Float {
            return (base*altura/2).toFloat()
        }
    }

    val circulo = Circulo(2f)
    println("CIRCULO")
    println("Area" + circulo.area)
    println("Radio" + circulo.radio)
    println("Nº Lados" + circulo.numeroLados)

    val rectangulo = Rectangulo(2f,4f)
    println("RECTANGULO")
    println("Area" + rectangulo.area)
    println("Nº Lados" + rectangulo.numeroLados)

    val triangulo = Triangulo(2f,3f)
    println("TRIANGULO")
    println("Area" + triangulo.area)
    println("Nº Lados" + triangulo.numeroLados)

}







