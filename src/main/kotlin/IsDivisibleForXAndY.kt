fun main() {
println(isDivisible(10,2,5))

}

fun isDivisible(n: Int, x: Int, y: Int): Boolean {
    // your code here
    return n%x==0 && n%y==0
}