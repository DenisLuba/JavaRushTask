package lesson11

import lesson11.abstracts.ATemplate
import lesson11.abstracts.BaseTemplate

fun main() {
    var v1: BaseTemplate = ATemplate()
    v1.a()
    v1.minus()
    v1.a()
}