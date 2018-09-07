package org.mk.lanparty.repository

import org.mk.lanparty.domain.Drink
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface DrinkRepository : JpaRepository<Drink, Long>, CrudRepository<Drink, Long>