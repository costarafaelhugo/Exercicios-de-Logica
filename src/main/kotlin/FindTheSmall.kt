/*Given an array of integers your solution should find the smallest integer.*/

fun main() {
println(findSmallestInt(listOf(5,3,6)))
}

fun findSmallestInt(nums: List<Int>): Int {
    var menor = nums[0]
    for (num in nums){
        if (menor>num)
            menor=num
    }
    return menor

//    return nums.sorted()[0]
}