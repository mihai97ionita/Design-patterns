package com.mihai97ionita.patterns.strategy

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class StrategyPatternApplication

fun main(args: Array<String>) {

	GenericClient(PrintGenericStrategy()).action()


	val anonymousIGenericStrategy = object : IGenericStrategy {
		override fun action() = println("New strategy: innerIGenericStrategy")
	}
	GenericClient(anonymousIGenericStrategy).action()


	//runApplication<StrategyPatternApplication>(*args)
}