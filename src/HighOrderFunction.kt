// high order function is a function that takes a function as argument
// or returns a function.

//function type -> can be null with invoke function equal true
fun printFilteredString(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

//create a function that take a String parameter and then return a Boolean
val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

fun getPrintPredicate(): (String) -> Boolean {
    return {it.startsWith("J")}
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")
    printFilteredString(list, getPrintPredicate()) // -> call it as an argument
    printFilteredString(list, null)

}