package com.mihai97ionita.patterns.strategy

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class StrategyPatternApplication{
	companion object {
		@JvmStatic
		fun randomStaticFunction() = println("I am randomStaticFunction")
	}
}
fun unOwnedFunction()= println("I am unOwnedFunction")

fun main(args: Array<String>) {

	GenericClient( PrintGenericStrategy() ).action()

	val anonymousGenericStrategy = object : IGenericStrategy {
		override fun action() = println("New strategy: innerIGenericStrategy")
	}
	GenericClient( anonymousGenericStrategy ).action()

	LambdaClient { println("Using lambdas with strategy pattern") }.action()

	//This is working somehow
	LambdaClient( LambdaImplementation() ).action()

	//This is working somehow
	LambdaClient{ unOwnedFunction() }.action()

	//NOT working with static functions
	//LambdaClient( StrategyPatternApplication::randomStaticFunction ).action()

	//runApplication<StrategyPatternApplication>(*args)
}