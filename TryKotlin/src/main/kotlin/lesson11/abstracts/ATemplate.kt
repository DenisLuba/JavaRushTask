package lesson11.abstracts

class ATemplate : BaseTemplate() {
    override fun minus() {
        count--
        println("COUNT: $count")
    }

}