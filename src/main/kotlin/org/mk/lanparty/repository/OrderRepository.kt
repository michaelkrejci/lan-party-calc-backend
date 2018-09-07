package org.mk.lanparty.repository

import org.mk.lanparty.domain.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface OrderRepository : JpaRepository<Order, Long>, CrudRepository<Order, Long>