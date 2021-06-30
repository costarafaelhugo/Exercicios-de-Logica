fun main() {
println(expo(3))
}

fun expo(num:Int): Int {
    var base = 2
    var expo = num
    var result = 1
    for (i in 1..expo) {
        result *= base
    }
    return result
}