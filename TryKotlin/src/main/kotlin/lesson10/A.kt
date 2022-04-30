package lesson10

class A(override var x: String, override val y: Int) : MyInterface {
    override fun fun1() {
        println("class A")
    }

    override fun fun2() {
        super.fun2()
    }
}