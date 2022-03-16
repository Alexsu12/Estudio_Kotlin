package bucles

fun main() {
    val x = 3

    // when es igual a un switch
    val y = when(x){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        else -> null
    }

    println(y)
}