package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.MapsId
import javax.persistence.OneToOne

@Entity
data class InventoryItem(

    @Id
    val id: Long,

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    val drink: Drink,

    val quantity: Int
)