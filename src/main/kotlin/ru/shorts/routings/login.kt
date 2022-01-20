package ru.shorts.routings

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.shorts.features.users.UsersController
import ru.shorts.models.remote.LoginRemote
import ru.shorts.models.remote.LoginResponseRemote
import ru.shorts.models.remote.RegisterRemote

fun Application.configureLoginRouting() {

    routing {
        post("/login") {
            call.receive<LoginRemote>()
            call.respond(LoginResponseRemote("Some token"))
        }

        post("/register") {
            val registerRemote = call.receive<RegisterRemote>()
            val usersController = UsersController()
            usersController.registerUser(registerRemote)
            call.respond(LoginResponseRemote("Some Token"))
        }
    }
}