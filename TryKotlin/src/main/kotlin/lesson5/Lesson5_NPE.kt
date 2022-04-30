package lesson5

fun main() {
    val st: String? // "?" говорит о том, что переменная может содержать null
    st = getSt()
    val size = st!!.length // "!!" говорит о том, что мы понимаем, что можем получить null
    println(size)
}
fun getSt(): String? { // "?" говорит о том, что функция может вернуть null
//    throw NullPointerException()
    return null
//    return "Hello"
}