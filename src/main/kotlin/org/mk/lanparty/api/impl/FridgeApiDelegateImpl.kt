package org.mk.lanparty.api.impl

import org.mk.lanparty.api.FridgeApiDelegate
import org.mk.lanparty.model.InventoryItem
import org.mk.lanparty.model.Order
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class FridgeApiDelegateImpl : FridgeApiDelegate {
    override fun deleteOrder(orderId: Long?): ResponseEntity<Void> = TODO()

    override fun getInventory(): ResponseEntity<MutableList<InventoryItem>> = TODO()

    override fun getOrderById(orderId: Long?): ResponseEntity<Order> = TODO()

    override fun placeOrder(body: Order?): ResponseEntity<Order> = TODO()
}