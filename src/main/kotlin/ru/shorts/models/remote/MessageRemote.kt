package ru.shorts.models.remote

import kotlinx.serialization.Serializable

@Serializable
data class MessageRemote(
    val messageId: String,
    val messageText: String
)
