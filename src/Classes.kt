fun main() {
//not needed a new keyword for Person() class
//create a person variable of Person class
    val person = Person()
    println(person.firstName) // acces a object of Person class syntax
    println(person.lastName)
//    mutable property that can modified
    person.nickName = "geez"
    person.printInfo() // called a method
}