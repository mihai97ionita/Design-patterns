package com.mihai97ionita.patterns.strategy

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringConfiguration {

    @Bean
    fun printGenericStrategy()= PrintGenericStrategy()

    @Bean
    fun anonymousGenericStrategy()=
            object : IGenericStrategy {
                override fun action() = println("anonymousGenericStrategy here")
            }

    @Bean
    fun amazingFunction() : Function0<Unit> = { println("amazingFunction here") }
}