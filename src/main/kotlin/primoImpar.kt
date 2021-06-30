/*Dado um número N tal que 1 <= N <= 1000 imprima se ele é "par" ou "ímpar"*/

fun main() {
    isOddOrPrime(3)
}

fun isOddOrPrime(numero: Int) {
    if (numero == 2) {
        println(" Is Prime")
    } else if (numero % 2 != 0 && numero % numero == 0) {
        println(" Is Odd and prime")
    } else if (numero % 2 != 0 ) {
        println("Is Odd")
    }
}

