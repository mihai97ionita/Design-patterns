package com.mihai97ionita.patterns.singleton

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDateTime

@SpringBootApplication
class SingletonApplication

fun main(args: Array<String>) {
	JavaStatelessSingleton.provide().hello()
	KotlinStatelessSingleton.hello()
	println("Current state is ${JavaStatefulSingleton.getSingletonState()}")
	Thread().run {
		 JavaStatefulSingleton.provide()
				.also { println("Instance provided at ${LocalDateTime.now()}") }
	}

	var notChanged = true
	while (notChanged){
		JavaStatefulSingleton.getSingletonState()
				.takeIf { it == StatefulSingleState.PROVIDED }
				.also { println("State changed in main thread to $it at ${LocalDateTime.now()}") }
				.also { notChanged = false }
	}
	runApplication<SingletonApplication>(*args)
}
