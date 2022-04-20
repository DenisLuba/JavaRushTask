package lesson8

enum class Color (val colorHex : String, val opacity : Double? = 1.0) {
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#22rr33", 0.5),
    GREEN("#qweqwe");

    fun some() {
        print("my method")
    }
}