/*Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.*/

fun main() {
println(include(intArrayOf(5,2,3),10))
}

fun include(arr: IntArray, item: Int): Boolean {
    for (i in arr) {
        if (i == item) {
            return true
        }
    }
    return false
}