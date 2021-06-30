/*Given a random non-negative number, you have to return the digits of this number within an array in reverse order.*/
fun main() {
    println(digitize(512223588522112252))
}

fun digitize(n: Long): String {
    var numeroSeparado = n.toString().split("")

    var numeroReverso = ""
    for (i in numeroSeparado.lastIndex downTo 0) {
        numeroReverso += " ${numeroSeparado[i]}"
    }

    return numeroReverso
    println(numeroReverso)
}

/*
  var result = n.toString().map { it.toString().toInt() }.toIntArray();

    return result.reversedArray();
 */
