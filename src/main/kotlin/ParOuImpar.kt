/*Dado um número N tal que 1 <= N <= 1000 imprima se ele é "par" ou "ímpar"*/
fun main() {
    println(ePar(6))

}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("$numero é par.")
    } else {
        println("$numero é impar. ")
    }
}

fun ePar(num: Int): Boolean {
    return !(num % 2 == 0)
}

fun eImpar(num:Int):Boolean{
    return num%2!=0
}

fun eMaiorQueDez(num: Int): Boolean {
    return !(num <= 10)
}

fun format(num: Int): String {
    if (eMaiorQueDez(num)) {
        return "$num é maior que 10."
    }

    if (ePar(num)) {
        return "$num é par."
    }
    return "$num é impar."
}


