package lesson9

import lesson9.Color.*

fun main() {
    println(getFavoriteColor(BLACK))

    when (setOf(WHITE, BLACK)) {
        setOf(BLACK, WHITE) -> println("black and white")
        setOf(BLUE) -> println("blue")
    }

    var a = true
    var b = false

    var x = 1;
    var y = 2;

    when {
        (1 > 2) || (b) -> println("true")
        (x < y) -> println("$x < $y ? = true")
        (x > y) -> println("$x > $y ? = false")
        (x == y) -> println("$x = $y ? = false")
        else -> println("else")
    }

    // Аналогичный код
    if ((1 > 2) || (b)) println("true")
    if (x < y) println("$x < $y ? = true")
    if (x > y) println("$x > $y ? = false")
    if (x == y) println("$x = $y ? = false")
    else println("else")
}

fun getFavoriteColor (color : Color) = when (color) {
    GREEN -> "зеленый"
    RED -> "красный"
    BLUE -> "голубой"
    WHITE, BLACK -> "белый или черный"

    else -> {
        "None"
    }
}