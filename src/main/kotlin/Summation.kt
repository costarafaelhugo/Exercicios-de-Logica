/*Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.*/

fun main() {
println(summation(8))
}

fun summation(n:Int):Int {
 var total = 0
    for (i in 0..n){
     total+= i
 }
    return total
}