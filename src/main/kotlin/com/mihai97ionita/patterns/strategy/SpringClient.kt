package com.mihai97ionita.patterns.strategy


import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class SpringClient(private val printGenericStrategy: IGenericStrategy,
                   private val anonymousGenericStrategy: IGenericStrategy,
                   private val amazingFunction: Function0<Unit>) {

    fun action1()= printGenericStrategy.action()

    fun action2()= anonymousGenericStrategy.action()

    fun action3()= amazingFunction()

    @EventListener(ApplicationReadyEvent::class)
    fun test(){
        println("From spring context from now on..")
        this.action1()
        this.action2()
        this.action3()
    }
}