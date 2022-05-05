package lesson12.openexam

open class Person(val name : String){

    open val age : Int = 0

    open fun getAddress() : String {
        return "Address of person"
    }

    override fun toString() : String {
        return "Person(name='$name', age=$age)"
    }
}