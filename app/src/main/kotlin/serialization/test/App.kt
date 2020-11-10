package serialization.test

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main(args: Array<String>) {

    val list = listOf(
            Model(1,"one"),
            Model(2,"two"),
            Model(3,"three"),
            Model(4,"four"),
            Model(5,"five")
    )
    println(Json.encodeToString<List<Model>>(list))
}
