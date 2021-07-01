/*Terminal game move function
* In this game, the hero moves from left to right.
* The player rolls the die and moves the number of spaces indicated by the die two times.
Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.*/

fun main() {
println(move(3,6))
}

fun move(pos: Int, roll: Int): Int {
   return (roll*2)+pos
}
