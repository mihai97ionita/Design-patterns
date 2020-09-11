package com.mihai97ionita.patterns.decorater.spring.aop

import com.mihai97ionita.patterns.decorater.MyComponent
import org.springframework.stereotype.Component

@Component
class AnnotatedMyComponent(private val myComponent: MyComponent): MyComponent() {

    @Decorated
    override fun methodA() {
        myComponent.methodA()
        println("Here is ${this::class.java.simpleName}")
    }
}