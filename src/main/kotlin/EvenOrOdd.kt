/*Create a function (or write a script in Shell) that takes an integer
as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */

fun main() {
println(printEvenOrOdd(5))
}

fun evenOrOdd(num:Int):Boolean{
    return num%2==0
}

fun printEvenOrOdd(num: Int):String{
    if (evenOrOdd(num)){
        return "Even"
    }
    return "Odd"
}