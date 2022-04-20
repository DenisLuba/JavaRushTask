package lesson7.animals

import lesson7.animals.cat.CatA
import lesson7.animals.cat.CatB
import lesson7.animals.*

fun main(args: Array<String>) {
    val catA = CatA()
    catA.a1()
    CatB().b1()
    superMethod()
    superMethod2()
}