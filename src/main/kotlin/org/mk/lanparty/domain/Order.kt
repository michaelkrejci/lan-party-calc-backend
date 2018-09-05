package org.mk.lanparty.domain

import java.time.OffsetDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Order(
    @Id
    @GeneratedValue
    val id: Long,

    @ManyToOne
    val drink: InventoryItem,

    val quantity: Int,

    val shipDate: OffsetDateTime
)