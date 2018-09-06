package org.mk.lanparty.domain

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.MapsId
import javax.persistence.OneToOne

@Entity
data class InventoryItem(

    @Id
    var id: Long,

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    var drink: Drink,

    var quantity: Int
)