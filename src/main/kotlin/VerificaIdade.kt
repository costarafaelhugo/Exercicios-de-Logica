/*Exercicio 3 - Recebo um número N tal que 1 <= N <= 50, eu mostro
"Você é maior de idade" quando N é maior que 18, ou "Você é menor de idade" caso contrário*/

fun main() {
verificaIdade(22)
}

fun verificaIdade(numero:Int){
    if(numero>=18){
        println("Você é maior de idade.")
    }
    else{
        println("Você é menor de idade.")
    }
}
