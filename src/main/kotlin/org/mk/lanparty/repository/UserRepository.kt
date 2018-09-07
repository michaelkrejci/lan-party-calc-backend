package org.mk.lanparty.repository

import org.mk.lanparty.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface UserRepository : JpaRepository<User, Long>, CrudRepository<User, Long>