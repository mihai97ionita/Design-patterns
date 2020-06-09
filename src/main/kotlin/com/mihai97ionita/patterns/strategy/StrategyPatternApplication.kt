package com.mihai97ionita.patterns.strategy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

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

	//Giving a implementation of lambda function ( Function0 )
	LambdaClient( LambdaImplementation() ).action()

	//NOT working with static functions, compiler error?
	//LambdaClient( StrategyPatternApplication::randomStaticFunction ).action()

	runApplication<StrategyPatternApplication>(*args)
}