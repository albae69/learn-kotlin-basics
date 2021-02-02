//automatically createa a block of class Person,
//give it a default parameter on it constructor
// read-only properties, do not have a setter but have a getter
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {

    //add a new
    var nickName: String? = null // using var, doesnt need to initialize a value at first.

        //    give a setter -> check if setter get called
        set(value) {
            field = value
            println("the new nickname is $value")
        }


//    method
    fun printInfo() {
        val nicknameToPrint = nickName ?: "no nickname "
        println("$firstName ($nicknameToPrint) $lastName")
    }
}