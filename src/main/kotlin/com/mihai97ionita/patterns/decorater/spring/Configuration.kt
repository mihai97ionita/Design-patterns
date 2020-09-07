package com.mihai97ionita.patterns.decorater.spring

import com.mihai97ionita.patterns.decorater.MyComponent
import com.mihai97ionita.patterns.decorater.simple.ConcreteDecoratorMyComponent
import com.mihai97ionita.patterns.decorater.simple.ConcreteMyComponent
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean
    fun myComponent(): MyComponent = ConcreteMyComponent()

    @Bean
    fun concreteDecoratorMyComponent(): MyComponent = ConcreteDecoratorMyComponent(ConcreteMyComponent())
}