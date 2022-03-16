package bucles

fun main() {
    // array es igual que en python
    val nums = arrayOf(1, 5, 10, 15, 20)

    // for es una mezcla de maven y python
    for (x in nums) {
        println(x)
    }

    print("\n")

    // También tiene range como en python, con dos puntos entre dos números
    for (x in 5..15) {
        println(x)
    }
}