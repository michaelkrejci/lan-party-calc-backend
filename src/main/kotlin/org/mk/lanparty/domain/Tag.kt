package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Tag(

    @Id
    @GeneratedValue
    val id: Long,

    val name: String
)