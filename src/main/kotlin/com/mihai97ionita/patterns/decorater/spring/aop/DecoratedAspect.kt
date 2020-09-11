package com.mihai97ionita.patterns.decorater.spring.aop

import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.springframework.context.annotation.Configuration


@Aspect
@Configuration
class DecoratedAspect {

    @After("@annotation(com.mihai97ionita.patterns.decorater.spring.aop.Decorated)")
    fun decorated(){
        println("DecoratedAspect here, executing After methodA() Advice")
    }
}