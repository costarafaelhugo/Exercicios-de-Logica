/*Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.*/

fun main() {

    for (i in countPositivesSumNegatives(arrayOf(5, 3, -1, 2, -3))) {
        println(i)
    }

    println(countPositivesSumNegatives(arrayOf(5, 3, -1, 2, -3)).stringToPrint())
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    var positivo = 0
    var negativo = 0
    return if (input == null || input.isEmpty()) {
        emptyArray()
    } else {

        for (i in input)
            if (i > 0) positivo += 1
            else negativo += i

        arrayOf(positivo, negativo)
    }
}


fun Array<*>.stringToPrint(): String {
    var texto = "["
    for ((indice, valor) in this.withIndex()) {
        if (this.lastIndex == indice) {
            texto += valor
        }else{
            texto+="$valor, "
        }
    }
    texto+="]"
    return texto

}