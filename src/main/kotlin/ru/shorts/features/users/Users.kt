package ru.shorts.features.users

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import ru.shorts.models.UserDTO

object Users: Table(name = "Users") {
    private val userId = Users.varchar("userId", 200)
    private val login = Users.varchar("login", 50)
    private val password = Users.varchar("password", 50)
    private val username = Users.varchar("username", 100)
    private val bio = Users.varchar("bio", 500)

    fun insert(userDTO: UserDTO) {
        transaction {
            Users.insert {
                it[userId] = userDTO.userId
                it[login] = userDTO.login
                it[password] = userDTO.password
                it[username] = userDTO.username
                it[bio] = userDTO.bio
            }
        }
    }
}