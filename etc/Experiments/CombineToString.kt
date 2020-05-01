fun <T> combineToString(num1: T, num2: T) = "$num1$num2"

fun main(args: Array<String>) {
    val nums = arrayOf<Number>(7, 42.7)
    println("Combined Numbers: ${combineToString(nums[0], nums[1])}")
}

