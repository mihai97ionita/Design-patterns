package com.mihai97ionita.patterns.factory.spring

import com.mihai97ionita.patterns.factory.spring.adoptable.AnimalAdoptFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class DoSomethingService(private val animalAdoptFactory: AnimalAdoptFactory) {

    @EventListener(ApplicationReadyEvent::class)
    fun onReady(){
        for ( i in 0..5)
            println(animalAdoptFactory.adoptAdoptableAnimal().getHello())
    }
}