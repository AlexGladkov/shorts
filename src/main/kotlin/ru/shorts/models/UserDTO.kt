package ru.shorts.models

data class UserDTO(
    val userId: String, val login: String, val password: String,
    val username: String,
    val bio: String
)
