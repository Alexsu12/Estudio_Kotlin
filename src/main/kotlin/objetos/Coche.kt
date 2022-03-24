package objetos

// Esto es un constructor de una superclase. Se usa open para las superclases
open class Coche (private var marca: String, private var puertas: Int){
    // Aquí van las funciones de clase
    fun arrancarCoche(){
        println("Vroom!")
    }

    override fun toString(): String {
        return "Coche(marca='$marca', puertas=$puertas)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Coche) return false

        if (marca != other.marca) return false
        if (puertas != other.puertas) return false

        return true
    }

    override fun hashCode(): Int {
        var result = marca.hashCode()
        result = 31 * result + puertas
        return result
    }
}

/*
Esta es una clase hija. Se usa ":" junto a la superclase.
*/
class Turismo(private var marca: String = "Ford", private var puertas: Int = 5, private var color: String = "Rojo"):
    Coche(marca, puertas) {
    override fun toString(): String {
        return "Turismo(marca='$marca', puertas=$puertas, color='$color')"
    }
}

fun main() {
    val coche1 = Turismo()
    println(coche1)
    println(coche1.arrancarCoche())
}