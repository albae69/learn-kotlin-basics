interface IdProvider {
    fun getId(): String

}

class Entity private constructor(val id: String) {

    companion object Factory : IdProvider {
        override fun getId(): String {
            return "123"
        }

        const val id = "id"
        fun create() = Entity(getId())
    }
}

fun main() {

    val entity = Entity.Factory.create()
    Entity.id
}