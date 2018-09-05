package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Drink(

    @Id
    @GeneratedValue
    var id: Long,

    var name: String,

    @OneToMany
    var tags: List<Tag>

)