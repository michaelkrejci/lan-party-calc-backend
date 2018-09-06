package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class User(
    @Id
    @GeneratedValue
    var id: Long,
    var username: String,
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var roomNumber: Int,
    @OneToMany
    var orders: List<Order>

)