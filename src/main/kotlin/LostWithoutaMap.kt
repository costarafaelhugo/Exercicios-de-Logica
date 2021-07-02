/*Given an array of integers, return a new array with each value doubled.*/
fun main() {
println(maps(intArrayOf(1, 2, 3)))
}

fun maps(x: IntArray): ArrayList<Int> {
    var resultado:ArrayList<Int> = ArrayList()
    for(i in x){
        resultado.add(i*2)
            }
    return resultado
}




