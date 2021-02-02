//var arg parameter -> pass an value after initialized
//fun sayHello(greeting: String, vararg itemsToGreet: String) {
//    itemsToGreet.forEach { items ->
//        println("$greeting $items")
//    }
//}

//fun main() {
//    sayHello("Hi", "Kotlin", "Programming", "Cat") //vararg treated as list of argument
//    instead hardcode the array, expect -> get an array data from api, you can pass an array into vararg parameter
//    but you should add a spread operator ( * ) , if not the program will throw an error
//    val interestingThings = arrayOf("Kotlin", "Programming", "Cat")
//    sayHello("Hi", *interestingThings) //vararg treated as list of argument
//
//}

//fun greetPerson(greeting: String, name: String) = println("$greeting $name")

//fun main() {
//    standart passing value into function parameter
//    greetPerson("hi", "bae")]

//    you can change order parameter value explicitly
//    greetPerson(name="bae",greeting = "hi")
//}

//give a default parameter value
fun greetPerson(greeting: String = "Hi", name: String = "Bae") = println("$greeting $name")

fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { items ->
        println("$greeting $items")
    }
}


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Cat")
    sayHello("Hi", itemsToGreet = *interestingThings)
}