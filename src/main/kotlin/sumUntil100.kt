fun main() {
sumOfAll(3)
}

fun sumOfAll(num: Int) {
    var numero = 0
    for (i in 1..num) {
        numero += i

    }
    println(numero)
}