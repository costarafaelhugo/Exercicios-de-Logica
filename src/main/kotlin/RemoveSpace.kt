/*Simple, remove the spaces from the string, then return the resultant string.*/

fun main() {
    println(noSpace("hugo- bugo- nugo"))
}

fun noSpace(x: String): String {
    var resultado = ""
    for (i in x) {
        if (i != ' ')
            resultado +=i
    }
    return resultado
}