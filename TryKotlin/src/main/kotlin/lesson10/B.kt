package lesson10

class B : MyInterface {
    override var x: String
        get() = "String"
        set(value) {}
    override val y: Int
        get() = 5

    override fun fun1() {
        println("class B")
    }
}