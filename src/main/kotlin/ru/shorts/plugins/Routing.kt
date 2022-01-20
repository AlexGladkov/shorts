package ru.shorts.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import ru.shorts.models.remote.MessageRemote

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/messages") {
            call.respond(
                listOf(
                    MessageRemote(messageId = "1", messageText = "Test Text"),
                    MessageRemote(messageId = "2", messageText = "Test Text 2")
                )
            )
        }
    }
}
