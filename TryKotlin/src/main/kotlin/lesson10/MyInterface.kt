package lesson10

interface MyInterface {
    var x : String
    val y : Int
    val z : Double
    get() = 2.0

    fun fun1()

    fun fun2() {
        println("default")
    }
}