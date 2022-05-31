package lesson16

// ключевое слово data позволяет генерировать по умолчанию такие методы как
// toString(), equals(), hashCode() и copy()
// в конструкторе должен быть указан хоть один параметр,
// параметры должны быть обозначены var или val

// data classes не могут быть open, abstract, sealed и внутренними
data class Person(val name: String, var age: Int) {

}