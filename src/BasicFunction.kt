//define a function with fun keywords
fun getGreeting(): String {
    return "Hello Kotlin" //created a function that return a value type of String
}

fun getGreetings() { // inferred type String
    return println("Hey im function")
}

fun sayHello(greet: String, name: String): Unit {
    return println("$greet, $name")
}

fun main() {
    println("Hello World!")
    println(getGreeting())
    getGreetings() //call the function method
    sayHello("Hay ", "Bae")
}

