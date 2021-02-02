fun main() {
    val interestingThings = arrayOf("Dota 2", "Programming", "One Piece") // basic array
//    println(interestingThings) -> print where the array saved on memory
    println("interest things has a ${interestingThings.size} length") // print size / length of an array
    println(interestingThings[0]) // call individual value of an array with index
    println(interestingThings.get(1)) // call individual value of an array with index

    // for loops
    //    for (interestThing in interestingThings) {
    //        println("looping $interestThing")
    //    }

    //for each
//    interestingThings.forEach { s: String -> println(s) } // print each value of array with parameter s lambda / arrow function syntax
    interestingThings.forEachIndexed { index,s  ->
        println("$s is at index $index")
    } // print each value of array with parameter s lambda / arrow function syntax

}
