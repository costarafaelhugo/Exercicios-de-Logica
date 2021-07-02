/*This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.*/

fun main() {
println(simpleMultiplication(2))
}

fun simpleMultiplication(n: Int): Int {
   var result=1
    for (i in 0..n) {
        result = if (n % 2 == 0) {
            n * 8
        } else {
            n * 9
        }
    }
    return result
}