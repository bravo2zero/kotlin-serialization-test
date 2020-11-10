package serialization.test

import kotlinx.serialization.Serializable

@Serializable
data class Model (
        val id : Int,
        val name: String
)
