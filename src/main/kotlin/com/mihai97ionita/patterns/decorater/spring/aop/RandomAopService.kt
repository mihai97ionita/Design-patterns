package com.mihai97ionita.patterns.decorater.spring.aop

import com.mihai97ionita.patterns.decorater.MyComponent
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class RandomAopService(private val annotatedMyComponent: MyComponent) {

    @EventListener(ApplicationReadyEvent::class)
    fun onApplicationReadyEvent(){
        annotatedMyComponent.methodA()
    }
}