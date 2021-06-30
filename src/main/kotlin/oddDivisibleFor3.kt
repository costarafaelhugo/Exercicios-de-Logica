fun main() {
    contaNum(6)
}

fun contaNum(num: Int) {
    for (i in 1..num) {
        if (num % 2 == 0 && num % 3 == 0)
            print("$i, ")
    }

}