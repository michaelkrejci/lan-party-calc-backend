package org.mk.lanparty.domain

import java.time.OffsetDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "order_table")
data class Order(
    @Id
    @GeneratedValue
    var id: Long,

    @ManyToOne
    var drink: InventoryItem,

    var quantity: Int,

    var shipDate: OffsetDateTime
)