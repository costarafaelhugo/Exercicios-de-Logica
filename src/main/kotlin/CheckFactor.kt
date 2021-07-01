/*This function should test if the factor is a factor of base.
Return true if it is a factor or false if it is not.
*/

fun main() {
    println(checkForFactor(3, 9))
}

fun checkForFactor(base: Int, factor: Int): Boolean {
    return base % factor == 0
}
