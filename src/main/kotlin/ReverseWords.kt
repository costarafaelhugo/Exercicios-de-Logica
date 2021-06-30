/*Complete the solution so that it reverses all of the words within the string passed in.
Example:
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
*/

fun main() {
println(reverseWords("The greatest victory is that which requires no battle"))
}

fun reverseWords(texto: String): String {
    var textoSepardo = texto.split(" ")
    var textoReverso = ""

    for (i in textoSepardo.lastIndex downTo 0) {
        textoReverso += " ${textoSepardo[i]}"
    }
    if(textoReverso[0] == ' '){
        textoReverso=textoReverso.removeRange(0,1)
        return textoReverso
    }
    return textoReverso
}
