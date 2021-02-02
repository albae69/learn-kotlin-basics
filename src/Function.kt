fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript", null, null)

    val map = list
        .filterNotNull() //filter list of non-null types
//        .filter {
//            it.startsWith("J") //filter list that start with j
//        }
//        .map {
//            it.length
//        } // can change data types
//        .takeLast(3) take last 3 of the list
        .associate { it to it.length }
        .forEach {
            println("${it.value} , ${it.key}")
        }

    val language = list.filterNotNull().findLast {it.startsWith("foo") }.orEmpty()
    println(language)
}