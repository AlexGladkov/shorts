package ru.shorts.models.remote

import kotlinx.serialization.Serializable
import ru.shorts.models.UserDTO
import java.util.*

@Serializable
data class RegisterRemote(
    val login: String,
    val password: String,
    val username: String,
    val bio: String
)

fun RegisterRemote.mapToUserDTO(): UserDTO =
    UserDTO(
        userId = UUID.randomUUID().toString(),
        username = username,
        login = login,
        password = password,
        bio = bio
    )
