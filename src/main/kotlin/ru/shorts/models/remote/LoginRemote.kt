package ru.shorts.models.remote

import kotlinx.serialization.Serializable

@Serializable
data class LoginRemote(val login: String, val password: String)

@Serializable
data class LoginResponseRemote(val token: String)
