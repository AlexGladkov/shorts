package ru.shorts.features.users

import ru.shorts.models.remote.RegisterRemote
import ru.shorts.models.remote.mapToUserDTO

class UsersController {

    fun registerUser(register: RegisterRemote) {
        Users.insert(register.mapToUserDTO())
    }
}