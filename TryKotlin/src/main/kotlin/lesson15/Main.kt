fun main(args: Array<String>) {
    var nums = 1..10
    val value = 3
//    for (num in nums) {
//        if (num == value) {
//            println(true)
//            break
//        }
//    }
    println(value in nums)

    val characters = 'a'..'z'
    println(isChar('y', characters))
    println(isChar('/', characters))
}

fun isChar(char: Char, characters: CharRange) = char in characters