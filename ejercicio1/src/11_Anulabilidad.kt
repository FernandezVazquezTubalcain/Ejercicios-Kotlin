fun main(){

    val noAceptaNull : String
    //noAceptaNull = null

    val AceptaNull : String?
    AceptaNull = null

    val password: String? = null
    val longitudContraseña = password?.length //Int?
    println("longitudContraseña: $longitudContraseña")

    val counter : Int? = null
    println("Dec")
    println(counter?.dec())

    val passwordSize = password?.length ?: 0

}