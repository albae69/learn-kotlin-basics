// top local variable
val greeting: String = "Hello"

//you can make your variable value into null with ? mark.
//val height : Number = null -> null can't be a value of a type non-null.
//val height : Number = 172 -> or you can set the actual value.
var height : Number? = null

//kotlin can infered the types of variable
//var rig = "Dell" //kotlin infered types of a String
var rig: String? = "Dell" //kotlin infered types of a String

fun main() {
//    there two types of variable on kotlin.
//    use var if you want to reassign the value.
//    use val if you want to set value once / can't be reassign.
//    local variable
    val name: String = "Bae" //this is a variable with type String.
    // name = "haqi" -> error, val can't be reassign.

    var age: Number = 20 //this is a variable with type Number.
    age = 21 // -> var can be reassign.
    height = 172
//    rig = null  -> can't reassign type of non-null String
    rig = "Macbook Pro M1"
    rig = null //cause you used ? mark on rig variable, u can set it into null

    println("$greeting, my name is $name i'am $age years old.") //$ sign used to call a variable on string / string literal.
    println("my height is $height cm")
    println("i hope i can afford $rig in this year")
}