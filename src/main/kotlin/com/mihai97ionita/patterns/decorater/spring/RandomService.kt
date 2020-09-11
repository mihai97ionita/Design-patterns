package com.mihai97ionita.patterns.decorater.spring

import com.mihai97ionita.patterns.decorater.MyComponent
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class RandomService(private val concreteDecoratorMyComponent: MyComponent) {

    @EventListener(ApplicationReadyEvent::class)
    fun onInit(){
        concreteDecoratorMyComponent.methodA()
    }
}