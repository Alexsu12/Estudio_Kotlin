package objetos

// Esto es un constructor de una superclase. Se usa open para las superclases
open class Coche (marca: String, puertas: Int){
    // Aquí van las funciones de clase
    fun arrancarCoche(){
        println("Vroom!")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coche) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}

/*
Esta es una clase hija. Se usa ":" junto a la superclase.
Se puede declarar una clase solo con su constructor
*/
class Turismo(marca: String, puertas: Int, color: String) : Coche(marca, puertas)
class Furgoneta(viajeNaranjas: Int, viajeChatarra: Int, marca: String, puertas: Int) : Coche(marca, puertas)

fun main() {
    val coche1 = Turismo("Ford", 5, "rojo")
    println(coche1.arrancarCoche())
}