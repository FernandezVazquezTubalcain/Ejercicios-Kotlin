
/*
fun main() {

    val mariano = Persona("","",0)

    println(mariano.nombre.toString() + mariano.apellidos.toString() + mariano.edad.toString() )

    val juan = Persona("juan", "Magan",18)

    /*println(juan)
    print(juan.nombre)
    print(juan.apellidos)
    print(juan.edad)

    juan.edad = -30
    print(juan.edad)*/

    // println(juan.getNombre())
    //println(juan.getEdad())

}
    class Persona (
         var nombre :String,
         var apellidos : String,
         var edad : Int
    ){
        var genero : String = "M"

        init {
                require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
                require(edad >= 18) { "La edad debe ser mayor o igual a 18 años."}
                require(apellidos.isNotBlank()){ "Los apellidos no deben ser nulos."}
            }

        constructor(nombre : String, apellidos : String, edad : Int, genero : String)
                : this(nombre, apellidos, edad)
        {
            this.genero = genero
        }

        fun formatear(nombre : String) : String{

            if(nombre== "Pedro"){
                return "Pedro"
            }else{
                return "Jesus"
            }
        }


        public fun formatoNombre(nombre : String) : String{
            return nombre.length.toString()
        }
        public fun setEdad(edad : Int){
            this.edad = edad;
        }

        public fun getEdad(): Int {
            return this.edad
        }
        public fun getNombre(): String {
            return this.nombre
        }
    }
*/