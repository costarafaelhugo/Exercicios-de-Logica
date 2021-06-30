/*Build a function that returns an array of integers from n to 1 where n>0.
Example : n=5 --> [5,4,3,2,1]
*/

fun main() {

}

fun reverseSeq(n: Int): List<Int> {
    var myList = mutableListOf<Int>()
    for (i in 1..n){
        myList.add(i)
    }
    return myList
}
