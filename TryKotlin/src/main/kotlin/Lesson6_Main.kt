fun main() {
    val person = Lesson6_Classes("Alex", "Smith", 30)
    println(person.age)
    println(person.lastName)
    println(person.firstName)

    val car = Lesson6_ObjectCar(9.5, 10)
    println(car.isNew)
    println()
    car.isNew = true
}