/*Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.*/

fun main() {
    println(sum(listOf(5, "5")))
}

fun sum(mixed: List<Any>): Int {
    var soma = 0

    for (i in mixed) {
        soma += i.toString().toInt()
    }
    return soma;
}

