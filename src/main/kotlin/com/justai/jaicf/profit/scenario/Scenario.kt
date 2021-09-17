package com.justai.jaicf.profit.scenario

import com.justai.jaicf.channel.yandexalice.model.AliceEvent
import com.justai.jaicf.channel.yandexalice.model.AliceIntent
import com.justai.jaicf.model.scenario.Scenario

object Scenario : Scenario() {
    init {

        state("main") {

            activators {
                event(AliceEvent.START)
                intent(AliceIntent.HELP)
            }
            action {
                reactions.say("Fuck niggers")
            }
        }

    }
}