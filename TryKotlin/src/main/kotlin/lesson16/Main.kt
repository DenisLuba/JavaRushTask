package lesson16

fun main(args: Array<String>) {
    val person1 = Person("Alex", 24)
    val person2 = person1
    val person3 = person1.copy(age = 12)

    person1.age = 33

    println(person1)
    println(person2)
    println(person3)

//    **************************************************

    val (name) = person1 // только для data classes
    println("My name = $name")

    val (name1, age) = person1;
    println("My age = $age, name = $name1")

    var (name2, age2) = Person("Max", 56)
    println("My name = $name2, age = $age2")
}