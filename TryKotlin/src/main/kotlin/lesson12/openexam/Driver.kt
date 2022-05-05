package lesson12.openexam

class Driver(name : String) : Person(name) {

    override val age : Int = 2

    override fun getAddress() : String {
        return "Address of driver"
    }

    override fun toString(): String {
        return "Driver(name='$name', age=$age)"
    }


}