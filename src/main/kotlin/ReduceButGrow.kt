/*Given a non-empty array of integers, return the result of multiplying the values together in order. */

fun main() {
println(grow(intArrayOf(2, 4,2)))
}

fun grow(arr: IntArray): Int {
    var resultado = 1
    for (i in arr){
        resultado*=i
    }
    return resultado
}
