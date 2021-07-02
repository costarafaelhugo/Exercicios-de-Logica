/*Replace all vowel to exclamation mark in the sentence*/

fun main() {
    println(replace("ABCDE"))

}

fun replace(s: String): String {
    var novaPalavra = ""
    for (i in s) {
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o'
            || i == 'u' || i == 'A' || i == 'E' || i == 'I'
            || i == 'O' || i == 'U') {
            novaPalavra += "!"
        } else {
            novaPalavra += i
        }
    }
    return novaPalavra

}

