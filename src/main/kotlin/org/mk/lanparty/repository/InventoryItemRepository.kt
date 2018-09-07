package org.mk.lanparty.repository

import org.mk.lanparty.domain.InventoryItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface InventoryItemRepository : JpaRepository<InventoryItem, Long>, CrudRepository<InventoryItem, Long>