package org.mk.lanparty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LanPartyCalcBackendApplication

fun main(args: Array<String>) {
    runApplication<LanPartyCalcBackendApplication>(*args)
}
