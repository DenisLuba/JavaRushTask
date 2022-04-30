package lesson10

fun main(args : Array<String>) {
    var v1 : MyInterface = A("String A", 5)
    var v2 : MyInterface = B()

    v1.fun1()
    v2.fun1()
}