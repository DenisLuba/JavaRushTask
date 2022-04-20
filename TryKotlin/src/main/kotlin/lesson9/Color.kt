package lesson9

enum class Color (val color : String, val opacity : Double = 1.0) {
    RED ("red"),
    GREEN ("green", 20.0),
    BLUE ("blue"),
    WHITE ("white", 3.0),
    BLACK ("black")
}