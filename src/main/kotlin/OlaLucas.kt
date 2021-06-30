/*Exercicio 2 - Dado o nome da pessoa retorne apenas "Olá, seja bem vindo <nome>" somente o nome for Lucas*/

fun main() {
    ola("Jonas")
}

fun ola(nome:String){
    if(nome!= "Lucas"){
        return
    }else{
        println("Olá, $nome")
    }
}