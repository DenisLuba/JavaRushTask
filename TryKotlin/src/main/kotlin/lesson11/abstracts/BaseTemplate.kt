package lesson11.abstracts

open abstract class BaseTemplate {
    var count = 0

    fun a() {
        count++
        println("COUNT: $count")
    }

    abstract fun minus()
}