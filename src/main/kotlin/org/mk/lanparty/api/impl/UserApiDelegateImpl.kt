package org.mk.lanparty.api.impl

import org.mk.lanparty.api.UserApiDelegate
import org.mk.lanparty.model.User
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserApiDelegateImpl : UserApiDelegate {
    override fun createUser(body: User?): ResponseEntity<Void> = TODO()

    override fun createUsersWithListInput(body: MutableList<User>?): ResponseEntity<Void> = TODO()

    override fun deleteUser(username: String?): ResponseEntity<Void> = TODO()

    override fun getUserByName(username: String?): ResponseEntity<User> = TODO()

    override fun loginUser(username: String?, password: String?): ResponseEntity<String> = TODO()

    override fun logoutUser(): ResponseEntity<Void> = TODO()

    override fun updateUser(username: String?, body: User?): ResponseEntity<Void> = TODO()
}