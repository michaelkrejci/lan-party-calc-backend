package org.mk.lanparty.api.impl

import org.mk.lanparty.api.DrinkApiDelegate
import org.mk.lanparty.model.Drink
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class DrinkApiDelegateImpl : DrinkApiDelegate {
    override fun deleteDrink(drinkId: Long?): ResponseEntity<Void> = TODO()

    override fun getDrinks(): ResponseEntity<MutableList<Drink>> = TODO()

    override fun postDrink(): ResponseEntity<Drink> = TODO()

    override fun putDrink(): ResponseEntity<Drink> = TODO()
}
