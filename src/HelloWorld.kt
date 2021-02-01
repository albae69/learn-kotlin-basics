// top local variable
var greeting: String? = null;
val name: String = "Bae"

//kotlin allowed you to not use a semicolon (;)

//you can make your variable value into null with ? mark.
//val height : Number = null -> null can't be a value of a type non-null.
//val height : Number = 172 -> or you can set the actual value.
//var height: Number? = null

//kotlin can infered the types of variable
//var rig = "Dell" //kotlin infered types of a String
//var rig: String? = "Dell" //kotlin infered types of a String

fun main() {
//    there two types of variable on kotlin.
//    use var if you want to reassign the value.
//    use val if you want to set value once / can't be reassign.
//    local variable
//    val name: String = "Bae" //this is a variable with type String.
    // name = "haqi" -> error, val can't be reassign.

//    var age: Number = 20 //this is a variable with type Number.
//    age = 21 // -> var can be reassign.
//    height = 172
//    rig = null  -> can't reassign type of non-null String
//    rig = "Macbook Pro M1"
//    rig = null //cause you used ? mark on rig variable, u can set it into null

//    greeting = null
//    if (greeting != null) {
//        println("$greeting, my name is $name i'am $age years old.") //$ sign used to call a variable on string / string literal.
//    } // if else statement
//    else {
//        greeting = "Hi"
//        println("$greeting, my name is $name i'am $age years old.")
//
//    }

//    println("my height is $height cm")
//    println("i hope i can afford $rig in this year")

//    greeting = "Hello"
//    when (greeting) {
//        null -> println("Hi")
//        else -> println(greeting)
//    }

    val greetingToPrint = if (greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}