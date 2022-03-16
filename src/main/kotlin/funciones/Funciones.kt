package funciones

// fun es la declaración de una función
fun miFuncion(){
    println("Esta es una función")
}

// Los parámetros se declaran de la forma "nombre: Tipo"
fun funcionParametrizada(x: Int, y: Int){
    println(x + y)
}

fun main() {
    miFuncion()
    funcionParametrizada(5, 6)
}