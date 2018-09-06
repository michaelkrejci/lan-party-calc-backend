package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Tag(

    @Id
    @GeneratedValue
    var id: Long,

    var name: String
)