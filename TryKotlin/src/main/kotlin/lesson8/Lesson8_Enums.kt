import lesson8.Color

fun main() {
//    println("RED")
//    println("BLACK")
//    println("GREEN")
    var message : Color = Color.GREEN
    var message2 : String = Color.BLACK.name
    println(Color.RED)
    println(message)
    println(message2)

    println(Color.RED.colorHex)
    println(Color.GREEN.opacity)

    Color.GREEN.some()
}