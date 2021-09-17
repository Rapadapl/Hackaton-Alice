package com.justai.jaicf.profit.scenario

import com.justai.jaicf.model.scenario.Scenario
import sun.text.normalizer.UTF16.append

val MainScenario = Scenario {
    state("Start") {
        append(context = "AskForName", AskForNameScenario, modal = true)

        activators {
            intent("Hello")
        }