package ru.shorts

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.name
import ru.shorts.plugins.*
import ru.shorts.routings.configureLoginRouting

fun main() {
    Database.connect("jdbc:postgresql://localhost:5433/shorts", driver = "org.postgresql.Driver",
        user = "postgres", password = "BsR3z3n5")

    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureLoginRouting()
        configureSerialization()
        configureSecurity()
    }.start(wait = true)
}
