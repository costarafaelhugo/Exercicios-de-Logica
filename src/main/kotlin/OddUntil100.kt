fun main() {
   oddUUntil100(261)
}

fun oddUUntil100(number: Int){
    for (i in 1..number){
        if (i%2==0 && i<100){
            println(i)
        }
    }
}