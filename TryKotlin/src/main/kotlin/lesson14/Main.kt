package lesson14

fun main(args : Array<String>) {
    var index : Int = 0
    while (index < 10) {
        print("Yo) ")
        index++
    }
    println()

    index = 0
    do {
        print("Yo)Yo) ")
        index++
    } while (index < 10)
    println()

    var nums = 1..10
    for(value in nums)
        print("$value ")
    println()

    for (value in nums step 2)
        print("$value ")
    println()

    for (value in 10 downTo 1 step 3)
        print("$value ")

}