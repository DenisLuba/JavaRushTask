package lesson4

fun main() {
    myFirstFunction()
    mySecondFunction(1)
    myThirdFunction()
    myForthFunction(4, .4)
}

fun myFirstFunction(): Int {
    return 1
}

fun mySecondFunction(a: Long): Int {
    return a.toInt()
}

fun myThirdFunction() {
    println(1)
}

fun myForthFunction(a: Long, b: Double) = a + b