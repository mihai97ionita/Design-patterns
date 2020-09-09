package com.mihai97ionita.patterns.singleton.spring

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class DoSomethingService(private val springStatelessSingleton: SpringStatelessSingleton) {

    @EventListener(ApplicationReadyEvent::class)
    fun onReady(){
        springStatelessSingleton.hello()
    }
}