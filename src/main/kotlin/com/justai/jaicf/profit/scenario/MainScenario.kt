package com.justai.jaicf.profit.scenario

import com.justai.jaicf.channel.yandexalice.activator.alice
import com.justai.jaicf.model.scenario.Scenario

object MainScenario : Scenario() {

    init {

        state("fuck") {
            activators {
                intent("SAY.FUCK")
            }
            action {
                activator.alice?.run {
                    val who = slots["who"]

                    reactions.say("Fuck" + who.toString())
                }
            }
            fallback {
                reactions.say("Fuck who?")
            }
        }

        fallback {
            reactions.say(
                "Я не понимаю"
                         )
        }
    }
}