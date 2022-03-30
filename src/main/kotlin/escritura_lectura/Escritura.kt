package escritura_lectura

import java.io.File

fun main() {
    // Se coge la dirección del archivo
    val usuario = System.getProperty("user.home")
    // Se crea el archivo con la ruta y el nombre
    val texto = File("$usuario/Escritorio", "text.txt")

    // Escribimos el texto en el archivo
    texto.bufferedWriter().use { out ->
        for (i in 1..100) {
            out.write("Linea $i\n")
        }
    }
}
