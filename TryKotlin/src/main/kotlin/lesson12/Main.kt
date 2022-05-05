package lesson12

import lesson12.openexam.Driver
import lesson12.openexam.Person

fun main(args : Array<String>) {
    val person = Person("Person")
    val driver = Driver("Driver")

    println(person)
    println(driver)

    println(person.getAddress())
    println(driver.getAddress())
}