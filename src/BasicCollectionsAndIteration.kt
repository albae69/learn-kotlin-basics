//fun main() {
//    val interestingThings = arrayOf("Dota 2", "Programming", "One Piece") // basic array
////    println(interestingThings) -> print where the array saved on memory
//    println("interest things has a ${interestingThings.size} length") // print size / length of an array
//    println(interestingThings[0]) // call individual value of an array with index
//    println(interestingThings.get(1)) // call individual value of an array with index
//
//    // for loops
//    //    for (interestThing in interestingThings) {
//    //        println("looping $interestThing")
//    //    }
//
//    //for each
//    interestingThings.forEach { s: String -> println(s) } // print each value of array with parameter s lambda / arrow function syntax
//    interestingThings.forEachIndexed { index,s  ->
//        println("$s is at index $index")
//    } // print each value of array with parameter s lambda / arrow function syntax
//
//}
//


//list of
//fun main() {
//    val interestingThings = listOf("Dota 2", "Programming", "One Piece")
//    interestingThings.forEach {it -> println(it)}
//}

//map of
//fun main() {
//    val interestingThings = listOf("Dota 2", "Programming", "One Piece")
//
//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { key, value -> println("$key -> $value") }
//}

//by default, collections of kotlin are immutable -> can't get any function to change data after defined.
//change it into mutable to modify the collection.
fun main() {
    val interestingThings = mutableListOf("Dota 2", "Programming", "One Piece")
    interestingThings.add("Cat") //with mutableListOf you get a function to add value into a collection
    println(interestingThings)

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c") //with mutableMapOf you get a function to add value into a collection
    map.put(4, "c")
    println(map)
}
