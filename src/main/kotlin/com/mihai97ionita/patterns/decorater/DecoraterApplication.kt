package com.mihai97ionita.patterns.decorater

import com.mihai97ionita.patterns.decorater.simple.ConcreteMyComponent
import com.mihai97ionita.patterns.decorater.simple.ConcreteDecoratorMyComponent
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DecoraterApplication

fun main(args: Array<String>) {
	val myComponent: MyComponent = ConcreteMyComponent()
	val decoratedMyComponent: MyComponent = ConcreteDecoratorMyComponent(myComponent = myComponent)
	decoratedMyComponent.methodA()
	println("-------------------------------")
	println("Spring Context")
	runApplication<DecoraterApplication>(*args)
}
